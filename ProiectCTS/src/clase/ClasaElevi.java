package clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClasaElevi {    //util pentru Composite
	protected int cod;
	protected List<Elev> eleviDinClasa = new ArrayList<Elev>();
	public ClasaElevi(){}

	public ClasaElevi(int cod, List<Elev> eleviDinClasa) {
		this.cod = cod;
		this.eleviDinClasa = eleviDinClasa;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public List<Elev> getEleviDinClasa() {
		return eleviDinClasa;
	}

	public void setEleviDinClasa(List<Elev> eleviDinClasa) {
		this.eleviDinClasa = eleviDinClasa;
	}
	
	public void adaugareElevi(Elev elev){
		eleviDinClasa.add(elev);
	}
	
	public void eliminareElevi(Elev elev){
		eleviDinClasa.remove(elev);
	}
	
	public void print(){
		Iterator<Elev> iterator = eleviDinClasa.iterator();
		while(iterator.hasNext()){
			Elev elev = (Elev) iterator.next();
			elev.print();
		}
	}
}
