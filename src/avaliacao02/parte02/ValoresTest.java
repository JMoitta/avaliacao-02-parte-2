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
	public void tentaInserir11NaLista() {
		for(int i = 1; i <= 10; i++) {
			valores.ins(i);
		}
		boolean resultado = valores.ins(11);
//		System.out.println(valores.size());
		assertFalse(resultado);
	}
	
	@Test
	public void tentaInserirValorNegativo() {
		boolean resultado = valores.ins(-1);
		assertFalse(resultado);
	}
	
	@Test
	public void tentaInserirValorValidoEmListaNaoCheia() {
		boolean resultado = valores.ins(1);
		assertTrue(resultado);
	}
	
	@Test
	public void deletarIndice0EmListaVazia() {
		// 21 22 -1
		
		long resultado = valores.del(0);
		assertEquals(-1l, resultado);
	}

	@Test
	public void deletarIndice0EmListaDe1item() {
		// 21 22 -1
		valores.ins(2);
		int resultado = valores.del(0);
		assertEquals(2, resultado);
	}
	
	@Test
	public void tentaDeletarIndice1EmListaDe2itens() {
		// 21 22 -1
		valores.ins(9);
		valores.ins(7);
		valores.ins(3);
		int resultado = valores.del(0);
//		System.out.println(resultado);
		assertEquals(9, resultado);
	}
	
	@Test
	public void tentarDeletarEmIndiceVazio() {
		// 21 22 -1
		
		valores.ins(7);
		int resultado = valores.del(9);
//		System.out.println(resultado);
		assertEquals(-1, resultado);
	}
	
	@Test
	public void tentaObterTamanhoEmListaVazia() {
		int resultado = valores.size();
//		System.out.println(resultado);
		assertEquals(0, resultado);
	}
	
	@Test
	public void tentaObterTamanhoEmListaDe1Item() {
		valores.ins(6);
		int resultado = valores.size();
//		System.out.println(resultado);
		assertEquals(1, resultado);
	}
	
	@Test
	public void tentaObterTamanhoEmListaDe10Itens() {
		for(int i = 1; i <= 11; i++) {
			valores.ins(i);
		}
		int resultado = valores.size();
//		System.out.println(resultado);
		assertEquals(10, resultado);
	}
	
	@Test
	public void mediaDeListaVazia() {
		double resultado = valores.mean();
		assertEquals("deu ruim", 0.0, resultado, 0.001);
	}
	
	@Test
	public void mediaDeLista1Item() {
		valores.ins(2);
		double resultado = valores.mean();
		assertEquals("", 2, resultado, 0.001);
	}
	
	@Test
	public void mediaEmLista4Itens() {
		valores.ins(10);
		valores.ins(8);
		valores.ins(23);
		valores.ins(12);
		double resultado = valores.mean();
		assertEquals("" , 13.25, resultado, 0.001);
	}
	
	@Test
	public void tentaObterOMaiorValorDeListaVazia() {
		int resultado = valores.greater();
		assertEquals( -1, resultado);
	}
	
	@Test
	public void tentaObterOMaiorValorDeLista1Item() {
		valores.ins(2);
		int resultado = valores.greater();
		assertEquals( 2, resultado);
	}
	
	public void tentaObterOMaiorValorDeLista2Itens() {
		valores.ins(2);
		valores.ins(5);
		int resultado = valores.greater();
		assertEquals( 5, resultado);
	}
	
	public void tentaObterOMenorValorDeListaVazia() {
		int resultado = valores.lower();
		assertEquals( -1, resultado);
	}
	
	public void tentaObterOMenorValorDeLista1Item() {
		valores.ins(2);
		int resultado = valores.lower();
		assertEquals( 2, resultado);
	}
	
	public void tentaObterOMenorValorDeLista2Itens() {
		valores.ins(5);
		valores.ins(2);
		int resultado = valores.lower();
		assertEquals( 2, resultado);
	}
}
