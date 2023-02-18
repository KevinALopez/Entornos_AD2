package clases;

/**
 * Entidad Soldado capaz de disparar a Soldados Enemigos
 * con un numero de balas asignadas recargables.
 * 
 * @author Brayan Ayala
 * @version 1.0.0
 * @see personajes.Soldado
 *
 */
public class Soldado {
	/**
	 * Señal para saber si el soldado sigue con vida.
	 */
    private boolean estaMuerto;
    /**
     * Cantidad de balas con las que dispone el Soldado.
     */
    private int numeroBalas;

    /**
     * Constructor para la clase Soldado con todos sus atributos.
     * 
     * @param estaMuerto - Representa el estado vital del Soldado.
     * @param numeroBalas - Representa el numero de balas que tiene el Soldado.
     */
    public Soldado(boolean estaMuerto, int numeroBalas) {
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

	/**
     * Metodo para saber si el Soldado puede disparar con las balas que dispone.
     * 
     * @return un booleano para confirmar si podemos disparar o no.
     */
	public boolean puedeDisparar() {
    	return this.numeroBalas > 0;
    }

	/**
	 * Metodo para efectuar un disparo mortal a un Soldado Enemigo.
	 * Al Soldado que se le dispare se le considerará como muerto.
	 * 
	 * @param sol - representa el Soldado enemigo al que se quiere atacar.
	 */
    public void disparar(Soldado sol) {
       this.numeroBalas--;
       sol.estaMuerto = true;
    }
    
    // Getters / Setters
    
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

}