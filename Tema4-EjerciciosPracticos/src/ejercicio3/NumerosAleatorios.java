package ejercicio3;

/**
 * NumerosAleatorios class
 * @author juanm
 *
 */
public class NumerosAleatorios {

	//Static function with only an integer as entry parameter
	public static void numerosAleatorios (int cuant1) {
		
		//Generates the amount of random numbers
		for(int i = 1 ; i <= cuant1 ; i++) {

			System.out.println(Math.random());
			
		}
		
	}
	
	//Static function with two integers as entry parameters
	public static void numerosAleatorios (int cuant1, int maxNum) {
	
		//Generates the amount of random numbers without passing its maximum
		for (int i = 1 ; i <= cuant1 ; i++) {
			
			//Multiplies the random number by the maximum to get the number
			System.out.println((int) (Math.random() * (maxNum + 1)));
			
		}
		
	}
	
	//Static function with three integers as entry parameters
	public static void numerosAleatorios (int cuant1, int minNum, int maxNum) {
		
		//Generates the amount of random numbers inside the range given
		for (int i = 1 ; i <= cuant1 ; i++) {
		
			//Multiplies the random number by the maximum and subtracts the minimum to get the number,
			//then adds the minimum to get inside the range
			System.out.println((int) (Math.random() * (maxNum + 1 - minNum)) + minNum);
		
		}
		
	}
	
}
