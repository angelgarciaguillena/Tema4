package boletin3.ejercicio3;

public class SumaEnterosPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero 1 entero*/
		int numero1 = 5;
		
		/*Creamos una variable para almacenar el numero 2 entero*/
		int numero2 = 8;
		
		/*Mostramos la suma de los numeros hasta el introducido*/
		System.out.println(SumaEnteros.sumaEnteros(numero1));
		
		/*Mostramos la suma de los numeros entre el rango introducido*/
		System.out.println(SumaEnteros.sumaEnteros(numero1, numero2));
	}
}