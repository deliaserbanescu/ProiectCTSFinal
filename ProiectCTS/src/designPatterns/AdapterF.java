package designPatterns;

import java.util.List;

import clase.ListaProfesori;

public class AdapterF {
	private ListaProfesori listaProfesori;	
	
	public AdapterF(ListaProfesori listaProfesori) {
		super();
		this.listaProfesori = listaProfesori;
	}

	public void afiseazaProfesori(){
		List<String> profesori = listaProfesori.getListaProfesori();
		System.out.println("Lista profesori: ");
		
		for(String profesor:profesori){
			System.out.println(profesor);
		}
	}
}
