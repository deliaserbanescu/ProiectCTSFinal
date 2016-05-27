package designPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import clase.ListaProfesori;
import clase.Profesori;

public class Adapter implements ListaProfesori{
	String[][] profesori;
	
	public Adapter(Profesori p){
		profesori = p.getProfesori();
	}
	
	@Override
	public List<String> getListaProfesori() {
		List<String> listaProfesori = new ArrayList<String>();
		for(String[] profesor:profesori){
			listaProfesori.addAll(Arrays.asList(profesor));
		}
		return listaProfesori;
	}
	

}
