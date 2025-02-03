package boletin1.ejercicio3;

public class PrincipalRectangulo {
	public static void main(String[] args) {
		
		/*Creamos dos rectangulos llamando a la clase Rectangulo*/
		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();
		
		/*Inicializamos las coordenadas del rectangulo1*/
		rectangulo1.x1 = 0;
		rectangulo1.y1 = 0;
		rectangulo1.x2 = 5;
		rectangulo1.y2 = 5;
		
		/*Inicializamos las coordenadas del rectangulo1*/
		rectangulo2.x1 = 7;
		rectangulo2.y1 = 9;
		rectangulo2.x2 = 2;
		rectangulo2.y2 = 3;
		
		System.out.println("Rectangulo1:");
		
		/*Mostramos las coordenadas del rectangulo1*/
		System.out.println("Coordenadas (" + rectangulo1.x1 + "," + rectangulo1.y1 + "),(" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
		
		/*Mostramos el perimetro del rectangulo*/
		System.out.println("Perimetro");
			
	}
}
