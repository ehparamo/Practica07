public class Empleado
//Clase padre
//@author Elizabeth
{
    //ATRIBUTOS
    //@param private nombre
    private String nombre;

    //METODO CONSTRUCTOR

    public Empleado()
    {
	//@return nombre
	this.nombre = Elizabeth;
    }

    public Empleado(String nombre)
    {
	//@param nombre
	this.nombre = nombre;
    }

    //METODOS ESPECIALES

    public void setNombre(String nombre)
    {
	this.nombre = nombre;
    }

    public String getNombre()
    {
	return this.nombre;
    }

    /**
     *Metodo que devuelve el objeto en cadena
     *@return p
     */

    public String toString(){
	String p;
	p = "Hola, soy un empleado y mi nombre es:" + this.nombre;
	return p;
    }

    /**
     *Metodo equals que recibe un objeto 
     *Devuelve true si el objeto que recibe tiene el mismo valor que en el atributo nombre que el objeto que llama al metodo
     *@param s
     *@return r
     */

    public boolean equals(Object s){
	Empleado q = Empleado(p);
	boolean r;
	r = this.nombre.equals(q.nombre);
	return r;
    }	
}
