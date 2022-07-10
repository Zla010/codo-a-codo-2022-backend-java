package codo.a.codo;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		/*primeros n numeros, donde n es leido por el teclado*/
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese n");
		
		//leer n
		int n= teclado.nextInt();
		
	    for(int i=0;i<=n; i++) {
	    	System.out.println(i);
	    }
	
	}

}
