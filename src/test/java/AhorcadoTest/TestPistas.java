package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPistas {

	@Test
	public void CantidaPistasBasico() {
		int pistasDisponibles=6;
		int pistasUsadas=6;
		assertEquals(pistasDisponibles,pistasUsadas);
	}

}
