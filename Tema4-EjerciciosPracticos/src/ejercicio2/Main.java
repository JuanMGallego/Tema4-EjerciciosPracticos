package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el radio de la esfera: ");
		Esfera.radio = sc.nextDouble();
		System.out.println();
		
		System.out.println("El radio de la esfera es " + Esfera.surface() + " y el volumen es " + Esfera.volume());
		
		sc.close();
		
	}

}
