package avaliacao02.parte02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValoresTest {

	private Valores valores;
	
	@Before
	public void inicializa() {
		valores = new Valores();
	}
	
	@Test
	public void ins_14a_False_18() {
		for(int i = 1; i <= 10; i++) {
			valores.ins(i);
		}
		boolean resultado = valores.ins(11);
		System.out.println(valores.size());
		assertFalse(resultado);
	}
	
	@Test
	public void ins_14a_14b_False_18() {
		boolean resultado = valores.ins(-1);
		assertFalse(resultado);
	}
	
	@Test
	public void ins_14a_14b_15_18() {
		boolean resultado = valores.ins(1);
		assertTrue(resultado);
	}

}
