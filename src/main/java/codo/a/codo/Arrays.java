package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
	   //Array de enteros
 
		int[] array= new int [4];
	    array[0]= 10;
	    array[1]= 11;
	    array[2]= 12;
	    array[3]= 13;
	
	    String nombres[] = new String[] {"nombre1", "nombre2"};
	    
	 //Recorrer el array
	
	    for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	    }
		 //quiero mostrar solo el indice 3
		 System.out.println("mostrando valor del indice 3: " + array[3]);
	    
	    //recorrer el array usando un foraech 
	    for(int aux : array) {
	         System.out.println(aux);
	    }
	 
	  }
	}
