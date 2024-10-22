package ar.edu.unlp.info.oo1.ejer11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionesTest {
	private InversionEnAcciones inversionEnAcciones;
	
	@BeforeEach
	public void setUp() {
		inversionEnAcciones = new InversionEnAcciones("Hola", 5, 1000);
	}

	@Test
	public void calcularValorActual() {
		assertEquals(5000, inversionEnAcciones.valorActual());
	}
}