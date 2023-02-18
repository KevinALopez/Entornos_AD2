package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Jugador;

class TestJugador {

	@Test
	void testJugadorSeInstanciaConAtributosCorrectos() {
		// Creamos jugador con sus atributos
		int dorsal = 7;
		int tarjetasAmarillas = 0;
		int tarjetasRojas = 0;
		Jugador jug = new Jugador(dorsal, tarjetasAmarillas, tarjetasRojas);
		
		// Comprobamos los atributos
		assertEquals(dorsal, jug.getDorsal());
		assertEquals(tarjetasAmarillas, jug.getNumeroTarjetasAmarillas());
		assertEquals(tarjetasRojas, jug.getNumeroTarjetasRojas());
	}

	@Test
	void testJugadorSePoneDorsalValida() {
		// Creamos jugador 
		Jugador jug = new Jugador(0, 0, 0);
		
		// Accionamos poniendo una dorsal valida
		int dorsal = 23;
		jug.ponerDorsal(dorsal);
		
		// Comprobamos la dorsal valida puesta
		assertEquals(dorsal, jug.getDorsal());
		// Comprobamos que no tenemos una incorrecta
		assertNotEquals(-1, jug.getDorsal());
	}
	
	@Test
	void testJugadorSePoneDorsalInvalida() {
		// Creamos jugador 
		Jugador jug = new Jugador(0, 0, 0);
		
		// Accionamos poniendo una dorsal invalida
		int dorsal = 99;
		jug.ponerDorsal(dorsal);
		
		// Comprobamos que dorsal invalida -1
		assertEquals(-1, jug.getDorsal());
		
		// Comprobamos que la dorsal 99 no esta puesta
		assertNotEquals(dorsal, jug.getDorsal());
	}
	
	@Test
	void testJugadorNoEstaExpulsado() {
		// Creamos jugador sin ningun tipo de tarjeta
		Jugador jug = new Jugador(7, 0, 0);
		
		// Accionamos
		boolean estaExpulsado = jug.estaExpulsado();
		
		// Comprobamos que el jugador no esta expulsado
		assertFalse(estaExpulsado);
	}
	
	@Test
	void testJugadorExpulsadoPorTarjetasAmarilla() {
		// Creamos jugador sin ningun tipo de tarjeta
		Jugador jug = new Jugador(7, 0, 0);
		
		// Accionamos - Asignamos 2 tarjetas amarillas
		jug.setNumeroTarjetasAmarillas(2);
		boolean estaExpulsado = jug.estaExpulsado();
		
		// Comprobamos que el jugador esta expulsado
		assertTrue(estaExpulsado);
	}
	
	@Test
	void testJugadorExpulsadoPorTarjetaRoja() {
		// Creamos jugador sin ningun tipo de tarjeta
		Jugador jug = new Jugador(7, 0, 0);
		
		// Accionamos - Asignamos tarjeta roja
		jug.setNumeroTarjetasRojas(1);
		boolean estaExpulsado = jug.estaExpulsado();
		
		// Comprobamos que el jugador esta expulsado
		assertTrue(estaExpulsado);
	}
}
