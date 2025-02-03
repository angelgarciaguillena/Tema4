package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {
		
		/*Creamos dos rectangulos llamando a la clase Rectangulo*/
		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();
		
		/*Creamos una variable para almacenar la altura del rectangulo*/
		int altura;
		
		/*Creamos una variable para almacenar el ancho del rectangulo*/
		int ancho;
		
		/*Inicializamos las coordenadas del rectangulo 1*/
		rectangulo1.x1 = 0;
		rectangulo1.y1 = 0;
		rectangulo1.x2 = 5;
		rectangulo1.y2 = 5;
		
		/*Inicializamos las coordenadas del rectangulo 2*/
		rectangulo2.x1 = 7;
		rectangulo2.y1 = 9;
		rectangulo2.x2 = 2;
		rectangulo2.y2 = 3;
		
		/*Indicamos al usuario que son las medidas del rectangulo 1*/
		System.out.println("Rectangulo 1:");
		
		/*Almacenamos el ancho del rectangulo 1*/
		ancho = Math.abs(rectangulo1.x2 - rectangulo1.x1);
		
		/*Almacenamos la altura del rectangulo 1*/
		altura = Math.abs(rectangulo1.y2 - rectangulo1.y1);
		
		/*Mostramos las coordenadas del rectangulo 1*/
		System.out.println("Coordenadas (" + rectangulo1.x1 + "," + rectangulo1.y1 + "),(" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
		
		/*Mostramos el perimetro del rectangulo 1*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo 1*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		
		/*Indicamos al usuario que son las medidas del rectangulo 2*/
		System.out.println("Rectangulo 2:");
		
		/*Almacenamos el ancho del rectangulo 2*/
		ancho = Math.abs(rectangulo2.x2 - rectangulo2.x1);
		
		/*Almacenamos la altura del rectangulo 2*/
		altura = Math.abs(rectangulo2.y2 - rectangulo2.y1);
		
		/*Mostramos las coordenadas del rectangulo 2*/
		System.out.println("Coordenadas (" + rectangulo2.x1 + "," + rectangulo2.y1 + "),(" + rectangulo2.x2 + "," + rectangulo2.y2 + ")");
		
		/*Mostramos el perimetro del rectangulo 2*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo2*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
		
		/*Hacemos un salto de line*/
		System.out.println();
		
		/*Cambiamos los datos del rectangulo 1*/
		rectangulo1.x1 = 0 + 3;
		rectangulo1.y1 = 0 + 2;
		rectangulo1.x2 = 5 / 5;
		rectangulo1.y2 = 5 * 2;
		
		/*Cambiamos los datos del rectangulo 2*/
		rectangulo2.x1 = 7 + 7;
		rectangulo2.y1 = 9 - 4;
		rectangulo2.x2 = 2 / 2;
		rectangulo2.y2 = 3 * 2;
		
		
		/*Indicamos al usuario que son las medidas del rectangulo 1 modificado*/
		System.out.println("Rectangulo 1 modificado:");
		
		/*Almacenamos el ancho del rectangulo 1*/
		ancho = Math.abs(rectangulo1.x2 - rectangulo1.x1);
		
		/*Almacenamos la altura del rectangulo 1*/
		altura = Math.abs(rectangulo1.y2 - rectangulo1.y1);
		
		/*Mostramos las coordenadas del rectangulo 1*/
		System.out.println("Coordenadas (" + rectangulo1.x1 + "," + rectangulo1.y1 + "),(" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
		
		/*Mostramos el perimetro del rectangulo 1*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo 1*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		
		/*Indicamos al usuario que son las medidas del rectangulo 2 modificado*/
		System.out.println("Rectangulo 2 modificado:");
		
		/*Almacenamos el ancho del rectangulo 2*/
		ancho = Math.abs(rectangulo2.x2 - rectangulo2.x1);
		
		/*Almacenamos la altura del rectangulo 2*/
		altura = Math.abs(rectangulo2.y2 - rectangulo2.y1);
		
		/*Mostramos las coordenadas del rectangulo 2*/
		System.out.println("Coordenadas (" + rectangulo2.x1 + "," + rectangulo2.y1 + "),(" + rectangulo2.x2 + "," + rectangulo2.y2 + ")");
		
		/*Mostramos el perimetro del rectangulo 2*/
		System.out.println("Perimetro: " + ((altura * 2) + (ancho * 2)) + " metros");
		
		/*Mostramos el area del rectangulo2*/
		System.out.println("Area: " + (altura * ancho) + " metros cuadrados");
	}
}