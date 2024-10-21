package ar.edu.unlp.info.oo1.ejer9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro ca;
	private CajaDeAhorro ca2;
	
	@BeforeEach
	public void setUp() {
		ca = new CajaDeAhorro();
		ca2 = new CajaDeAhorro();
		ca.setSaldo(500);
	}
	
	@Test
	public void testExtraer() {
		assertFalse(ca.extraer(1000));
	}
	
	@Test
	public void testTransferir() {
		assertFalse(ca.transferirACuenta(1000, ca2));
	}
	
	@Test
	public void testExtraer2() {
		ca.extraer(100);
		assertEquals(398, ca.getSaldo());
	}
	
	@Test
	public void testTransferir2() {
		ca.transferirACuenta(100, ca2);
		assertEquals(398, ca.getSaldo());
	}
	
	@Test
	public void testDepositar() {
		ca.depositar(500);
		assertEquals(990, ca.getSaldo());
	}
}