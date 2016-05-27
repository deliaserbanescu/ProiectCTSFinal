package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestElev.class,
	TestProfesori.class,
})

public class TestSuite {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
