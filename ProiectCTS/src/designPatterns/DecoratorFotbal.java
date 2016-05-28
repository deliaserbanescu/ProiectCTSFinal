package designPatterns;

public class DecoratorFotbal extends DecoratorElev {

	public DecoratorFotbal(DecoratorElevAbstract elev) {
		super(elev);		
	}
	
	@Override
	public String getHobby(){
		return super.getHobby() + " fotbal";
	}
}
