package clase;

import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		try {
          AdresaIndivid a = new AdresaIndivid("Bucuresti", "Mihai Viteazu", "16");
          Individ i = new Individ("Ionescu Maria",
                  a, 20,
                  new SimpleDateFormat("dd.MM.yyyy").parse("10.10.1996"));
          Individ i2=(Individ)i.clone();
          i2.setNume("Ionescu Dan");
          i2.getAdresa().setLocalitate("Brasov");
          System.out.println(i);
          System.out.println(i2);
          
          Elev e=new Elev(i, 11,9.5);
          System.out.println(e);	
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}
}
