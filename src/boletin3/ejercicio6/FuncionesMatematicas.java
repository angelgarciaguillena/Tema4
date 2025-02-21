package boletin3.ejercicio6;

public class FuncionesMatematicas {
	
	/**
	 * Calcula la suma de los numeros anteriores al numero limite y devuelve el resultado
	 * 
	 * @param numero Numero que indica el limite de la suma
	 * @return Devuelve el resultado de la suma de los numeros anteriores al limite
	 */
	static int sumatorio(int numero) {
		
		int suma;
		
		if(numero == 0 || numero == 1) {
			suma = numero;
		} else {
			suma = numero + sumatorio(numero - 1);
		}
		
		return suma;
	}
	
	/**
	 * Calcula la potencia de un numero introducido por parametro elevado a otro numero 
	 * introducido por parametro y devuelve el resultado de la operacion
	 * 
	 * @param a Numero de base
	 * @param n Numero de potencia
	 * @return Devuelve el resultado de la potencia
	 */
	static double potencia(double a, int n) {
		
		double potencia;
		
		if(n == 0) {
			potencia = 1;
		} else {
			potencia = a * potencia(a, n - 1);
		}
		
		return potencia;
	}
	
	/**
	 * Calcula el resultado de la serie Fibonacci del numero introducido por parametros y lo devuelve
	 * 
	 * @param numero Numero con el que se realiza la operacion fibonacci
	 * @return Devuelve el resultado de la serie fibonacci
	 */
	static int serieFibonacci(int numero) {
		
		int fibonacci;
		
		if(numero == 0 || numero == 1) {
			fibonacci = 1;
		} else {
			fibonacci = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}
		
		return fibonacci;
	}
}