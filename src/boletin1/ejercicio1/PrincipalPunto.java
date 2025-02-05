package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {
		
		/*Creamos los tres puntos llamando a la clase Punto con los valores inicializados*/
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);
		
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println("Punto 1 (" + punto1.getX() + ", " + punto1.getY() + ")");
		System.out.println("Punto 2(" + punto2.getX() + ", " + punto2.getY() + ")");
		System.out.println("Punto 3(" + punto3.getX() + ", " + punto3.getY() + ")");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Cambiamos los valores de las coordenadas del punto 1*/
		punto1.setX(punto1.getX()+8);
		punto1.setY(punto1.getY()-2);
		
		/*Cambiamos los valores de las coordenadas del punto 2*/
		punto2.setX(punto2.getX()*2);
		punto2.setY(punto2.getY()/5);
		
		/*Cambiamos los valores de las coordenadas del punto 3*/
		punto3.setX(punto3.getX()+7);
		punto3.setY(punto3.getY()-2);
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println("Punto 1 (" + punto1.getX() + ", " + punto1.getY() + ")");
		System.out.println("Punto 2(" + punto2.getX() + ", " + punto2.getY() + ")");
		System.out.println("Punto 3(" + punto3.getX() + ", " + punto3.getY() + ")");
	}
}