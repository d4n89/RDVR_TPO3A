package arreglos;

import java.util.Scanner;

public class Estandares {

	public static void main(String[] args) {
		
		int[] edades = new int[5];
		
		Scanner captura = new Scanner(System.in);
		
		for(int i = 1; i <= edades.length; i++) {
			System.out.println("Valor: " + edades[i]);
			edades[i] = captura.nextInt();
			
			
		}
		
	}
	
}
