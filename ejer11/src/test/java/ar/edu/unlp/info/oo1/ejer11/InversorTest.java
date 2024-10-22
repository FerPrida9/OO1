package ar.edu.unlp.info.oo1.ejer11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inversor;
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("Fermin");
	}
	
	@Test
	public void calcularValorActual() {
		inversor.agregarInversion(new PlazoFijo(LocalDate.now().minusDays(2), 5000, 0.05));
		inversor.agregarInversion(new InversionEnAcciones("hola", 5, 1000));
		assertEquals(10500, inversor.valorActual());
	}
	
	@Test
	public void calcularValorActualSinInversiones() {
		assertEquals(0, inversor.valorActual());
	}
}
