package ejercicio3;

public class NumerosAleatorios {

	public static void numerosAleatorios (int cuant1) {
		
		for(int i = 1 ; i <= cuant1 ; i++) {

			System.out.println(Math.random());
			
		}
		
	}
	
	public static void numerosAleatorios (int cuant1, int maxNum) {
	
		for (int i = 1 ; i <= cuant1 ; i++) {
			
			System.out.println((int) (Math.random() * (maxNum + 1)));
			
		}
		
	}
	
	public static void numerosAleatorios (int cuant1, int minNum, int maxNum) {
		
		for (int i = 1 ; i <= cuant1 ; i++) {
		
			System.out.println((int) (Math.random() * (maxNum + 1 - minNum)) + minNum);
		
		}
		
	}
	
}
