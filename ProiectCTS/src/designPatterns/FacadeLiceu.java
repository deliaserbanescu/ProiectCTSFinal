package designPatterns;

public class FacadeLiceu {
	protected boolean esteAdmis = true;
	public void admis(){
		this.esteAdmis = true;
	}	
	public void respins(){	
		this.esteAdmis = false;
	}
}
