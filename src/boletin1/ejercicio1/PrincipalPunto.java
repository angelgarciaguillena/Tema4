package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {
		
		/*Creamos los tres puntos llamando a la clase Punto con los valores inicializados*/
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);
		
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println("Punto 1 (" + punto1.x + ", " + punto1.y + ")");
		System.out.println("Punto 2(" + punto2.x + ", " + punto2.y + ")");
		System.out.println("Punto 3(" + punto3.x + ", " + punto3.y + ")");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Cambiamos los valores de las coordenadas del punto 1*/
		punto1.x = punto1.x+8;
		punto1.y = punto1.y-2;
		
		/*Cambiamos los valores de las coordenadas del punto 2*/
		punto2.x = punto2.x*2;
		punto2.y = punto2.y/5;
		
		/*Cambiamos los valores de las coordenadas del punto 3*/
		punto3.x = punto3.x+7;
		punto3.y = punto3.y-2;
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println("Punto 1 (" + punto1.x + ", " + punto1.y + ")");
		System.out.println("Punto 2(" + punto2.x + ", " + punto2.y + ")");
		System.out.println("Punto 3(" + punto3.x + ", " + punto3.y + ")");
	}
}
