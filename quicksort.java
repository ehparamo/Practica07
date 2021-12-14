public class quicksort
//Algoritmo para practicar Quicksort
//@author Elizabeth
{
    //Metodo quick
    //Va a recibir tres parametros, el arreglo, un entero primero y uno ultimo
    public void quicksort(int[] arreglo, int primero, int ultimo)
    {
	//Inicializamos variables
	int i, j, pivote, auxiliar;
	i = primero;
	j = ultimo;
	//Dividimos nuestro arreglo a la mitad, para conocer el pivote
	pivote = arreglo[(primero+ultimo) / 2];
	int c = (int)pivote;
	//Imprimimos al pivote
	System.out.println("El pivote es:" +c);

	do{
	    //Para ir moviendo nuestros indices
	    //Mientras el arreglo en la posicion i sea menor que el pivote
	    while(arreglo[i] < pivote){
		//incrementar a nuestro contador i
		i++;
	    }
	    //Mientras el arreglo en la posicion j sea mayor que el pivote
	    while(arreglo[j] > pivote){
		//disminuir a nuestro contador j
		j--;
	    }
	    //Si i es menor o igual a j
	    if(i <= j){
		
		auxiliar = arreglo[i];
		arreglo[i] = arreglo[j];
		arreglo[j] = auxiliar;
		i++;
		j--;
	    }
	}
	while(i<=j);
	    if(primero < j){
		quicksort(arreglo, primero, j);
	    }
	    if(i < ultimo){
		quicksort(arreglo, i, ultimo);
	    }
	    mostrarArreglo(arreglo);
	
    }
    public void mostrarArreglo(int[] arreglo){
    for(int i = 0; i < arreglo.length; i++){
	System.out.println("[" + arreglo[i] + "]");
    }
    }
}



