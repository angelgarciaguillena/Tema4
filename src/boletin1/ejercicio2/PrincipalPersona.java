package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	public static void main(String[] args) {
		
		/*Creamos las dos personas llamando a la clase Persona*/
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		/*Creamos una variable para almacenar si es mayor de edad*/
		String esMayor;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Persona 1*/
		/*Pedimos el dni a la primera persona*/
		System.out.println("Introduzca su dni");
		
		/*Leemos el dni de la primera persona*/
		persona1.dni = sc.nextLine();
		
		/*Pedimos el nombre a la primera persona*/
		System.out.println("Introduzca su nombre");
		
		/*Leemos el nombre de la primera persona*/
		persona1.nombre = sc.nextLine();
		
		/*Pedimos los apellidos a la primera persona*/
		System.out.println("Introduzca sus apellidos");
		
		/*Leemos los apellidos de la primera persona*/
		persona1.apellidos = sc.nextLine();
		
		/*Pedimos la edad a la primera persona*/
		System.out.println("Introduzca su edad");
		
		/*Leemos los apellidos de la primera persona*/
		persona1.edad = sc.nextInt();
		sc.nextLine();
		
		
		/*Persona 2*/
		/*Pedimos el dni a la segunda persona*/
		System.out.println("Introduzca su dni");
		
		/*Leemos el dni de la primera persona*/
		persona2.dni = sc.nextLine();
		
		/*Pedimos el nombre a la segunda persona*/
		System.out.println("Introduzca su nombre");
		
		/*Leemos el nombre de la segunda persona*/
		persona2.nombre = sc.nextLine();
		
		/*Pedimos los apellidos a la segunda persona*/
		System.out.println("Introduzca sus apellidos");
		
		/*Leemos los apellidos de la primera persona*/
		persona2.apellidos = sc.nextLine();
		
		/*Pedimos la edad a la segunda persona*/
		System.out.println("Introduzca su edad");
		
		/*Leemos los apellidos de la segunda persona*/
		persona2.edad = sc.nextInt();
		
		/*Si la persona1 es mayor de edad almacenar el mensaje sino almacenar el otro*/
		esMayor = persona1.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";
		
		/*Mostramos si la persona1 es mayor o menor de edad*/
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " " + esMayor);
		
		/*Si la persona2 es mayor de edad almacenar el mensaje sino almacenar el otro*/
		esMayor = persona2.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";
		
		/*Mostramos si la persona2 es mayor o menor de edad*/
		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " " + esMayor);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}