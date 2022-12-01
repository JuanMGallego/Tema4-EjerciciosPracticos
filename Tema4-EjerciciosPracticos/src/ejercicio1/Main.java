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
		
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println();
		
		if (num < 0) {
			
			num = -num;
			
		}
		
		esPrimo = primo.esPrimo(num);
		
		esCapicua = capicua.esCapicua(num);
		
		if (esPrimo == true) {
			
			System.out.print("El número es primo ");
			
			if (esCapicua == true) {
				
				System.out.print("y capicúa");
				
			} else {
				
				System.out.print("pero no es capicúa");
				
			}
			
		} else {
			
			System.out.print("El número no es primo ");
			
			if (esCapicua == true) {
				
				System.out.print("pero si es capicúa");
				
			} else {
				
				System.out.print("ni capicúa");
				
			}
			
		}
		
		sc.close();
		
	}

}
