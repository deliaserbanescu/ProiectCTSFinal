package designPatterns;

public interface ObserverMaterie {
	public void inregistreaza(Observer observer);
	public void anuleazaInregistrare(Observer observer);
	public void notifica();
	public String obtineUltimulAnunt(Observer observer);
}
