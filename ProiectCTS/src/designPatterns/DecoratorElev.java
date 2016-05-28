package designPatterns;

public class DecoratorElev extends DecoratorElevAbstract {
	protected final DecoratorElevAbstract elev;
	
	public DecoratorElev(DecoratorElevAbstract elev) {
		super();
		this.elev = elev;
	}

	@Override
	public String getHobby() {
		return elev.getHobby();
	}
}
