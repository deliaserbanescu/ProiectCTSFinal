package designPatterns;

public class HobbyExtraDecorator extends HobbyDecorator {

	public HobbyExtraDecorator(IHobby hobby) {
		super(hobby);
		}

	public void alegereHobby(){
		System.out.println("\n \n");
		hobbyDecorator.alegereHobby();
		System.out.println("--- se adauga extraDecorator ");
	}


}
