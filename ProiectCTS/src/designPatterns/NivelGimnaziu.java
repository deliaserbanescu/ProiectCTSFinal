package designPatterns;

public class NivelGimnaziu extends NivelPrototype {

	public NivelGimnaziu(String tip) {
		this.setTip(tip);
	}
	
	@Override
	public void alegereNivel() {
		System.out.println(" Nivelul este Gimnaziu ");	
	}
}
