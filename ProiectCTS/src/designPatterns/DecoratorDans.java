package designPatterns;

public class DecoratorDans extends DecoratorElev {

	public DecoratorDans(DecoratorElevAbstract elev) {
		super(elev);		
	}
	
	@Override
	public String getHobby(){
		return super.getHobby() + " dans";
	}
}
