package requerimiento2;

/**
 * Para el Requerimiento 2: 
 * Documentar y hacer las pruebas unitarias de la siguiente clase.
 * 
 * @author Ale Amo Canales
 *
 */

public class Jugador {

	// ATRIBUTOS

	/**
	 * Número que figura en el dorsal
	 */
	private int dorsal;

	/**
	 * Número de tarjetas "Amarillas"
	 */

	private int numeroTarjetasAmarillas;

	/**
	 * Número de tarjetas "Rojas"
	 */

	private int numeroTarjetasRojas;

	// CONSTRUCTORES

	/**
	 * Constructor por defecto.
	 */

	public Jugador() {
		super();
	}

	/**
	 * Cosntructor con los parámetros.
	 * 
	 * @param dorsal: Número Dorsal
	 * @param numeroTarjetasAmarillas: Número de tarjetas Amarillas
	 * @param numeroTarjetasRojas: Número de tarjetas Rojas
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	// GETTER&SETTER
	
	/**
	 * @return número de dorsal
	 */

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	/**
	 * 
	 * @return númpero de tarjetas "Amarillas".
	 */

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	
	/**
	 * 
	 * @return número de tarjtas "Rojas".
	 */

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/**
	 * toString
	 */

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}

	// METODOS

	/**
	 * El metodo "ponerDorsal" pasa el parámetro dorsal para ver si el número esta
	 * dentro del rango.
	 * 
	 * Sino el metodo devuelve -1.
	 * 
	 * @param dorsal
	 */

	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * El metodo "estaExpulsado" nos dice segun numero de tarjetas si el jugador
	 * esta expulsado o no.
	 * 
	 * Con dos tarjetas Amarillas esta explulsado.
	 * Con una tarjeta Roja esta expulsado.
	 * 
	 * @return expulsado si el rasultado es true en ambos casos.
	 */

	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}
