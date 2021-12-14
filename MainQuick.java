public class MainQuick
//Algoritmo para ejecutar la clase quicksort
//@author Elizabeth
{
    public static void main(String[] array)
    {
	quicksort quick= new quicksort();
	int vector1[] = {4,2,1};
	System.out.println("Mostrar arreglo original: ");
	quick.mostrarArreglo(vector1);
	System.out.println("Mostrar arreglo con Quicksort: ");
	quick.quicksort(vector1, 0, vector1.length-1);	
    }
}
