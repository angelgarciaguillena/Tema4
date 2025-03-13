package boletin4.ejercicio2;

public class ContadorPrincipal {
	public static void main(String[] args) {
		
		/*Creamos un contador*/
		Contador contador = new Contador(10);
		
		/*Incrementamos el contador*/
		contador.incrementa();
		
		/*Mostramos el contador*/
		System.out.println(contador.getCont());
		
		/*Cambiamos el valor del contador*/
		contador.setCont(1);
		
		/*Disminuimos el valor del contador*/
		contador.decrementar();
		
		/*Mostramos el contador*/
		System.out.println(contador.getCont());
		
		/*Disminuimos el valor del contador*/
		contador.decrementar();
		
		/*Mostramos el contador*/
		System.out.println(contador.getCont());
	}
}