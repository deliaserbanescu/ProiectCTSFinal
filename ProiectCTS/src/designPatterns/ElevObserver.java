package designPatterns;

public class ElevObserver implements Observer {
	MaterieObserver m;
	
	public ElevObserver(MaterieObserver m) {
		this.m = m;
		this.m.inregistreaza(this);
	}
		
	@Override
	public void actualizeaza() {
		System.out.println("\n !!Notificare noua!!");
		System.out.println("Notificarea este: "+ m.obtineUltimulAnunt(this));
		
	}

}
