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
		System.out.print("Introduzca un n�mero: ");
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
			
			System.out.print("El n�mero es primo ");
			
			//Its also palindromic
			if (esCapicua == true) {
				
				System.out.print("y capic�a");
			
			//But isn't palindromic
			} else {
				
				System.out.print("pero no es capic�a");
				
			}
		//Isn't palindromic
		} else {
			
			System.out.print("El n�mero no es primo ");
			
			//Isn't either palindromic
			if (esCapicua == true) {
				
				System.out.print("pero si es capic�a");
			
			//But it is palindromic
			} else {
				
				System.out.print("ni capic�a");
				
			}
			
		}
		
		sc.close(); //Scanner closes
		
	}

}
