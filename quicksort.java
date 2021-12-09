public class quicksort
//Algoritmo para practicar Quicksort
//@author Elizabeth
{
    public void quicksort(int[] arreglo, int primero, int ultimo)
    {
	int i, j, pivote, auxiliar;
	i = primero;
	j = ultimo;
	pivote = arreglo[(primero+ultimo) / 2];
	int c = (int)pivote;
	System.out.println("El pivote es:" +c);

	do{
	    while(arreglo[i] < pivote){
		i++;
	    }
	    while(arreglo[j] > pivote){
		j--;
	    }
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


