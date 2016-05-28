package designPatterns;

public class DecoratorElevS extends DecoratorElevAbstract
{		
		public DecoratorElevS(String nume){	
			this.nume = nume;
		}
			
		@Override
		public String getHobby() {
			return "Elevul are hobby-ul: ";
		}
}
