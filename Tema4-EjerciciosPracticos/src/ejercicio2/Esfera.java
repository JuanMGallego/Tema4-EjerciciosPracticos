package ejercicio2;

public class Esfera {
	
	static double radio;

	static double surface() {
		
		double surface;
		
		surface = 4*Math.PI*Math.pow(radio, 2);
		
		return surface;
		
	}
	
	static double volume() {
		
		double volume;
		
		volume = (4*Math.PI/3)*Math.pow(radio, 3);
		
		return volume;
		
	}
	
}
