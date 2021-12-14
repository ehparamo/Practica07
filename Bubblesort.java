import java.util.Random;
public class Bubblesort
//Algoritmo para ordenar elementos con Bubblesort
//@author Elizabeth
{
    public static void main(String[] args){
	Random rnd = new Random();
	//Declaramos un arreglo de 1000 elementos
	int[] arr = new int[10000];

	for(int i=0; i < arr.length; i++){
	    arr[i] = rnd.nextInt(10000);
	}

	//Metodo bubblesort
	for(int i=0; i < arr.length; i++){

	    //Abrimos un for, para acomodar los elementos
	    for(int j=0; j<arr.length-1; j++){
		//Si el numero actual es mayor al numero siguiente
		if(arr[j] > arr[j+1]){
		    
		    //@param aux
		    int aux = arr[j];
		    //@param arr[j]
		    arr[j] = arr[j+1];
		    //@param arr[j+1]
		    arr[j+1] = aux;
		}
	    }
	}

	//Mostrando el arreglo ordenando en forma creciente

	for(int i = 0; i<arr.length; i++){
	    //@return arr[i]
	    System.out.println(arr[i] + "-");
	}
    }
    
				   
}
