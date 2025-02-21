package boletin3.ejercicio4;

public class ParseToBooleanPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar un numero*/
		int numero = 0;
		
		/*Creamos una variable para almacenar una cadena*/
		String frase = "true";
		
		/*Mostramos la respuesta por pantalla*/
		System.out.println(ParseToBoolean.parseToBoolean(numero));
		System.out.println(ParseToBoolean.parseToBoolean(frase));
	}
}