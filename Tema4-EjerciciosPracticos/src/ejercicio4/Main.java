package ejercicio4;

import java.util.Scanner;

/**
 * Main class
 * @author juanm
 *
 */
public class Main {

	public static void main(String[] args) {
		
		int option; //Variable to choose the option in the menu
		
		Scanner sc = new Scanner(System.in); //Scanner starts
		
		Operaciones clc = new Operaciones(); //Object for calculations class
		
		//User introduces the numbers and goes to the global variables
		System.out.print("Introduzca un número: ");
		clc.num1 = sc.nextDouble();
		System.out.print("Introduzca otro número: ");
		clc.num2 = sc.nextDouble();
		System.out.println();

		//Menu
		System.out.println("------------------------");
		System.out.println();
		System.out.println("[1] Suma");
		System.out.println("[2] Resta");
		System.out.println("[3] Multiplicación");
		System.out.println("[4] División");
		System.out.println();
		System.out.print("Elija una opción: ");
		option = sc.nextInt();
		System.out.println();
		
		//Different solutions depending on user's selection
		switch (option) {
		
		case 1: 
			System.out.println("La suma de " + clc.num1 + " + " + clc.num2 + " es: " + clc.suma()); //Calls to "suma" function
		break;
		
		case 2:
			System.out.println("La resta de " + clc.num1 + " - " + clc.num2 + " es: " + clc.resta()); //Calls to "resta" function
		break;
		
		case 3:
			System.out.println("La multiplicación de " + clc.num1 + " x " + clc.num2 + " es: " + clc.multiplicacion()); //Calls to "multiplicacion" function
		break;
		
		case 4:
			System.out.println("La división de " + clc.num1 + " / " + clc.num2 + " es: " + clc.division()); //Calls to "division" function
		break;
		
		default:
			System.out.println("ERROR: Ha introducido un valor fuera de rango"); //If user enters other
		}
		
		sc.close(); //Scanner closes
		
	}

}
