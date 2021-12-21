public class Oficial{
    /**
     *@author Elizabeth
     *Clase hija Oficial
     */

    public class Oficial extends Operador{
	/**Constructor que recibre un nombre
	 *@paramo el nombre del operador
	 */

	public Oficial(String nombre){
	    //El elemento nombre ya esta inicializado en la clase Operador, basta con poner la palabra super y el elemento.
	    super(nombre)
	}

	/**
	*Constructor sin parametros
	*/

	public Oficial(){
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
