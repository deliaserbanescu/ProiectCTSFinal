package clase;

import java.util.Objects;

public class AdresaIndivid implements Cloneable {
    protected String localitate,strada;
    protected int numar;

    public AdresaIndivid() {
    }

    public AdresaIndivid(String localitate, String strada, int numar) {
        this.localitate = localitate;
        this.strada = strada;
        this.numar = numar;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return " localitate " + localitate + ", strada " + strada + 
        		" numar " + numar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdresaIndivid other = (AdresaIndivid) obj;
        if (!Objects.equals(this.localitate, other.localitate)) {
            return false;
        }
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }


}
