package boletin3.ejercicio2;

public class Media {
	
	/**
	 * Devuelve la media de dos numeros enteros
	 * 
	 * @param numero1 Numero 1
	 * @param numero2 Numero 2
	 * @return Media de los numeros enteros
	 */
	static double media(int numero1, int numero2) {
		double media;
		
		media = (numero1 + numero2) / 2;
		
		return media;
	}
	
	/**
	 * Devuelve la media de los numeros decimaes
	 * 
	 * @param numero1 Numero 1
	 * @param numero2 Numero 2
	 * @return Media de los numeros decimales
	 */
	static double media(double numero1, double numero2) {
		double media;
		
		media = (numero1 + numero2) / 2;
		
		return media;
	}
}
