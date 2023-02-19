package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Soldado;

class SoldadoTest {
	//Crecion de objetos soldado para las pruebas
	Soldado s1 = new Soldado();
	Soldado s2 = new Soldado();
	
	@Test
	void testPuedeDisparar1() {
		s1.setNumeroBalas(30);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar(); // Se espera true porque tiene mas de 0 balas
		
		assertEquals(resultadoEsperado , resultadoObtenido);
	}
	
	@Test
	void testPuedeDisparar2() {
		s2.setNumeroBalas(-2);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = s2.puedeDisparar(); // Se espera false porque tiene menos de 0 balas
		
		assertEquals(resultadoEsperado , resultadoObtenido);
	}
	
	@Test
	void testDisparar1() {
		s2.setEstaMuerto(false); // El soldado esta vivo
		s1.setNumeroBalas(30); // s1 tiene 30 balas
		s1.disparar(s2); // s1 le dispara a s2
		
		boolean resultadoEsperado1 = true;
		boolean resultadoObtenido1 = s2.isEstaMuerto(); // Se espera true porque el metodo disparar() , debio cambiar su estado a true.
		
		int resultadoEsperado2 = 29;
		int resultadoObtenido2 = s1.getNumeroBalas(); // Se espera 29 porque el metodo disparar() debio haberle restado uno a su atributo de numBalas
		
		assertEquals(resultadoEsperado1 , resultadoObtenido1); // Comprobacion de cambio en estaMuerto
		
		assertEquals(resultadoEsperado2 , resultadoObtenido2); // Combrobacion de cambio en numBalas
		
	}
	
	@Test
	void testDisparar2() {
		s2.setEstaMuerto(true); // El soldado esta vivo
		s1.setNumeroBalas(10); // s1 tiene 30 balas
		s1.disparar(s2); // s1 le dispara a s2
		
		boolean resultadoEsperado1 = true;
		boolean resultadoObtenido1 = s2.isEstaMuerto(); // Se espera true porque ya estaba muerto el soldado, y el metodo disparar() no lo cambiaria.
		
		assertEquals(resultadoEsperado1 , resultadoObtenido1); // Comprobacion que estaMuerto se mantiene true
		
	}
}
