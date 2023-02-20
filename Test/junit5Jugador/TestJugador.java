package junit5Jugador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Jugador;

class TestJugador {
	
	@Test
	void testDorsalBienExpulsado() {
		
		Jugador jugador1=new Jugador(7,2,1);
		
		jugador1.dorsal(7);
		
		int resultadoEsperadoDorsal=7;
		int resultadoObtenidoDorsal=jugador1.getDorsal();
		boolean resultadoEsperadoAmarilla=true;
		boolean resultadoObtenidoAmarilla=jugador1.expulsado();
		boolean resultadoEsperadoRoja=true;
		boolean resultadoObtenidoRoja=jugador1.expulsado();
		
		assertEquals(resultadoEsperadoDorsal,resultadoObtenidoDorsal);
		assertEquals(resultadoEsperadoAmarilla,resultadoObtenidoAmarilla);
		assertEquals(resultadoEsperadoRoja,resultadoObtenidoRoja);
	}
	
	@Test
	void testDorsalMalNoExpulsado() {
		
		Jugador jugador2 = new Jugador(31,5,6);
		
		jugador2.dorsal(31);
		
		int resultadoEsperadoDorsal=-1;
		int resultadoObtenidoDorsal=jugador2.getDorsal();
		boolean resultadoEsperadoAmarilla=false;
		boolean resultadoObtenidoAmarilla=jugador2.expulsado();
		boolean resultadoEsperadoRoja=false;
		boolean resultadoObtenidoRoja=jugador2.expulsado();
				
		assertEquals(resultadoEsperadoDorsal,resultadoObtenidoDorsal);
		assertEquals(resultadoEsperadoAmarilla,resultadoObtenidoAmarilla);
		assertEquals(resultadoEsperadoRoja,resultadoObtenidoRoja);
	}

	@Test
	void testDorsalBienNoExpulsado() {
				
		Jugador jugador3 = new Jugador(30,1,0);
		
		jugador3.dorsal(30);
		
		int resultadoEsperadoDorsal=30;
		int resultadoObtenidoDorsal=jugador3.getDorsal();
		boolean resultadoEsperadoAmarilla=false;
		boolean resultadoObtenidoAmarilla=jugador3.expulsado();
		boolean resultadoEsperadoRoja=false;
		boolean resultadoObtenidoRoja=jugador3.expulsado();
		
		assertEquals(resultadoEsperadoDorsal,resultadoObtenidoDorsal);
		assertEquals(resultadoEsperadoAmarilla,resultadoObtenidoAmarilla);
		assertEquals(resultadoEsperadoRoja,resultadoObtenidoRoja);
	
		
	}

	@Test
	void testDorsalBienExpulsadoAmarilla() {
				
		Jugador jugador4 = new Jugador(1,2,0);
		
		jugador4.dorsal(1);

		int resultadoEsperadoDorsal=1;
		int resultadoObtenidoDorsal=jugador4.getDorsal();
		boolean resultadoEsperadoAmarilla=true;
		boolean resultadoObtenidoAmarilla=jugador4.expulsado();
		boolean resultadoEsperadoRoja=true;
		boolean resultadoObtenidoRoja=jugador4.expulsado();
		
		assertEquals(resultadoEsperadoDorsal,resultadoObtenidoDorsal);
		assertEquals(resultadoEsperadoAmarilla,resultadoObtenidoAmarilla);
		assertEquals(resultadoEsperadoRoja,resultadoObtenidoRoja);
	
		
	}
		
	@Test
	void testDorsalMalExpulsadoRoja() {
				
		Jugador jugador5 = new Jugador(42,0,1);
		
		jugador5.dorsal(42);

		int resultadoEsperadoDorsal=-1;
		int resultadoObtenidoDorsal=jugador5.getDorsal();
		boolean resultadoEsperadoAmarilla=true;
		boolean resultadoObtenidoAmarilla=jugador5.expulsado();
		boolean resultadoEsperadoRoja=true;
		boolean resultadoObtenidoRoja=jugador5.expulsado();
		
		assertEquals(resultadoEsperadoDorsal,resultadoObtenidoDorsal);
		assertEquals(resultadoEsperadoAmarilla,resultadoObtenidoAmarilla);
		assertEquals(resultadoEsperadoRoja,resultadoObtenidoRoja);
	
		
	}



}
