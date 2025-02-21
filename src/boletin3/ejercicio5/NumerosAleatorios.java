package boletin3.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {
	
	/**
	 * Generamos una cantidad concreta de numeros aleatorio y devolvemos una cadena 
	 * donde se almacenan todos
	 * 
	 * @param cantidad Cantidad de numeros aleatorios a generar
	 * @return Cadena donde se almacenan los valores separados por espacios
	 */
	static String numerosAleatorios(int cantidad) {
		
		Random rand = new Random();
		
		String cadena = "";
		
		int numero;
		
		numero = rand.nextInt(0, 2);
		
		if(cantidad == 0) {
			cantidad = 1;
		} else {
			cadena += numero + " " + numerosAleatorios(cantidad - 1);
		}
		
		return cadena;
	}
	
	/**
	 * Generamos una cantidad concreta de numeros aleatorios que no pueden alcanzar
	 * el maximo y devolvemos una cadena donde se almacenan todos
	 * 
	 * @param cantidad Cantidad de numeros aleatorios a generar
	 * @param maximo Valor maximo del numero a generar
	 * @return Cadena donde se almacenan los numeros separados por espacios
	 */
	static String numerosAleatorios(int cantidad, int maximo) {
		
		Random rand = new Random();
		
		String cadena = "";
		
		int numero;
		
		numero = rand.nextInt(0, maximo + 1);
		
		if(cantidad == 0) {
			cantidad = 1;
		} else {
			cadena += numero + " " + numerosAleatorios(cantidad - 1, maximo);
		}
		
		return cadena;
	}
	
	/**
	 * Generamos una cantidad concreta de numeros aleatorios entre el minimo 
	 * y el maximo y devolvemos una cadena donde se almacenan todos
	 * 
	 * @param cantidad Cantidad de numeros aleatorios a generar
	 * @param minimo Valor minimo del numero a generar
	 * @param maximo Valor maximo del numero a generar
	 * @return Cadena donde se almacenan los valores separados por espacios
	 */
	static String numerosAleatorios(int cantidad, int minimo, int maximo) {
		
		Random rand = new Random();
		
		String cadena = "";
		
		int numero;
		
		numero = rand.nextInt(minimo, maximo + 1);
		
		if(cantidad == 0) {
			cantidad = 1;
		} else {
			cadena += numero + " " + numerosAleatorios(cantidad - 1, minimo, maximo);
		}
		
		return cadena;
	}
}