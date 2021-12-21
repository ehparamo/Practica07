public class Directivo{
/**
 *@author Elizabeth
 *Clase hija Directivo
*/

    public class Directivo extends Empleado{
	/**
	 *Constructor que recibe un nombre
	 *@param el nombre del operador
	 */

	public Directivo(String nombre){
	    //El elemento nombre ya esta inicializado en la clase Empleado, basta con poner la palabra super y elemento.
	    super(nombre);
	}

	/**
	 *Constructor sin parametros
	 */

	public Directivo(){
	    super();
	}

	/**
	 *Metodo que devuelve al objeto en cadena
	 *@retnur p
	 */

	@Override

	public String toString(){
	    String p;
	    p = "Hola, soy un empleado y mi nombre es:" + this.nombre;
	    return p;
	}
    }
    
}
