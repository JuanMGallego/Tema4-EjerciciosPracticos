package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int option;
		
		Scanner sc = new Scanner(System.in);
		
		Operaciones clc = new Operaciones();
		
		System.out.print("Introduzca un número: ");
		clc.num1 = sc.nextDouble();
		System.out.print("Introduzca otro número: ");
		clc.num2 = sc.nextDouble();
		System.out.println();

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
		
		
		switch (option) {
		
		case 1: 
			System.out.println("La suma de " + clc.num1 + " + " + clc.num2 + " es: " + clc.suma());
		break;
		
		case 2:
			System.out.println("La resta de " + clc.num1 + " - " + clc.num2 + " es: " + clc.resta());
		break;
		
		case 3:
			System.out.println("La multiplicación de " + clc.num1 + " x " + clc.num2 + " es: " + clc.multiplicacion());
		break;
		
		case 4:
			System.out.println("La división de " + clc.num1 + " / " + clc.num2 + " es: " + clc.division());
		break;
		
		default:
			System.out.println("ERROR: Ha introducido un valor fuera de rango");
		}
		
		sc.close();
		
	}

}
