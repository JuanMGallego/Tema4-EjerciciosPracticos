package ejercicio5;

public class FuncionesRecursivas {

	static int sumatorio(int numero) {
		
		int result;
		
		if (numero <= 1) {
			
			result = 1;
			
		} else {
			
			result = numero + sumatorio(numero - 1);
			
		}
		
		return result;
		
	}
	
	static double potencia(double a, int n) {
		
		double result;
		
		if (n <= 0) {
			
			result = 1;
			
		} else {
			
			result = a * potencia(a, n - 1);
			
		}
		
		return result;
		
	}
	
	static int serieFibonacci(int numero) {
		
		int result;
		
		if (numero <= 1) {
			
			result = 1;
			
		} else {
			
			result = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
			
		}
		
		return result;
		
	}
	
}
