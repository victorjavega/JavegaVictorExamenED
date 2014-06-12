package codigo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMenor() {
		
			//Si "a" es menor que "b", devuelve "a" sino "b"
			Menor menor = new Menor(20, 50);
			int resultado = menor.menor();
			assertTrue(resultado == 20);
			System.out.println(menor);
	}

}
