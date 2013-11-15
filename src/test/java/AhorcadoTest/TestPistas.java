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
		int pistasDisponibles=2;
		int pistasUsadas=2;
		assertEquals(true,mostrarPistas(pistasUsadas,pistasUsadas));
	}
	public Boolean mostrarPistas(int a,int b){
		if(a==b){
			return true;
		}
		
		else
			return false;
		
	}
	

}
