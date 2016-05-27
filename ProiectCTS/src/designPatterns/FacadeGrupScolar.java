package designPatterns;

public class FacadeGrupScolar {
	protected boolean esteAdmis = true;
	public void admis(){
		this.esteAdmis = true;
	}	
	public void respins(){	
		this.esteAdmis = false;
	}
}
