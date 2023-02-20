package clases;

/**
 * Entidad Soldado. Determina si está vivo y de ser así puede disparar a enemigos 
 *
 * @author guille
 * @version 1.0
 * 
 */

public class Soldado {
	
	/**
	 * Indica si el soldado está vivo o muerto con boolean
	 */
	private boolean estaMuerto;
	
    /**
     * Número de balas de las que dispone el soldado
     */

    private int numeroBalas;
    
    /**
     * Constructor de clase Soldado
     * @param estaMuerto indica si el soldado sigue con vida
     * @param numBalas indica si el numero de balas que tiene el soldado
     */
    public Soldado(boolean estaMuerto, int numBalas) {
    	this.estaMuerto=estaMuerto;
    	this.numeroBalas=numBalas;
    	
    }
    
    
    
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



	//METODOS	
    /**
     * Metodo para saber si el soldado tiene suficientes balas para disparar. Si el núemro de balas
     * es mayor a 0 el metodo devuelve True.
     * 
     * @return Si el soldado tiene balas para disparar
     */
    
    public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          

        return false;
    }
     /**
      * Metodo para disparar a un enemigo y matarlo
      * 
      * @param sol es el soldado enemigo abatido
      */
   public void disparar(Soldado sol) {
	   this.numeroBalas--;
	   sol.estaMuerto = true;
    }
}
