package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import clase.AdresaIndivid;
import clase.ClasaElevi;
import clase.Elev;
import clase.Individ;
import clase.ListaProfesori;
import clase.Profesori;
import designPatterns.CatalogStrategy;
import designPatterns.ElevObserver;
import designPatterns.FacadeColegiu;
import designPatterns.FacadeGrupScolar;
import designPatterns.FacadeLiceu;
import designPatterns.HobbyDans;
import designPatterns.HobbyExtraDecorator;
import designPatterns.HobbySport;
import designPatterns.IHobby;
import designPatterns.ModalitateNotareStrategy;
import designPatterns.NivelCache;
import designPatterns.NivelPrototype;
import designPatterns.NotificareObserver;
import designPatterns.PrelucrareEleviSingleton;
import designPatterns.Adapter;
import designPatterns.AdapterF;
import designPatterns.AnCurentStrategy;
import designPatterns.AnPrecedentStrategy;
import designPatterns.RepartizareFacade;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			
		//Singleton
			System.out.println("Singleton");
	          AdresaIndivid a = new AdresaIndivid("Bucuresti", "Mihai Viteazu", "2");
	          Individ i = new Individ("Ionescu Maria",
	                  a, 20, new SimpleDateFormat("dd.MM.yyyy").parse("10.10.1996"));
	          Individ i2=(Individ)i.clone();
	          i2.setNume("Ionescu Dan");
	          i2.getAdresa().setLocalitate("Brasov");
	          i2.setDataNIndivid(new SimpleDateFormat("dd.MM.yyyy").parse("11.04.1998 "));
	                   
	          Elev e1=new Elev(i, 10, 8.5);
	          Elev e2=new Elev(i2, 11, 9.5);
		
	  		  List<Elev> listaElevi = new ArrayList<Elev>();
	  		  listaElevi.add(e1);
	  		  listaElevi.add(e2);
	  		  
	  		  PrelucrareEleviSingleton prelElevi = PrelucrareEleviSingleton.getInstance();
	  		  prelElevi.adaugaElev(e1);
	  		  prelElevi.adaugaElev(e2);
	  		  PrelucrareEleviSingleton prelElevi2 = PrelucrareEleviSingleton.getInstance();
			  prelElevi2.setListaElevi(listaElevi);

			  System.out.println(prelElevi.getListaElevi());
			  
		//Decorator
			  System.out.println("Decorator");
			  IHobby hobby1 = new HobbyDans();
			  IHobby hobby2 = new HobbySport();
			  IHobby hobbyED = new HobbyExtraDecorator(new HobbyDans());
				
				hobby1.alegereHobby();
				hobby2.alegereHobby(); 
				hobbyED.alegereHobby();
				e1.setHobby(hobby1);
				System.out.println(e1);
				
		//Composite
				System.out.println("\nComposite");
				ClasaElevi clasa = new ClasaElevi();
				clasa.setCod(1);
				clasa.adaugareElevi(e1);
				clasa.adaugareElevi(e2);
				
				Elev e3=new Elev(i2, 9, 8);
				e3.setNume("Pop Andrei");
				clasa.adaugareElevi(e3);
				
				clasa.print();
				System.out.println("Dupa eliminare: ");
				clasa.eliminareElevi(e2);
				clasa.print();
				
		//Prototype
				System.out.println("\nPrototype");
				NivelCache.loadCache();
				NivelPrototype cloneNivel = NivelCache.getNivel("NL");
				System.out.println("Informatii despre nivel:");
				cloneNivel.alegereNivel();
		
		//Facade
				System.out.println("\nFacade");
				
				FacadeColegiu fC = new FacadeColegiu();
				FacadeLiceu fL=new FacadeLiceu();
				FacadeGrupScolar fGS = new FacadeGrupScolar();
				
				fC.admis();
				fL.respins();
				fGS.respins();
				
				
				
				RepartizareFacade repartizare = new RepartizareFacade(fL, fC, fGS);
				//repartizare.repartizareC();
				
		//Observer
				System.out.println("\nObserver");
				NotificareObserver no1 = new NotificareObserver();
				NotificareObserver no2 = new NotificareObserver();
				
				ElevObserver elev1 = new ElevObserver(no1);
				ElevObserver elev2 = new ElevObserver(no2);
				
				no1.anuleazaInregistrare(elev1);
				no2.anuleazaInregistrare(elev2);
				no2.adaugaNotificare("Se apropie sfasitul anului scolar!");
				
		//Strategy
				System.out.println("\nStrategy");	
				CatalogStrategy cs = new CatalogStrategy();
				
				cs.adaugaNota(e2);
				cs.adaugaNota(e1);
								
				ModalitateNotareStrategy curent = new AnCurentStrategy("Ion");
				cs.noteaza(curent);
				
				ModalitateNotareStrategy precedent = new AnPrecedentStrategy("Pop");
				cs.noteaza(precedent);
				
		//Adapter
				System.out.println("\nAdapter");	
				ListaProfesori l= new Adapter(new Profesori());
				AdapterF aF = new AdapterF(l);
				aF.afiseazaProfesori();
				
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}
}
