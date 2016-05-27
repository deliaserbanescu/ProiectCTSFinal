package designPatterns;

public class AnPrecedentStrategy implements ModalitateNotareStrategy {
	String nume;
		
	public AnPrecedentStrategy(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public void s(int suma) {
		System.out.println("Suma mediilor anului precedent este: "+ suma);
	}

}
