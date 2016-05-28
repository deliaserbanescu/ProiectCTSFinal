package designPatterns;

import clase.Elev;

public class FacadeRepartizare {
	FacadeLiceu fL;
	FacadeColegiu fC;
	FacadeGrupScolar fGS;
	Elev e;
		
	public FacadeRepartizare(FacadeLiceu fL, FacadeColegiu fC, FacadeGrupScolar fGS) {
		super();
		this.fL = fL;
		this.fC = fC;
		this.fGS = fGS;
	}

	public void repartizareC() {
		if(e.getMedia()>9){
			System.out.print("Elevul a fost admis la Colegiu!");
			this.fC.admis();
			this.fL.respins();
			this.fGS.respins();
		}	
	}
	
	public void repartizareL() {
		if(e.getMedia()<9 && e.getMedia()>6){
			System.out.print("Elevul a fost admis la Liceu!");
			this.fC.respins();
			this.fL.admis();
			this.fGS.respins();
		}
	}
	
	public void repartizareGS() {
		if(e.getMedia()<6){
			System.out.print("Elevul a fost admis la Grup Scolar!");
			this.fC.respins();;
			this.fL.respins();
			this.fGS.admis();
		}
	}
}
