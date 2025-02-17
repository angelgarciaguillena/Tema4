package boletin3.ejercicio1;

public class SumaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero 1 entero*/
		int numero1 = 5;
		
		/*Creamos una variable para almacenar el numero 2 entero*/
		int numero2 = 14;
		
		/*Creamos una variable para almacenar el numero 1 decimal*/
		double numero1D = 3.7;
		
		/*Creamos una variable para almacenar el numero 2 decimal*/
		double numero2D = 4.3;
		
		/*Mostramos la suma de los numeros enteros*/
		System.out.println(Suma.suma(numero1, numero2));
		
		/*Mostramos la suma de los numeros decimales*/
		System.out.println(Suma.suma(numero1D, numero2D));
	}
}
