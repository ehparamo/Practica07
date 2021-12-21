public class Prueba{
    /**
     *@author Elizabeth
     *Clase prueba para ejercutar Herencia
     */

    /**
     *@param args
     */
    
    public static void main(String[] args){

	Empleado empleado1 = new Empleado("Luis");

	Operador operador1 = new Operador("Alberto");

	Directivo directivo1 = new Directivo();

	Oficial oficial1 = new Oficial("Alejandro");

	Tecnico tecnico1 = new Tecnico("Lorena");

	System.out.println(empleado1);
	System.out.println(operador1);
	System.out.println(directivo1);
	System.out.println(oficial1);
	System.out.println(tecnico1);
	
    }
}
