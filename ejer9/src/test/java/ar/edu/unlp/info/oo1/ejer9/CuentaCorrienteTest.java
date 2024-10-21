package ar.edu.unlp.info.oo1.ejer9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cc;
	private CajaDeAhorro ca = new CajaDeAhorro();
	
	@BeforeEach
	public void setUp( ) {
		cc = new CuentaCorriente();
		cc.setSaldo(500);
	}
	
	@Test
	public void testInitialize() {
		assertEquals(0, cc.getDescubierto());
	}
	
	@Test
	public void testDepositar() {
		cc.depositar(500);
		assertEquals(1000, cc.getSaldo());
	}
	
	@Test
	public void testExtraer() {
		cc.extraer(500);
		assertEquals(0, cc.getSaldo());
	}
	
	@Test
	public void testExtraer2() {
		assertFalse(cc.extraer(1000));
	}
	
	@Test
	public void testTransferir() {
		assertTrue(cc.transferirACuenta(300, ca));
	}
	
	@Test
	public void testTransferir2() {
		assertFalse(cc.transferirACuenta(1000, ca));
	}
	
	@Test
	public void testDescubierto() {
		cc.setDescubierto(500);
		cc.extraer(700);
		assertEquals(-200, cc.getSaldo());
	}
}