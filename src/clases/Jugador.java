package clases;
	
	/**
	 * Entidad jugador: dorsal, tarjetas amarillas, tarjetas rojas
	 *
	 * @author guille
	 * @version 1.0
	 * 
	 */


public class Jugador {
	
		
	// ATRIBUTOS	
	/**
	 * Dorsal del jugador
	 */
		private int dorsal;
		
	/**
	 * Número de tarjetas amarillas que ha recibido el jugador
	 */
    
	private int numeroTarjetasAmarillas;
   
    /**
     * Número de tarjetas  rojas que ha recibido el jugador   
     */
    private int numeroTarjetasRojas;            
    
 
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
	// CONSTRUCTOR
	/**
	 * Constructor con atributos clase Jugador
	 * @param dorsal del jugador
	 * @param tarjetasamarillas sacadas al jugador
	 * @param tarjetasrojas sacadas al jugador
	 */
	public Jugador(int dorsal, int tarjetasamarillas, int tarjetasrojas) {
		this.dorsal=dorsal;
		this.numeroTarjetasAmarillas=tarjetasamarillas;
		this.numeroTarjetasRojas=tarjetasrojas;
	}
	// METODOS
	/**
	 * Metodo que define dorsal del jugador en un rango de 1 a 30
	 * 
	 * @param dorsal estando fuera de rango el metodo devuelve -1
	 */

	public void dorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	} else {
    		this.dorsal = -1;
    	}
    }
	
	/**
	 * Metodo que indica si jugador esta expulsado calculando numero de tarjetas amarillas y rojas
	 * 
	 * @return boolean que indica si esta expulsado
	 */
    public boolean expulsado() {
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
