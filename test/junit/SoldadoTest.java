package junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import requerimiento1.Soldado;

class SoldadoTest {

	// Estos serían los metodos que ejecutaran las pruebas unitarias
	// Son metodos con la anotacion @Test, y podemos tener todos los
	// metodos que queramos con esta anotacion.

	/**
	 * Con setNumeroBalas(0) Comprobamos que el cargador esta vacio, por lo que no
	 * puede efectuar diasparos.
	 */

	@Test
	public void TestNoPuedeDisparar() {
		System.out.println("Test1. El Soldado No Puede disparar");
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(0);
		assertFalse(soldado.puedeDisparar());
	}

	/**
	 * Con setNumeroBalas(14) Cargamos 14 balas al cargador. Ya esta listo para
	 * disparar.
	 */

	@Test
	public void TestNumeroBalas() {
		System.out.println("Test2. El Soldado Puede disparar");

		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(14);
		assertTrue(soldado.puedeDisparar());
	}

	/**
	 * El soldado tiene una bala en el cargador, y no la ha disparado.
	 */

	@Test
	public void TestSoldadoNoEstaMuerto() {
		System.out.println("Test3. El Soldado esta vivo");
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(1);
		soldado.disparar(soldado);

		assertNotEquals(1, soldado.getNumeroBalas());
	}

	/**
	 * El soldado tiene una bala en el cargador y se ha efectuado el disparo
	 * certero.
	 */

	@Test
	public void TestSoldadoEstaMuerto() {
		System.out.println("Test4. El Soldado esta muerto");
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(1);
		soldado.disparar(soldado);

		assertEquals(0, soldado.getNumeroBalas());

	}

}
