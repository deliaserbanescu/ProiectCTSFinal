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
import designPatterns.StrategyCatalog;
import designPatterns.ObserverElev;
import designPatterns.FacadeColegiu;
import designPatterns.FacadeGrupScolar;
import designPatterns.FacadeLiceu;
import designPatterns.StrategyModalitateNotare;
import designPatterns.PrototypeNivelCache;
import designPatterns.PrototypeNivel;
import designPatterns.ObserverNotificare;
import designPatterns.SingletonPrelucrareElevi;
import designPatterns.Adapter;
import designPatterns.AdapterF;
import designPatterns.DecoratorElevS;
import designPatterns.DecoratorFotbal;
import designPatterns.StrategyAnCurent;
import designPatterns.StrategyAnPrecedent;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			
		//Singleton
			System.out.println("Singleton");
	          AdresaIndivid a = new AdresaIndivid("Bucuresti", "Mihai Viteazu", 2);
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
	  		  
	  		  SingletonPrelucrareElevi prelElevi = SingletonPrelucrareElevi.getInstance();
	  		  prelElevi.adaugaElev(e1);
	  		  prelElevi.adaugaElev(e2);
	  		  SingletonPrelucrareElevi prelElevi2 = SingletonPrelucrareElevi.getInstance();
			  prelElevi2.setListaElevi(listaElevi);

			  System.out.println(prelElevi.getListaElevi());
			  
		//Decorator
			  	System.out.println("\nDecorator");
			  	DecoratorElevS de = new DecoratorElevS("Dans");
			  	DecoratorFotbal df = new DecoratorFotbal(de);
				
				System.out.println(df.getHobby());
			
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
				PrototypeNivelCache.loadCache();
				PrototypeNivel cloneNivel = PrototypeNivelCache.getNivel("NL");
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
				
		//Observer
				System.out.println("\nObserver");
				ObserverNotificare no1 = new ObserverNotificare();
				ObserverNotificare no2 = new ObserverNotificare();
				
				ObserverElev elev1 = new ObserverElev(no1);
				ObserverElev elev2 = new ObserverElev(no2);
				
				no1.anuleazaInregistrare(elev1);
				no2.anuleazaInregistrare(elev2);
				no2.adaugaNotificare("Se apropie sfasitul anului scolar!");
				//System.out.println(elev1.toString());
				
		//Strategy
				System.out.println("\nStrategy");	
				StrategyCatalog cs = new StrategyCatalog();
				
				cs.adaugaNota(e2);
				cs.adaugaNota(e1);
								
				StrategyModalitateNotare curent = new StrategyAnCurent("Ion");
				cs.noteaza(curent);
				
				StrategyModalitateNotare precedent = new StrategyAnPrecedent("Pop");
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
