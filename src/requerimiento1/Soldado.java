package requerimiento1;
/**
 * Para el Requerimiento 1: Documentar y hacer las pruebas unitarias de la
 * siguiente clase.
 *
 * @author Ale Amo Canales
 *
 */
public class Soldado {

	// ATRIBUTOS

	/**
	 * Estado del Soldado
	 */
	private boolean estaMuerto;

	/**
	 * Valas utilizadas
	 */

	private int numeroBalas;

	// CONSTRUCTORES
	/**
	 * Constructor por defecto
	 */

	public Soldado() {
		super();
	}

	/**
	 * Constructor con los parámetros
	 * 
	 * @param estaMuerto  representa el estado del Soldado
	 * @param numeroBalas representa las balas que tiene. 
	 */

	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	
	//GETTER&SETTER
	

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	/** 
	 * @return numero de balas.
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	/**
	 * toString
	 */

	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}

	// METODOS

	/**
	 * El metodo puedeDisparar devuelve boolean: true or false
	 * 
	 * @return true si el numero de balas es mayor, el soldado puede efectuar
	 *         disparos.
	 * @return false si este es menor que cero indica que no tiene balas para
	 *         disparar.
	 * 
	 */

	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;
		}
		return false;
	}

	/**
	 * El metodo disparar al soldado pasado por parametros, al restar 1 a la
	 * variable numeroBalas --
	 * 
	 * @param sol represernta el estado del soldado pasado por parametro. como true.
	 *            El soldado esta muerto.
	 */

	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;
		
        
	}

}
