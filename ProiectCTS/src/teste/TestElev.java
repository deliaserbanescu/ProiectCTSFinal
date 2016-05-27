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
	public void testValoriMedie() {
		if(e.getMedia()<0)
		assertEquals("Media nu poate fi negativa!",e.getMedia());
	}
	
	@Test
	public void testVarstaNegativa() {
		if(e.getVarsta()<0)
			assertEquals("Varsta nu poate fi negativa", 0, e.getVarsta());
	}
	
	@Test
	public void testVarstaMare() {
		if(e.getVarsta()>19)
		assertEquals("Un elev nu poate avea mai mult de 19 ani ",19,e.getVarsta());
	}
	
	@Test
	public void testSumaNoteNegativa() {
		if((int)e.sumaNote()<0)
		assertEquals("Suma notelor nu poate fi negativa ",-2,e.sumaNote());
	}
	
	@Test
	public void testEval() {
		assertFalse(e.evaluare());
	}
	

}
