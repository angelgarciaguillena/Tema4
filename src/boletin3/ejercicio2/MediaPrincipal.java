package boletin3.ejercicio2;

public class MediaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero 1 entero*/
		int numero1 = 6;
		
		/*Creamos una variable para almacenar el numero 2 entero*/
		int numero2 = 14;
		
		/*Creamos una variable para almacenar el numero 1 decimal*/
		double numero1D = 3.7;
		
		/*Creamos una variable para almacenar el numero 2 decimal*/
		double numero2D = 4.3;
		
		/*Mostramos la media de los numeros enteros*/
		System.out.println(Media.media(numero1, numero2));
		
		/*Mostramos la media de los numeros decimales*/
		System.out.println(Media.media(numero1D, numero2D));
	}
}
