package ejercicio3;

import java.util.Scanner;

/**
 * Main class
 * @author juanm
 *
 */
public class Main {

	public static void main(String[] args) {

		int cuant; //Variable to store the amount of numbers user introduces
		int maxNum; //Maximum introduced by the user
		int minNum; //Minimum introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner opens
		
		//Introduction of amount of numbers by the user
		System.out.print("Introduzca una cantidad de números aleatorios a generar: ");
		cuant = sc.nextInt();
		System.out.println();
		NumerosAleatorios.numerosAleatorios(cuant); //Calls the function that have only that variables
		
		//Second part, amount and maximum
		System.out.println();
		System.out.print("Introduzca una cantidad de números aleatorios a generar: ");
		cuant = sc.nextInt();
		System.out.print("Introduzca el máximo: ");
		maxNum = sc.nextInt();
		System.out.println();
		NumerosAleatorios.numerosAleatorios(cuant, maxNum); //Calls the function that have only that variables
		
		//Third part, amount, maximum and minimum
		System.out.println();
		System.out.print("Introduzca una cantidad de números aleatorios a generar: ");
		cuant = sc.nextInt();
		System.out.print("Introduzca el mínimo: ");
		minNum = sc.nextInt();
		System.out.print("Introduzca el máximo: ");
		maxNum = sc.nextInt();
		System.out.println();
		NumerosAleatorios.numerosAleatorios(cuant, minNum, maxNum); //Calls the function that have only that variables
		
		sc.close(); //Scanner closes
		
	}

}
