package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {
		
		/*Creamos los tres puntos llamando a la clase Punto*/
		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		Punto punto3 = new Punto();
		
		/*Asignamos valores a las coordenadas del punto 1*/
		punto1.x = 5;
		punto1.y = 0;
		
		/*Asignamos valores a las coordenadas del punto 2*/
		punto2.x = 10;
		punto2.y = 10;
		
		/*Asignamos valores a las coordenadas del punto 3*/
		punto3.x = -3;
		punto3.y = 7;
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println("Punto 1 (" + punto1.x + ", " + punto1.y + ")");
		System.out.println("Punto 2(" + punto2.x + ", " + punto2.y + ")");
		System.out.println("Punto 3(" + punto3.x + ", " + punto3.y + ")");
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Cambiamos los valores de las coordenadas del punto 1*/
		punto1.x = 5+8;
		punto1.y = 0-2;
		
		/*Cambiamos los valores de las coordenadas del punto 2*/
		punto2.x = 10*2;
		punto2.y = 10/5;
		
		/*Cambiamos los valores de las coordenadas del punto 3*/
		punto3.x = -3+7;
		punto3.y = 7-2;
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println("Punto 1 (" + punto1.x + ", " + punto1.y + ")");
		System.out.println("Punto 2(" + punto2.x + ", " + punto2.y + ")");
		System.out.println("Punto 3(" + punto3.x + ", " + punto3.y + ")");
	}
}
