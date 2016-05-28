package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.AdresaIndivid;

public class TestAdresaIndivid {
	AdresaIndivid a;
	
	@Before
	public void Init()  {
		a=new AdresaIndivid();
	}

	@Test
	public void testLocalitate() {
		Init();
		a.setLocalitate("Bucuresti");
		//String b="Craiova";
		String b = "Bucuresti";
		assertEquals("Localitatile nu coincid!",b,a.getLocalitate());
	}
	
	@Test
	public void testNumar() {
		//a.setNumar(-1);
		a.setNumar(1);
		if(a.getNumar()<0)
		{
			assertEquals("Numarul din adresa nu poate fi negativ!", a.getNumar());
		}
	}

}
