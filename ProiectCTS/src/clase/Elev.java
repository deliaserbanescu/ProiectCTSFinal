package clase;

import java.util.Date;

public class Elev extends Individ implements Comparable<Elev> {
    protected int clasa;
    protected double media;
    protected int[] note;
    protected Object hobby;

    
	public Elev() {
        this(new int[Note.values().length]);
    }

    public Elev(int clasa, double media, String nume, AdresaIndivid adresa, 
    		int varsta, Date dataNIndivid) {
        super(nume, adresa, varsta, dataNIndivid);
        this.clasa = clasa;
        this.media = media;
        note=new int[Note.values().length];
    }
    
    private Elev(int[] note){
        this.note= note;
    }
    
    public void setNota(String disciplina,int nota){
        note[Note.valueOf(disciplina).ordinal()]=nota;
    }
    
    public Elev(Individ i,int clasa, double media) {
        super(i.getNume(), i.getAdresa(), i.getVarsta(), i.getDataNIndivid());
        this.clasa = clasa;
        this.media = media;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Object getHobby() {
		return hobby;
	}

	public void setHobby(Object object) {
		this.hobby = object;
	}

    @Override
    public String toString() {
        return super.toString()+"\n Elev: " + "clasa: " + clasa  + ", media: " + media +
        		 " hobby" + hobby;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elev other = (Elev) obj;
        if (Double.doubleToLongBits(this.media) != Double.doubleToLongBits(other.media)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean evaluare() {
        for(Note nota:Note.values()){
            if(nota.getNota()>note[nota.ordinal()]){
                return false;
            }
        }
        return true;
    }
    
    public void printNote(){
        for(int nota:note){
            System.out.print(nota+" ");
        }
        System.out.println();
    }

    public int sumaNote(){
    	int s=0;
    	for(int nota:note){
    		s+=nota;
    	}
    	return s;
    }
    
    @Override
    public int compareTo(Elev o) {
        if(media<o.getMedia()){
            return -1;
        }
        else{
            return 1;
        }
    }

	public void print() {
		System.out.println("\n Elev: " + "clasa: " + clasa  + ", media: " + media);
	}
}
