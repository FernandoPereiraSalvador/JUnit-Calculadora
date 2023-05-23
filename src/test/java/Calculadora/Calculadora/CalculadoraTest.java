package Calculadora.Calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	
	Calculadora calculadora;
	
	@Before
	public void before() {
		calculadora = new Calculadora();
	}
	
	@After
	public void after() {
		calculadora.restablecer();
	}
	
	
	@Test
	public void testSuma() {
		
		float resultado = calculadora.suma(2, 3);
		int esperado = 5;
		double margenError = 0.001;
	    assertEquals(esperado, resultado, margenError);	
	}
	
	@Test
	public void testResta() {
		
		float resultado = calculadora.resta(3,2);
		int esperado = 1;
		double margenError = 0.001;
	    assertEquals(esperado, resultado, margenError);
		
	}
	
	@Test
	public void testMultiplica() {
		
		float resultado = calculadora.multiplica(3,2);
		int esperado = 6;
		double margenError = 0.001;
	    assertEquals(esperado, resultado, margenError);
		
	}
	
	@Test
	public void testDivideix() {
		
		float resultado = calculadora.divideix(6,2);
		int esperado = 3;
		double margenError = 0.001;
	    assertEquals(esperado, resultado, margenError);
		
	}
	
	@Test
	public void testMajorQue() {
		
		boolean resultado = calculadora.majorQue(6,2);
		boolean esperado = true;
	    assertEquals(esperado, resultado);
		
	}


}
