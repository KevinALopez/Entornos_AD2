package clases;

/**
 * El objetivo de la clase Jugador es la representacion de una persona que juega fútbol.
 * Dispone de atributos que representan el numero de camiseta(tambien conocido como dorsal), numero de tarjetas rojas y numero de tarjetas amarillas.
 * 
 * Tiene dos metodos, uno para cambiar el numero de camiseta y otro para revisar si un jugador esta expulsado.
 * 
 * @author kaal9
 *
 */
public class Jugador {
	/**
	 * Atributo privado que identifica a un Jugador. Debe ser un numero entero.
	 */
	private int dorsal;
	/**
	 * Atributo privado que representa el numero de tarjetas amarillas de un jugador. Debe ser un numero entero.
	 */
    private int numeroTarjetasAmarillas;
    /**
     * Atributo privado que representa el numero de tarjetas rojas de un jugador. Debe ser un numero entero.
     */
    private int numeroTarjetasRojas;            
    
    /**
     * Contructor estandar que crea un objeto Jugador vacio sin establecer un valor a los atributos.
     */
    public Jugador() {
		super();
	}
    
    /**
     * Contructor con parametros que establecen el valor de los atributos del jugador.
     * 
     * @param dorsal El numero de camisa del jugador. Debe ser un numero entero.
     * @param numeroTarjetasAmarillas La cantidad de tarjetas amarillas que tiene el jugador.
     * @param numeroTarjetasRojas La cantidad de tarjetas rojas que tiene el jugador.
     */
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/*
	 * Getters and Setters
	 */

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
	
	/**
	 * Metodo que establece el valor del atributo "dorsal" segun numero introducido como parametro.
	 * Si el numero introducido como parametro es menor que 1 o mayor que 30, establece el atributo "dorsal" a -1.
	 * 	
	 * @param dorsal El numero de camiseta para el atributo "dorsal".
	 */
	public void ponerDorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	} else {
    		this.dorsal = -1;
    	}
    }
	
	/**
	 * Metodo que revisa si un jugador esta expulsado. 
	 * Un jugador esta expulsado si el atributo "numeroTarjetasAmarillas" es 2 o el atributo "numeroTarjetasRojas" es 1.
	 * 
	 * @return true si numeroTarjetasAmarillas = 2 o numeroTarjetasRojas = 1, de lo contrario false.
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

}
