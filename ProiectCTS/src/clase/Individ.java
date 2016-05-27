package clase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Individ implements Cloneable{

	    protected String numeIndivid;
	    protected AdresaIndivid adresaIndivid;
	    protected int varstaIndivid;
	    protected Date dataNIndivid;
	    public Individ() {
	    }

	    public Individ(String numeIndivid, AdresaIndivid adresaIndivid, int varstaIndivid, 
	    		Date dataNIndivid) {
	        this.numeIndivid = numeIndivid;
	        this.adresaIndivid = adresaIndivid;
	        this.varstaIndivid = varstaIndivid;
	        this.dataNIndivid = dataNIndivid;
	    }

	    public String getNume() {
	        return numeIndivid;
	    }

	    public void setNume(String nume) {
	        this.numeIndivid = nume;
	    }

	    public AdresaIndivid getAdresa() {
	        return adresaIndivid;
	    }

	    public void setAdresa(AdresaIndivid adresa) {
	        this.adresaIndivid = adresa;
	    }

	    public int getVarsta() {
	        return varstaIndivid;
	    }

	    public void setVarsta(int varstaIndivid) {
	        this.varstaIndivid = varstaIndivid;
	    }

	    public Date getDataNIndivid() {
	        return dataNIndivid;
	    }

	    public void setDataNIndivid(Date dataN) {
	        this.dataNIndivid = dataN;
	    }

	    @Override
	    public String toString() {
	        String detaliiPersoana= numeIndivid + 
	        		" locuieste la adresa: " + adresaIndivid + ", are varsta " + varstaIndivid
	                    + " si data nasterii " + new SimpleDateFormat("dd.MM.yyy").format(dataNIndivid);
			return detaliiPersoana;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Individ other = (Individ) obj;
	        if (!Objects.equals(this.numeIndivid, other.numeIndivid)) {
	            return false;
	        }
	        if (this.varstaIndivid != other.varstaIndivid) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        try {
	            return new Individ(numeIndivid, (AdresaIndivid) adresaIndivid.clone(), 
	            		varstaIndivid, dataNIndivid);
	        } catch (Exception ex) {
	            return this;
	        }
	    }

		public boolean evaluare() {
			// TODO Auto-generated method stub
			return false;
		}
}
