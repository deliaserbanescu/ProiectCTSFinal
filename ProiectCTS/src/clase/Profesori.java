package clase;

public class Profesori {
	String[][] profesori;
	
	public Profesori(){
		profesori = new String[5][0];
		profesori[0] = new String[] {"1","Pop","Informatica"};
		profesori[1] = new String[] {"2","Vlad","Matematica"};
		profesori[2] = new String[] {"3","Mirita","Biologie"};
		profesori[3] = new String[] {"4","Popovici","Istorie"};
		profesori[4] = new String[] {"5","Alecu","Economie"};
	}
	
	public String[][] getProfesori(){
		return profesori;
	}
}
