package boletin3.ejercicio6;

public class FuncionesMatematicas {
	
	static int sumatorio(int numero) {
		
		int suma = 0;
		
		if(numero == 1) {
			suma = numero;
		} else {
			suma += numero + sumatorio(numero - 1);
		}
		
		return suma;
	}
}
