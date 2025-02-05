package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {
		
		/*Creamos dos rectangulos llamando a la clase Rectangulo*/
		Rectangulo rectangulo1 = new Rectangulo(0,0,5,5);
		Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);
		
		/*Creamos una variable para almacenar la altura del rectangulo*/
		int altura;
		
		/*Creamos una variable para almacenar el ancho del rectangulo*/
		int ancho;
		
		/*Indicamos al usuario que son las medidas del rectangulo 1*/
		System.out.println("Rectangulo 1:");
		
		/*Almacenamos el ancho del rectangulo 1*/
		ancho = Math.abs(rectangulo1.getX2() - rectangulo1.getX1());
		
		/*Almacenamos la altura del rectangulo 1*/
		altura = Math.abs(rectangulo1.getY2() - rectangulo1.getY1());
		
		/*Mostramos las coordenadas del rectangulo 1*/
		System.out.println("Coordenadas (" + rectangulo1.getX1() + "," + rectangulo1.getY1() + "),(" + rectangulo1.getX2() + "," + rectangulo1.getY2() + ")");
		
		/*Mostramos el perimetro del rectangulo 1*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo 1*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		
		/*Indicamos al usuario que son las medidas del rectangulo 2*/
		System.out.println("Rectangulo 2:");
		
		/*Almacenamos el ancho del rectangulo 2*/
		ancho = Math.abs(rectangulo2.getX2() - rectangulo2.getX1());
		
		/*Almacenamos la altura del rectangulo 2*/
		altura = Math.abs(rectangulo2.getY2() - rectangulo2.getY1());
		
		/*Mostramos las coordenadas del rectangulo 2*/
		System.out.println("Coordenadas (" + rectangulo2.getX1() + "," + rectangulo2.getY1() + "),(" + rectangulo2.getX2() + "," + rectangulo2.getY2() + ")");
		
		/*Mostramos el perimetro del rectangulo 2*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo2*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
		
		/*Hacemos un salto de line*/
		System.out.println();
		
		/*Cambiamos los datos del rectangulo 1*/
		rectangulo1.setX1(rectangulo1.getX1() + 3);
		rectangulo1.setY1(rectangulo1.getY1() - 2);
		rectangulo1.setX2(rectangulo1.getX2() / 5);
		rectangulo1.setY2(rectangulo1.getY2() * 2);
		
		/*Cambiamos los datos del rectangulo 2*/
		rectangulo2.setX1(rectangulo2.getX1() + 7);
		rectangulo2.setY1(rectangulo2.getY1() - 4);
		rectangulo2.setX2(rectangulo2.getX2() / 2);
		rectangulo2.setY2(rectangulo2.getY2() * 2);
		
		/*Indicamos al usuario que son las medidas del rectangulo 1 modificado*/
		System.out.println("Rectangulo 1 modificado:");
		
		/*Almacenamos el ancho del rectangulo 1*/
		ancho = Math.abs(rectangulo1.getX2() - rectangulo1.getX1());
		
		/*Almacenamos la altura del rectangulo 1*/
		altura = Math.abs(rectangulo1.getY2() - rectangulo1.getY1());
		
		/*Mostramos las coordenadas del rectangulo 1*/
		System.out.println("Coordenadas (" + rectangulo1.getX1() + "," + rectangulo1.getY1() + "),(" + rectangulo1.getX2() + "," + rectangulo1.getY2() + ")");
		
		/*Mostramos el perimetro del rectangulo 1*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo 1*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
		
		/*Hacemos un salto de linea*/
		System.out.println();

		
		/*Indicamos al usuario que son las medidas del rectangulo 2 modificado*/
		System.out.println("Rectangulo 2 modificado:");
		
		/*Almacenamos el ancho del rectangulo 2*/
		ancho = Math.abs(rectangulo2.getX2() - rectangulo2.getX1());
		
		/*Almacenamos la altura del rectangulo 2*/
		altura = Math.abs(rectangulo2.getY2() - rectangulo2.getY1());
		
		/*Mostramos las coordenadas del rectangulo 2*/
		System.out.println("Coordenadas (" + rectangulo2.getX1() + "," + rectangulo2.getY1() + "),(" + rectangulo2.getX2() + "," + rectangulo2.getY2() + ")");
		
		/*Mostramos el perimetro del rectangulo 2*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo2*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
	}
}