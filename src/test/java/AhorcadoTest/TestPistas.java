package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPistas {

	@Test// pistas disponibles tienen que estar en la clase juego cuando creemos un nivel deberiamos crear un juego con los parametros
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
	@Test
	public void mostrarCantidadPistas(){
		String mensaje="Cantidad de pistas diponibles:"+7;
		assertEquals(mensaje,"Cantidad de pistas diponibles:"+7);
	}
	@Test
	public void mostrarpistaIncrementada()
	{
		int auxiliarpistas=6;
		String mensaje="Cantidad de pistas diponibles:"+7;
		assertEquals(mensaje,"Cantidad de pistas diponibles:"+incrementarpista(auxiliarpistas));
	}
	private int incrementarpista(int auxiliarpistas) {
		
		// TODO Auto-generated method stub
		return auxiliarpistas+1;
	}
	

}
