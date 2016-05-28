package designPatterns;

public class ObserverElev implements Observer {
	ObserverMaterie m;
	
	public ObserverElev(ObserverMaterie m) {
		this.m = m;
		this.m.inregistreaza(this);
	}
		
	@Override
	public void actualizeaza() {
		System.out.println("\n !!Notificare noua!!");
		System.out.println("Notificarea este: "+ m.obtineUltimulAnunt(this));
		
	}

}
