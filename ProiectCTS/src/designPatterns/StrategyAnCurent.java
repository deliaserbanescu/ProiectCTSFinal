package designPatterns;

public class StrategyAnCurent implements StrategyModalitateNotare {

	String nume;
	
	public StrategyAnCurent(String nume) {
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
		System.out.println("Suma mediilor anului actual este: "+suma);
		
	}

}
