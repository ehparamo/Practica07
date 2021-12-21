public class Operador{
    /**@author Elizabeth
     *Clase hija Operador
     */

    public class Operador extends Empleado{

	/**Constructor que recibe un nombre
	 *@param el nombre del operador
	 */

	public Operador(String nombre){
	    //El elemento nombre ya esta inicializado en la clase Empleado, basta con poner la palabra super y el elemento.
	    super(nombre);
	}

	/**
	 *Constructor sin parametros
	 */

	public Operador(){
	    super();
	    }

	/**
	 *Metodo que devuelve al objeto en cadena
	 *@return p
	 */

	@Override

	public String toString(){
	String p;
	p = "Hola, soy un empleado y mi nombre es:" + this.nombre;
	return p;
    }
	
    }
    
}
