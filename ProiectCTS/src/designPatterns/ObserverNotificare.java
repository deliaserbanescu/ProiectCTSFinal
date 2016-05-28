package designPatterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverNotificare implements ObserverMaterie {
	private List<Observer> obs;
	ArrayList<String> notificari = new ArrayList<String>();
	String ultimulAnunt;
		
	public ObserverNotificare() {
		obs = new ArrayList<Observer>();
	}

	public void adaugaNotificare(String notificare){
		notificari.add(notificare);
		ultimulAnunt = notificare;
		notifica();
	}
	
	@Override
	public void inregistreaza(Observer o) {
		if(obs != null && !obs.contains(o)){
			obs.add(o);	
		}
	}

	@Override
	public void anuleazaInregistrare(Observer o) {
		obs.remove(o);
	}

	@Override
	public void notifica() {
		for(Observer o:obs){
			o.actualizeaza();
		}
	}

	@Override
	public String obtineUltimulAnunt(Observer o) {
		return ultimulAnunt;
	}
	
}
