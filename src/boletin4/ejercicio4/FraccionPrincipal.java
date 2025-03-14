package boletin4.ejercicio4;

public class FraccionPrincipal {
	public static void main(String[] args) {
		
		/*Creamos los objetos fracciones*/
		Fraccion fraccion1 = new Fraccion(2,4);
		Fraccion fraccion2 = new Fraccion(5,4);
		
		/*Hacemos las operaciones*/
		System.out.println(fraccion1.sumaFracciones(fraccion2));
		System.out.println(fraccion1.restaFracciones(fraccion2));
		System.out.println(fraccion1.multiplicaFracciones(fraccion2));
		System.out.println(fraccion1.divideFraccion(fraccion2));
		
		/*Cambiamos el valor de la fraccion*/
		fraccion1.setNumerador(2);
		fraccion1.setDenominador(4);
		
		/*Simplificamos la funcion*/
		fraccion1.simplificaFraccion();
		
		/*Mostramos el resultado*/
		System.out.println(fraccion1.toString());
	}
}