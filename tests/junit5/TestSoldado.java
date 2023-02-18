package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Soldado;

class TestSoldado {

	@Test
	void testSoldadoSeInstanciaConAtributosCorrectos() {
		// Creamos Soldado
		Soldado sol = new Soldado(false, 25);
		
		// Comprobamos atributos
		int numeroBalasEsperado = 25;

		assertFalse(sol.isEstaMuerto());
		assertEquals(numeroBalasEsperado, sol.getNumeroBalas());
	}
	
	@Test
	void testSoldadoNOPuedeDisparar() {
		// Creamos el Soldado con 0 balas.
		Soldado sol = new Soldado(false, 0);
		
		// Accion
		boolean puedeDisparar = sol.puedeDisparar();
		
		// Comprobamos
		assertFalse(puedeDisparar);
	}
	
	@Test 
	void testSoldadoPuedeDisparar() {
		// Creamos el Soldado con balas suficientes para disparar.
		Soldado sol = new Soldado(false, 30);
		
		// Accion
		boolean puedeDisparar = sol.puedeDisparar();
		
		// Comprobamos
		assertTrue(puedeDisparar);
	}
	
	@Test
	void testSoldadoDisparaAEnemigo() {
		// Creamos el Soldado con balas suficientes para disparar.
		Soldado sol = new Soldado(false, 30);
		// Creamos soldado enemigo.
		Soldado enemigo = new Soldado(false, 30);
		
		// Accion
		sol.disparar(enemigo);
		int numeroBalasEsperado =  29;
		
		// Comprobamos que el enemigo ha muerto
		assertTrue(enemigo.isEstaMuerto());
		
		// Comprobamos que hemos gastado -1 bala
		assertEquals(numeroBalasEsperado, sol.getNumeroBalas());
	}

}
