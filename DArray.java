package misClases;
import java.util.Arrays;

public class DArray {
	/*clase Darray Mergesort
	 * 
	 * Author Nordevelop
	 */
	private long[] vector; // ref to array vector
	private int nElementos; // number of data items
	
	public DArray(int max) // constructor
	{
	vector = new long[max]; 
	nElementos = 0;
	}
	
	public void agregar(long value) // put element into array
	{
	vector[nElementos] = value; // insert it
	nElementos++; // increment size
	}
	
	public void mostrar() // displays array contents
	{
	for(int j=0; j<nElementos; j++) // for each element,
	System.out.print(vector[j] + " "); //
	System.out.println(" ");
	}

	public void mergeSort() // called by main()
	{ // provides espacio
	long[] espacio = new long[nElementos];
	recMergeSort(espacio, 0, nElementos-1);
	}

	private void recMergeSort(long[] espacio, int Limite_inferior, int Limite_superior){
	
		if(Limite_inferior == Limite_superior) // if range is 1,
			return; // no use sorting
		else
	{ // find mediopoint
	int medio = (Limite_inferior+Limite_superior) / 2;	// sort low half
	recMergeSort(espacio, Limite_inferior, medio);	// sort high half
	recMergeSort(espacio, medio+1, Limite_superior);	// merge them
	merge(espacio, Limite_inferior, medio+1, Limite_superior);
	} // end else
	} // end recMergeSort()
	
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
			} // end merge()
			
} // end class DArray
