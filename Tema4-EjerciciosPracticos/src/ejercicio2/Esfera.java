package ejercicio2;

/**
 * Sphere class
 * @author juanm
 *
 */
public class Esfera {
	
	static double radio; //Global static variable radius

	//Static surface function
	static double surface() {
		
		double surface; //surface variable
		
		surface = 4*Math.PI*Math.pow(radio, 2); //surface operation and stores in the variable
		
		return surface; //Returned to the main function
		
	}
	
	//Static volume function
	static double volume() {
		
		double volume; //volume variable
		
		volume = (4*Math.PI/3)*Math.pow(radio, 3); //volume operation and stores in the variable
		
		return volume; //Returned to the main function
		
	}
	
}
