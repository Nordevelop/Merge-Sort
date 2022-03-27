package misClases;

import java.util.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/* Author Nordevelop 
		* Algoritmo de ordenamiento Mergesort
		* Con Recursividad
		*/
		int maxSize = 100; 
		DArray arr; 
		arr = new DArray(maxSize); // creacion del vector
		arr.agregar(10); // agregar elementos al Vector
		arr.agregar(5);
		arr.agregar(3);
		arr.agregar(7);
		arr.agregar(2);
		arr.agregar(8);
		arr.agregar(4);
		arr.agregar(11);
		arr.agregar(9);
		arr.agregar(0);
		arr.agregar(6);
		arr.agregar(1);
		System.out.println("Array Desordenado: ");
		arr.mostrar(); // mostrar el vector
		arr.mergeSort(); //vector arr[] ordenado con el algoritmo de Mergesort
		System.out.println("Array Ordenado con el metodo Merge-sort: ");
		arr.mostrar(); // mostrar el vector ordenado
		
	}

}
