package designPatterns;

public class PrototypeNivelLiceu extends PrototypeNivel {

	public PrototypeNivelLiceu(String tip) {
		this.setTip(tip);
	}
	
	@Override
	public void alegereNivel() {
		System.out.println(" Nivelul este Liceu ");	
	}
}
