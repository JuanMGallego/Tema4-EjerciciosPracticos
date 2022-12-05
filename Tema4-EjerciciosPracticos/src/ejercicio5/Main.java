package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num, num3;
		double num2;
		int exp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println();
		
		System.out.println("La suma de todos los números desde 1 hasta " + num + " es: " + FuncionesRecursivas.sumatorio(num));
		System.out.println();
		
		System.out.print("Introduzca un número base: ");
		num2 = sc.nextDouble();
		System.out.print("Introduzca un exponente: ");
		exp = sc.nextInt();
		System.out.println();
		
		System.out.println(num2 + "^" + exp + " es: " + FuncionesRecursivas.potencia(num2, exp));
		System.out.println();
		
		System.out.print("Introduzca un número: ");
		num3 = sc.nextInt();
		System.out.println();
		
		System.out.println("La posición elegida en la sucesión de Fibonacci da: " + FuncionesRecursivas.serieFibonacci(num3));
		
		sc.close();
		
	}

}
