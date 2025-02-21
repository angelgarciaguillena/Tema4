package boletin3.ejercicio3;

public class SumaEnteros {
	
	/**
	 * Calcula y devuelve la suma de todos los numeros anteriores al numero introducido
	 * 
	 * @param numero Numero limite
	 * @return La suma de los numeros
	 */
	static int sumaEnteros(int numero1) {
		
		int suma = 0;
		
		if(numero1 == 1) {
			suma = 1;
		} else {
			suma += numero1 + sumaEnteros(numero1 - 1);
		}
		
		return suma;
	}
	
	/**
	 * Calcula y devuelve la suma de los numeros entre el rango introducido
	 * 
	 * @param numero1 Numero 1
	 * @param numero2 Numero 2
	 * @return La suma de los numeros entre el rango
	 */
	static int sumaEnteros(int numero1, int numero2) {
		
		int suma = 0;
		
		if(numero2 == numero1) {
			suma = numero1;
		} else {
			suma += numero2 + sumaEnteros(numero1, numero2 - 1);
		}
		
		return suma;
	}
}