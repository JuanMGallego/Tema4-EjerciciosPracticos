package ejercicio5;

import java.util.Scanner;

/**
 * Main class
 * @author juanm
 *
 */
public class Main {

	public static void main(String[] args) {

		//Variables
		int num, num3; //Integers numbers
		double num2; //Real numbers
		int exp; //exponent
		
		Scanner sc = new Scanner(System.in); //Scanner starts
		
		//User enters the number
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println();
		
		//Prints the solution calling the function "sumatorio" using the number variable
		System.out.println("La suma de todos los números desde 1 hasta " + num + " es: " + FuncionesRecursivas.sumatorio(num));
		System.out.println();
		
		//Second part, user enters the base number and the exponent
		System.out.print("Introduzca un número base: ");
		num2 = sc.nextDouble();
		System.out.print("Introduzca un exponente: ");
		exp = sc.nextInt();
		System.out.println();
		
		//Prints the solution calling the function "potencia" using the base number and the exponent
		System.out.println(num2 + "^" + exp + " es: " + FuncionesRecursivas.potencia(num2, exp));
		System.out.println();
		
		//Third part, user enters a number
		System.out.print("Introduzca un número: ");
		num3 = sc.nextInt();
		System.out.println();
		
		//Prints the solution calling the function "serieFibonacci" using the number variable
		System.out.println("La posición elegida en la sucesión de Fibonacci da: " + FuncionesRecursivas.serieFibonacci(num3));
		
		sc.close(); //Scanner closes
		
	}

}
