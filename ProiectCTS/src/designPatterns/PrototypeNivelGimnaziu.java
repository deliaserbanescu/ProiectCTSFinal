package designPatterns;

public class PrototypeNivelGimnaziu extends PrototypeNivel {

	public PrototypeNivelGimnaziu(String tip) {
		this.setTip(tip);
	}
	
	@Override
	public void alegereNivel() {
		System.out.println(" Nivelul este Gimnaziu ");	
	}
}
