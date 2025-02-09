package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {
		
		/*Creamos dos rectangulos llamando a la clase Rectangulo*/
		Rectangulo rectangulo1 = new Rectangulo(0,0,5,5);
		Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);
		
		/*Indicamos al usuario que son las medidas del rectangulo 1*/
		System.out.println("Rectangulo 1:");
		
		/*Mostramos las coordenadas del rectangulo 1*/
		System.out.println(rectangulo1.toString());
		
		/*Mostramos el perimetro del rectangulo 1*/
		System.out.println("Perimetro: " + rectangulo1.getPerimetro() + " metros");
		
		/*Mostramos el area del rectangulo 1*/
		System.out.println("Area: " + rectangulo1.getArea() + " metros cuadrados");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		
		/*Indicamos al usuario que son las medidas del rectangulo 2*/
		System.out.println("Rectangulo 2:");
		
		/*Mostramos las coordenadas del rectangulo 2*/
		System.out.println(rectangulo2.toString());
		
		/*Mostramos el perimetro del rectangulo 2*/
		System.out.println("Perimetro: " +  rectangulo2.getPerimetro() + " metros");
		
		/*Mostramos el area del rectangulo2*/
		System.out.println("Area: " + rectangulo2.getArea() + " metros cuadrados");
		
		/*Hacemos un salto de line*/
		System.out.println();
		
		/*Cambiamos los datos del rectangulo 1*/
		rectangulo1.setX1X2(rectangulo1.getX1() + 3, rectangulo1.getX2() / 5);
		rectangulo1.setY1Y2(rectangulo1.getY1() - 2, rectangulo1.getY2() * 2);
		
		/*Cambiamos los datos del rectangulo 2*/
		rectangulo2.setX1X2Y1Y2(rectangulo2.getX1() - 5, rectangulo2.getX2() + 7, rectangulo2.getY1() / 3, rectangulo2.getY2() * 2);
	
		/*Indicamos al usuario que son las medidas del rectangulo 1 modificado*/
		System.out.println("Rectangulo 1 modificado:");
		
		/*Mostramos las coordenadas del rectangulo 1*/
		System.out.println(rectangulo1.toString());
		
		/*Mostramos el perimetro del rectangulo 1*/
		System.out.println("Perimetro: " + rectangulo1.getPerimetro() + " metros");
		
		/*Mostramos el area del rectangulo 1*/
		System.out.println("Area: " + rectangulo1.getArea() + " metros cuadrados");
		
		/*Hacemos un salto de linea*/
		System.out.println();

		
		/*Indicamos al usuario que son las medidas del rectangulo 2 modificado*/
		System.out.println("Rectangulo 2 modificado:");
		
		/*Mostramos las coordenadas del rectangulo 2*/
		System.out.println(rectangulo2.toString());
		
		/*Mostramos el perimetro del rectangulo 2*/
		System.out.println("Perimetro: " + rectangulo2.getPerimetro() + " metros");
		
		/*Mostramos el area del rectangulo2*/
		System.out.println("Area: " + rectangulo2.getArea() + " metros cuadrados");
	}
}