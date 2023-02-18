package clases;

/**
 * Entidad Jugador de futbol conteniendo informacion sobre su numero de camisa,
 * cantidad de tarjetas amarillas y roja dentro de un partido de futbol.
 * 
 * @author Brayan Ayala
 * @version 1.0.0
 * @see personajes.Jugador
 *
 */
public class Jugador {
	/**
	 * El numero en la camiseta del jugador
	 */
    private int dorsal;
    /**
     * Cantidad de tarjetas amarillas.
     */
    private int numeroTarjetasAmarillas;
    /**
     * Cantidad de tarjetas rojas.
     */
    private int numeroTarjetasRojas;

    /**
     * Constructor para la clase Jugador con todo sus atributos.
     * 
     * @param dorsal - Numero en la camiseta del jugador
     * @param numeroTarjetasAmarillas - Cantidad tarjetas amarillas
     * @param numeroTarjetasRojas - Cantidad tarjetas rojas
     */
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/**
     * Metodo para poner el numero a la camiseta del Jugador.
     * 
     * @param dorsal - Numero de camiseta entre el 1 y 30. (Si no se respeta el rango, se devolvera un -1)
     */
    public void ponerDorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	} else {
    		this.dorsal = -1;
    	}
    }

    /**
     * Metodo para identificar si un jugador esta expulsado tomando en cuenta la cantidad
     * de tarjetas rojas y amarillas que tiene.
     * 
     * @return un booleano para confirmar si esta expulsado.
     */
    public boolean estaExpulsado() {
    	boolean expulsado = false;

    	if(numeroTarjetasAmarillas == 2) {
    		expulsado = true;
    	}                          
    	if(numeroTarjetasRojas == 1) {
    		expulsado = true;
    	}

    	return expulsado;
    }

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

}
