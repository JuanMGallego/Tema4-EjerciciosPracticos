package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num;
		boolean esPrimo;
		boolean esCapicua;
		
		Scanner sc = new Scanner(System.in);
		
		Numeros primo = new Numeros();
		
		Numeros capicua = new Numeros();
		
		System.out.print("Introduzca un n�mero: ");
		num = sc.nextInt();
		System.out.println();
		
		if (num < 0) {
			
			num = -num;
			
		}
		
		esPrimo = primo.esPrimo(num);
		
		esCapicua = capicua.esCapicua(num);
		
		if (esPrimo == true) {
			
			System.out.print("El n�mero es primo ");
			
			if (esCapicua == true) {
				
				System.out.print("y capic�a");
				
			} else {
				
				System.out.print("pero no es capic�a");
				
			}
			
		} else {
			
			System.out.print("El n�mero no es primo ");
			
			if (esCapicua == true) {
				
				System.out.print("pero si es capic�a");
				
			} else {
				
				System.out.print("ni capic�a");
				
			}
			
		}
		
		sc.close();
		
	}

}
