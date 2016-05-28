package designPatterns;

import java.util.ArrayList;
import java.util.List;

import clase.Elev;

public class StrategyCatalog {
	List<Elev> listaNote = new ArrayList<Elev>();
	
	public void adaugaNota(Elev e){
		listaNote.add(e);
	}
	
	public int sumaMedii(){
		int suma=0;
		for(Elev e:listaNote){
			suma+= e.getMedia();
		}
		return suma;
	}
	
	public void noteaza(StrategyModalitateNotare mn){
		mn.s(sumaMedii());
	}


}
