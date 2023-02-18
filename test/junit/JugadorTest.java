package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import requerimiento2.Jugador;
@TestMethodOrder(MethodName.class)
class JugadorTest {

	// Estos serían los metodos que ejecutaran las pruebas unitarias
	// Son metodos con la anotacion @Test, y podemos tener todos los
	// metodos que queramos con esta anotacion.

	/**
	 * Con setDorsal(14) 
	 * Asignamos número a nuestro Jugador
	 */

	@Test
	public void testComprobarDorsal() {

		System.out.println("Dorsal Valido");
		Jugador jugador = new Jugador();
		jugador.setDorsal(14);
		assertEquals(14, jugador.getDorsal());
	}

	/**
	 * Con setDorsal(43) 
	 * Comprobamos que el número no esta en rango, devuelve -1.
	 */

	@Test
	public void testComprobarNoDorsal() {

		System.out.println("Dorsal NO Valido");
		Jugador jugador = new Jugador();
		jugador.setDorsal(43);
		assertEquals(-1, jugador.getDorsal());
	}

	/**
	 * Con setNumeroTarjetasRojas(1)
	 * Al Jugador le han puesto una tarjeta roja, será expulsado.
	 */

	@Test
	public void testEstaExpulsadoRoja() {

		System.out.println("Esta Expulsado: Tarjeta Roja");
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasRojas(1);
		assertEquals(true, jugador.estaExpulsado());
	}

	/**
	 * setNumeroTarjetasAmarillas(2) 
	 * Al Jugador le han puesto dos tarjetas amarillas, será expulsado.
	 */

	@Test
	public void testEstaExpulsadoAmarillas() {

		System.out.println("Esta Expulsado: Dos Amarillas");
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(2);
		assertEquals(true, jugador.estaExpulsado());
	}

	/**
	 * setNumeroTarjetasAmarillas(1) 
	 * El jugador solo tiene una tarjeta amarilla, por lo que puede continuar jugando.
	 */
	
	@Test
	public void testNoEstaExpulsado() {

		System.out.println("Sigue Jugando");
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(1);
		assertEquals(false, jugador.estaExpulsado());
	}

	/**
	 * setNumeroTarjetasAmarillas(0) 
	 * Estamos ante un jugador ejemplar, no tiene nunguna tarjeta por lo que continua jugando.
	 */
	
	@Test
	public void testNoEstaExpulsadoSinTarjetas() {

		System.out.println("Sigue Jugando: Jugador Ejemplar");
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(0);
		assertEquals(false, jugador.estaExpulsado());
	}

}
