package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Elev;

public class TestElev {
	
	Elev e;
	
	@Before
	public void Init()  {
		e=new Elev();
	}

	@Test
	public void testMedie() {
		Init();
		assertNotNull(e.getMedia());
	}
	
	@Test
	public void testClasaElev() {
		e.setClasa(11);
		//assertEquals(10,e.getClasa()); 
		assertEquals(11,e.getClasa());
	}
	
	@Test
	public void testValoriNegativeMedie() {
		//e.setMedia(-2);
		e.setMedia(8);
		if(e.getMedia()<1 )
		assertEquals("Media nu poate fi negativa!",e.getMedia());
	}
	
	@Test
	public void testValoriMariMedie() {
		//e.setMedia(12);
		e.setMedia(8);
		if(e.getMedia()>10 )
		assertEquals("Media nu poate fi mai mare decat 10!",e.getMedia());
	}
	
	@Test
	public void testVarstaNegativa() {
		//e.setVarsta(-13);
		e.setVarsta(13);
		if(e.getVarsta()<0)
			assertEquals("Varsta nu poate fi negativa", e.getVarsta());
	}
	
	@Test
	public void testVarstaMare() {
		//e.setVarsta(20);
		e.setVarsta(15);
		if(e.getVarsta()>19)
		assertEquals("Un elev nu poate avea mai mult de 19 ani ",e.getVarsta());
	}
	
	@Test
	public void testVarsta() {
		e.setVarsta(20);
		assertNotEquals(18,e.getVarsta());
	}
	
	@Test
	public void testSumaNote() {
		if((int)e.sumaNote()>50)
		assertEquals("Suma notelor nu poate fi mai mare de 50",e.sumaNote());
	}
	
	@Test
	public void testEval() {
		assertNotNull(e.evaluare());
	}
}
