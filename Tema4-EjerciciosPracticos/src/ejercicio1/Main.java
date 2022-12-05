package ejercicio1;

import java.util.Scanner;

/**
 * Main class
 * @author juanm
 *
 */
public class Main {

	public static void main(String[] args) {

		int num; //Number user enters
		boolean esPrimo; //Variable if its prime
		boolean esCapicua; //Variable if its palindromic
		
		Scanner sc = new Scanner(System.in); //Scanner opens
		
		Numeros primo = new Numeros(); //Object for primo's function
		
		Numeros capicua = new Numeros(); //Object for palindromic's function
		
		//Introduction of the number
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println();
		
		//If its negative, it changes to positive
		if (num < 0) {
			
			num = -num;
			
		}
		
		esPrimo = primo.esPrimo(num); //Stores returned value from prime's function
		
		esCapicua = capicua.esCapicua(num); //Stores returned value from palindromic's function
		
		//Is prime
		if (esPrimo == true) {
			
			System.out.print("El número es primo ");
			
			//Its also palindromic
			if (esCapicua == true) {
				
				System.out.print("y capicúa");
			
			//But isn't palindromic
			} else {
				
				System.out.print("pero no es capicúa");
				
			}
		//Isn't palindromic
		} else {
			
			System.out.print("El número no es primo ");
			
			//Isn't either palindromic
			if (esCapicua == true) {
				
				System.out.print("pero si es capicúa");
			
			//But it is palindromic
			} else {
				
				System.out.print("ni capicúa");
				
			}
			
		}
		
		sc.close(); //Scanner closes
		
	}

}
