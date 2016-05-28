package designPatterns;

import java.util.ArrayList;
import java.util.List;

import clase.Elev;

//Singleton

public class SingletonPrelucrareElevi {
	List<Elev> listaElevi;
	private static SingletonPrelucrareElevi instanta= null;
	
	private SingletonPrelucrareElevi(){
		this.listaElevi = new ArrayList<Elev>();
	}
	
	public static SingletonPrelucrareElevi getInstance(){
		
		if(instanta == null){
			instanta = new SingletonPrelucrareElevi();
		}
		return instanta;
	}
	
	public void adaugaElev(Elev elev){
		if(!"".equalsIgnoreCase(elev.getNume())){
			this.listaElevi.add(elev);	
		}else{
			System.out.println("Elevul pe care incercati sa il introduceti nu este valid");
		}		
	}

	public List<Elev> getListaElevi() {
		return listaElevi;
	}

	public void setListaElevi(List<Elev> listaElevi) {
		this.listaElevi = listaElevi;
	}
}
