package ejercicio5;

/**
 * FuncionesRecursivas class
 * @author juanm
 *
 */
public class FuncionesRecursivas {

	//Static summation integer function
	static int sumatorio(int numero) {
		
		int result; //Result integer variable
		
		//Base case
		if (numero <= 1) {
			
			result = 1;
			
		} else { //Recursive function
			
			result = numero + sumatorio(numero - 1); //Adds the last to the number higher
			
		}
		
		return result; //Returns the result
		
	}
	
	//Static power double function
	static double potencia(double a, int n) {
		
		double result; //Result double variable
		
		//Base case
		if (n <= 0) {
			
			result = 1;
			
		} else { //Recursive function
			
			result = a * potencia(a, n - 1); //multiplies the power subtracting one each time 
			
		}
		
		return result; //Returns the result
		
	}
	
	//Static Fibonacci integer function
	static int serieFibonacci(int numero) {
		
		int result; //Result integer variable
		
		//Base case
		if (numero <= 1) {
			
			result = 1;
			
		} else { //Recursive function
			
			//add the first with the next number in order
			result = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
			
		}
		
		return result; //Returns the result
		
	}
	
}
