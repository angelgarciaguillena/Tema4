package boletin1.ejercicio1;

public class PrincipalPunto {
	public static void main(String[] args) {
		
		/*Creamos los tres puntos llamando a la clase Punto con los valores inicializados*/
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);
		Punto p = new Punto(10, 10);
		
		/*Creamos una variable para almacenar la distancia*/
		double distancia;
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Cambiamos los valores de las coordenadas del punto 1*/
		punto1.setXY(3,6);
		
		/*Cambiamos los valores de las coordenadas del punto 2*/
		punto2.setXY(4,8);
		
		/*Cambiamos los valores de las coordenadas del punto 3*/
		punto3.setXY(2,4);
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());
		
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
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Cambiamos los valores de las coordenadas del punto 1*/
		punto1.desplaza(4, 1);
		
		/*Cambiamos los valores de las coordenadas del punto 2*/
		punto2.desplaza(3, 3);
		
		/*Cambiamos los valores de las coordenadas del punto 3*/
		punto3.desplaza(6, 7);
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());
		
		/*Comparamos la distancia entre el punto 1 y el punto P y lo mostramos por pantalla*/
		distancia = punto1.distancia(p);
		System.out.println("La distancia es " + distancia);
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Imprimimos las coordenadas por pantalla*/
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());
	}
}