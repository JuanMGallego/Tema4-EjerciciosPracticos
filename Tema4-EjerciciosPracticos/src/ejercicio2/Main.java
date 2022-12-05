package ejercicio2;

import java.util.Scanner;
/**
 * Main class
 * @author juanm
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //Scanner starts
		
		//Radius introduced
		System.out.print("Introduzca el radio de la esfera: ");
		Esfera.radio = sc.nextDouble(); //Stores in the global variable
		System.out.println();
		
		//Final result calls both functions
		System.out.println("El radio de la esfera es " + Esfera.surface() + " u^2 y el volumen es " + Esfera.volume() + " u^3");
		
		sc.close(); //Scanner closes
		
	}

}
