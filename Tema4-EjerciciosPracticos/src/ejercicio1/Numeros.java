package ejercicio1;

/**
 * Numero's class
 * @author juanm
 *
 */
public class Numeros {

	boolean esPrimo(int numero) { //Non static function with number as the parameter entered by the user
		
		boolean esPrimo = true; //Starts true
		
		//But if detects that have another divisor, stops and its false
		for (int i = numero-1 ; i > 1 ; i--) {
			
			if (numero % i == 0) {
				
				esPrimo = false;
				break; //Skips the loop
				
			}
			
		}
		
		return esPrimo; //Returns the result to the main function
		
	}
	
	boolean esCapicua(int numero) { //Non static function with number as the parameter entered by the user
		
			int figure; //Stores a digit
			int reverse = 0; //Stores the number backwards
			boolean esCapicua; //Result
		
			//Until it gets 0, analyzes each digit
			for (int aux = numero ; aux != 0 ; aux /= 10) {
			
			figure = aux % 10; //Digits counted normally
			reverse = reverse * 10 + figure; //Digits counted backwards
			
		}
		
		esCapicua = numero == reverse ? true : false; //Depend if its palindromic or not, the variable is true or false
			
		return esCapicua; //Returns the result to the main function
			
	}
	
}
