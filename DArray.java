package misClases;
import java.util.Arrays;

public class DArray {
	/*clase Darray Mergesort
	 * 
	 * Author Nordevelop
	 * objetos encapsulados con acceso denegado fuera de la clase Darray
	 */
	private long[] vector; 
	private int nElementos;
	
	public DArray(int max){ //  clase constructor
	vector = new long[max]; // objetos con acceso permitido fuera de la clase Darray
	nElementos = 0;
	}
	/*
	 * Métodos
	 */
	
	public void agregar(long value) //agregar elementos dentro del Array
	{
	vector[nElementos] = value;
	nElementos++; // incrementar
	}
	
	public void mostrar() // mostrar el vector
	{
	for(int j=0; j<nElementos; j++) // for each 
	System.out.print(vector[j] + " "); //
	System.out.println(" ");
	}

	public void mergeSort() 
	{ // provides espacio
	long[] espacio = new long[nElementos];
	recMergeSort(espacio, 0, nElementos-1);
	}
	/* Metodos Encapsulados
	 * Con Acceso denegado en la clase Main()
	 */

	private void recMergeSort(long[] espacio, int Limite_inferior, int Limite_superior){
	
		if(Limite_inferior == Limite_superior) 
			return;
		else{ // find mediopoint
			int medio = (Limite_inferior+Limite_superior) / 2;  //medio = pivote	
			recMergeSort(espacio, Limite_inferior, medio);	
			recMergeSort(espacio, medio+1, Limite_superior);	
			merge(espacio, Limite_inferior, medio+1, Limite_superior);
	} // fin else
	} // fin metodo recMergeSort()
	
	private void merge(long[] espacio, int pointer_bajo,int pointer_alto, int Limite_superior){
		
	int j = 0; // espacio [indice]
	int Limite_inferior = pointer_bajo;
	int medio = pointer_alto-1;
	int n = Limite_superior-Limite_inferior+1; // # of items
	while(pointer_bajo <= medio && pointer_alto <= Limite_superior)
		if( vector[pointer_bajo] < vector[pointer_alto] )
			espacio[j++] = vector[pointer_bajo++];
		else
			espacio[j++] = vector[pointer_alto++];
	while(pointer_bajo <= medio)
		espacio[j++] = vector[pointer_bajo++];
	while(pointer_alto <= Limite_superior)
		espacio[j++] = vector[pointer_alto++];
	for(j=0; j<n; j++)
		vector[Limite_inferior+j] = espacio[j];
			} // fin metodo merge()
			
} // fin clase DArray
	
