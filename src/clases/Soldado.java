package clases;

/**
 * Clase que representa a una persona que es un soldado.
 * Dispone de atributos que representan con un boolean si el soldado esta vivo o muerto , y el numero de balas disponibles.
 * 
 * Tiene dos metodos, uno que revisa si el soldado puede disparar su arma y un metodo para dispararle a otro soldado.
 * 
 * @author kaal9
 *
 */
public class Soldado {
	/**
	 * Atributo privado que informa del estado del soldado, si esta muerto es false y si esta vivo es true.
	 */
	private boolean estaMuerto;
	
	/**
	 * Atributo privado que representa el numero de balas que tiene el soldado. Debe ser un numero entero.
	 */
    private int numeroBalas;
    
    /**
     * Contructor estandar que crea un objeto Soldado vacio sin establecer un valor a los atributos.
     */  
    public Soldado() {
		super();
	}
    
    /**
     * Contructor con parametros que establecen el valor de los atributos del soldado.
     * 
     * @param estaMuerto Debe ser true si esta vivo, o false si esta muerto.
     * @param numeroBalas El numero de balas del que dispone el soldado.Debe ser un numero entero.
     */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	
	/*
	 * Getters And Setters
	 */
	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	/**
	 * Metodo que revisa si el soldado tiene balas disponibles para disparar su arma.
	 * 
	 * @return true si el "numeroBalas" es mayor que 0, false si no lo es.
	 */
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          

        return false;

    }
	
	/**
	 * Metodo que dispara al soldado pasado como parametro. 
	 * Resta 1 al atributo "numeroBalas" disponibles y cambia el atributo "estaMuerto" del soldado pasado como parametro a true.
	 * Si el "estaMuerto" ya es true, no lo cambia y lo mantiene.
	 * 
	 * @param sol Soldado al que se le disparara.
	 */
	public void disparar(Soldado sol) {
	   this.numeroBalas--;
	   sol.estaMuerto = true;
    }
}
