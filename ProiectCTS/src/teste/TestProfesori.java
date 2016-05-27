package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Profesori;

public class TestProfesori {
	Profesori p;

	@Before
	public void Init() {
		p=new Profesori();
	}

	@Test
	public void test() {
		assertNotNull(Profesori.class);
	}
	
	@Test
	public void testProf() {
		assertNotNull(p.getProfesori());
	}
	
}
