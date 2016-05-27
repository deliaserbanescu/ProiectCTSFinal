package designPatterns;

public class HobbyDecorator  implements IHobby{
		protected IHobby hobbyDecorator;
		
		public HobbyDecorator(IHobby hobby) {
			this.hobbyDecorator = hobby;
		}

		@Override
		public void alegereHobby() {
			hobbyDecorator.alegereHobby();
			
		}
}
