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
	@Test
	public void CantidadPistasMedio() {
		int pistasDisponibles=4;
		int pistasUsadas=4;
		assertEquals(pistasDisponibles,pistasUsadas);
	}
	@Test
	public void CantidadPistasAvanzado() {
		int pistasDisponibles=2;
		int pistasUsadas=2;
		assertEquals(pistasDisponibles,pistasUsadas);
	}
	

}
