package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {
	public static void main(String[] args) {
		
		/*Definimos las dos personas llamando a la clase Persona*/
		Persona persona1;
		Persona persona2;
		
		/*Creamos las variables necesarias para los atributos de la clase*/
		String dni;
		String nombre;
		String apellidos;
		int edad;
		
		/*Creamos una variable para almacenar si es mayor de edad*/
		String esMayor;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Persona 1*/
		/*Pedimos el dni a la primera persona*/
		System.out.println("Introduzca su dni");
		
		/*Leemos el dni de la primera persona*/
		dni = sc.nextLine();
		
		/*Pedimos el nombre a la primera persona*/
		System.out.println("Introduzca su nombre");
		
		/*Leemos el nombre de la primera persona*/
		nombre = sc.nextLine();
		
		/*Pedimos los apellidos a la primera persona*/
		System.out.println("Introduzca sus apellidos");
		
		/*Leemos los apellidos de la primera persona*/
		apellidos = sc.nextLine();
		
		/*Pedimos la edad a la primera persona*/
		System.out.println("Introduzca su edad");
		
		/*Leemos los apellidos de la primera persona*/
		edad = sc.nextInt();
		sc.nextLine();
		
		/*Creamos a la persona 1 y almacenamos los valores de sus atributos*/
		persona1 = new Persona(dni, nombre, apellidos, edad);
		
		/*Persona 2*/
		/*Pedimos el dni a la segunda persona*/
		System.out.println("Introduzca su dni");
		
		/*Leemos el dni de la primera persona*/
		dni = sc.nextLine();
		
		/*Pedimos el nombre a la segunda persona*/
		System.out.println("Introduzca su nombre");
		
		/*Leemos el nombre de la segunda persona*/
		nombre = sc.nextLine();
		
		/*Pedimos los apellidos a la segunda persona*/
		System.out.println("Introduzca sus apellidos");
		
		/*Leemos los apellidos de la primera persona*/
		apellidos = sc.nextLine();
		
		/*Pedimos la edad a la segunda persona*/
		System.out.println("Introduzca su edad");
		
		/*Leemos los apellidos de la segunda persona*/
		edad = sc.nextInt();
		
		/*Creamos a la persona 2 y almacenamos los valores de sus atributos*/
		persona2 = new Persona(dni, nombre, apellidos, edad);
		
		/*Si la persona1 es mayor de edad almacenar el mensaje sino almacenar el otro*/
		esMayor = persona1.getEdad() >= 18 ? "es mayor de edad" : "no es mayor de edad";
		
		/*Mostramos si la persona1 es mayor o menor de edad*/
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + " " + esMayor);
		
		/*Si la persona2 es mayor de edad almacenar el mensaje sino almacenar el otro*/
		esMayor = persona2.getEdad() >= 18 ? "es mayor de edad" : "no es mayor de edad";
		
		/*Mostramos si la persona2 es mayor o menor de edad*/
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + " " + esMayor);
		
		/*Modificamos la edadm de las personas*/
		persona1.setEdad(persona1.getEdad()+2);
		persona2.setEdad(persona2.getEdad()-2);
		
		/*Si la persona1 es mayor de edad almacenar el mensaje sino almacenar el otro*/
		esMayor = persona1.getEdad() >= 18 ? "es mayor de edad" : "no es mayor de edad";
		
		/*Mostramos si la persona1 es mayor o menor de edad*/
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + " " + esMayor);
		
		/*Si la persona2 es mayor de edad almacenar el mensaje sino almacenar el otro*/
		esMayor = persona2.getEdad() >= 18 ? "es mayor de edad" : "no es mayor de edad";
		
		/*Mostramos si la persona2 es mayor o menor de edad*/
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + " " + esMayor);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}