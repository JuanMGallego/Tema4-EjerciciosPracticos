package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int cuant1;
		int maxNum;
		int minNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una cantidad de n�meros aleatorios a generar: ");
		cuant1 = sc.nextInt();
		System.out.println();
		NumerosAleatorios.numerosAleatorios(cuant1);
		
		System.out.println();
		System.out.print("Introduzca una cantidad de n�meros aleatorios a generar: ");
		cuant1 = sc.nextInt();
		System.out.print("Introduzca el m�ximo: ");
		maxNum = sc.nextInt();
		System.out.println();
		NumerosAleatorios.numerosAleatorios(cuant1, maxNum);
		
		System.out.println();
		System.out.print("Introduzca una cantidad de n�meros aleatorios a generar: ");
		cuant1 = sc.nextInt();
		System.out.print("Introduzca el m�nimo: ");
		minNum = sc.nextInt();
		System.out.print("Introduzca el m�ximo: ");
		maxNum = sc.nextInt();
		System.out.println();
		NumerosAleatorios.numerosAleatorios(cuant1, minNum, maxNum);
		
		sc.close();
		
	}

}
