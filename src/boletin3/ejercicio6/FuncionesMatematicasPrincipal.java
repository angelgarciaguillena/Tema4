package boletin3.ejercicio6;

public class FuncionesMatematicasPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar un numero con el que realizaremos las operaciones*/
		int numero = 5;
		
		/*Creamos una variable para almacenar el numero al que queremos realizar la potencia*/
		double a = 2;
		
		/*Mostramos los resultados al usuario*/
		System.out.println(FuncionesMatematicas.sumatorio(numero));
		System.out.println(FuncionesMatematicas.potencia(a, numero));
		System.out.println(FuncionesMatematicas.serieFibonacci(numero));
	}
}