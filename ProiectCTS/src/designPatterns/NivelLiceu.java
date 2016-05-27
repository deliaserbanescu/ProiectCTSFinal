package designPatterns;

public class NivelLiceu extends NivelPrototype {

	public NivelLiceu(String tip) {
		this.setTip(tip);
	}
	
	@Override
	public void alegereNivel() {
		System.out.println(" Nivelul este Liceu ");	
	}
}
