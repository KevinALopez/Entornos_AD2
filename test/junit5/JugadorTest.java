package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Jugador;

class JugadorTest {
	
	//Creacion de jugadores para las pruebas
			Jugador j1 = new Jugador();
			Jugador j2 = new Jugador();
	
	@Test
	void testPonerDorsal1() {
		//Probamos que primero el metodo funcione correctamente con un numero entre el 1 y 30.
		j1.ponerDorsal(12);
		
		int resultadoEsperado = 12;
		int resultadoObtenido = j1.getDorsal(); // Se espera que sea 12
		
		assertEquals(resultadoEsperado , resultadoObtenido);
	}
	
	@Test
	void testPonerDorsal2() {
		//Probamos que al introducirle un numero menor que 1 , el resultado de getDorsal sea -1.
		j1.ponerDorsal(0);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal(); // Se espera que sea -1
		
		assertEquals(resultadoEsperado , resultadoObtenido);
	}
	
	@Test
	void testPonerDorsal3() {
		//Probamos que al introducirle un numero mayor que 30 , el resultado de getDorsal sea -1.
		j1.ponerDorsal(50);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal(); // Se espera que sea -1
		
		assertEquals(resultadoEsperado , resultadoObtenido);
	}
	
	@Test
	void testPonerDorsal4() {
		//Probamos que al introducirle el numero 1 y el numero 30, el resultado de getDorsal sea el numero introducido.
		j1.ponerDorsal(1);
		j2.ponerDorsal(30);
		
		int resultadoEsperado1 = 1;
		int resultadoObtenido1 = j1.getDorsal(); // Se espera que sea 1
		
		assertEquals(resultadoEsperado1 , resultadoObtenido1);
		
		int resultadoEsperado2 = 30;
		int resultadoObtenido2 = j2.getDorsal(); // Se espera que sea 30
		
		assertEquals(resultadoEsperado2 , resultadoObtenido2);
		
	}
	
	@Test
	void testEstaExpulsado1() {
		//Test de si un jugador tiene 2 tarjetas amarillas o 1 roja, este expulsado y el metodo retorne true.
		j1.setNumeroTarjetasAmarillas(2);
		j2.setNumeroTarjetasRojas(1);;
		
		boolean resultadoEsperado1 = true;
		boolean resultadoObtenido1 = j1.estaExpulsado(); // Se espera que sea true.
		
		assertEquals(resultadoEsperado1 , resultadoObtenido1); 
		
		boolean resultadoEsperado2 = true;
		boolean resultadoObtenido2 = j2.estaExpulsado(); // Se espera que sea true.
		
		assertEquals(resultadoEsperado2 , resultadoObtenido2);
		
	}
	
	@Test
	void testEstaExpulsado2() {
		//Test de si un jugador tiene 2 tarjetas amarillas o 1 roja, este expulsado y el metodo retorne true.
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		j2.setNumeroTarjetasRojas(-2);
		j2.setNumeroTarjetasAmarillas(4);
		
		boolean resultadoEsperado1 = false;
		boolean resultadoObtenido1 = j1.estaExpulsado(); // Se espera que sea false.
		
		assertEquals(resultadoEsperado1 , resultadoObtenido1); 
		
		boolean resultadoEsperado2 = false;
		boolean resultadoObtenido2 = j2.estaExpulsado(); // Se espera que sea false.
		
		assertEquals(resultadoEsperado2 , resultadoObtenido2);
		
	}
	
}
