package ejercicio1;

public class Numeros {

	boolean esPrimo(int numero) {
		
		boolean esPrimo = true;
		
		for (int i = numero-1 ; i > 1 ; i--) {
			
			if (numero % i == 0) {
				
				esPrimo = false;
				break;
				
			}
			
		}
		
		return esPrimo;
		
	}
	
	boolean esCapicua(int numero) {
		
			int figure;
			int reverse = 0;
			boolean esCapicua;
		
			for (int aux = numero ; aux != 0 ; aux /= 10) {
			
			figure = aux % 10;
			reverse = reverse * 10 + figure;
			
		}
		
		esCapicua = numero == reverse ? true : false;
			
		return esCapicua;
			
	}
	
}
