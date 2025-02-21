package boletin3.ejercicio5;

public class NumerosAleatoriosPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la cantidad de numeros a generar*/
		int cantidad = 8;
		
		/*Creamos una variable para almacenar el maximo del numero a generar*/
		int maximo = 10;
		
		/*Creamos una variable para almacenar el minimo del numero a generar*/
		int minimo = 3;
		
		/*Mostramos el resultado de las unfiones al usuario*/
		System.out.println(NumerosAleatorios.numerosAleatorios(cantidad));
		System.out.println(NumerosAleatorios.numerosAleatorios(cantidad, maximo));
		System.out.println(NumerosAleatorios.numerosAleatorios(cantidad, minimo, maximo));
	}
}