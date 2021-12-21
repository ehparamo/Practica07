public class Tecnico{
    /**
     *@author Elizabeth
     *Clase hija Tecnico
     */

    public class Tecnico extends Operador{

	/**Constructor que recibe un nombre
	 *@paramo el nombre del operador
	 */

	public Tecnico(String nombre){
	    //El elemento nombre ya esta inicializado en la clase Empleado, basta con poner la palabra super y elemento
	    super(nombre);
	}

	/**
	 *Constructor sin parametors
	 */

	public Tecnico(){
	    super();
	}

	/**
	 *Metodo que devuelve al objeto en cadena
	 *@return p
	 */

	@Override

	public String toString(){
	    String p;
	    p = "Hola, soy un empleado y mi nombre es: " + this.nombre;
	    return p;
	}

	/**
	 *Metodo que devuelve el String "Estoy trabajando"
	 *@return r El string Estoy trabajando
	 */

	public String trabaja(){
	    String r;
	    r = "Estoy trabajando";
	    return r;
	}
    }
}
