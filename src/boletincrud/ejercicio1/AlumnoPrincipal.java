package boletincrud.ejercicio1;

import java.util.Scanner;

public class AlumnoPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la opcion del usuario*/
		int opcion;
		
		/*Creamos una variable para almacenar el nombre del alumno*/
		String nombre;
		
		/*Creamos una variable para almacenar la nota del alumno*/
		double nota;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos varios alumnos*/
		Alumno alumno1 = new Alumno("Pepe Martínez Pérez", 7.7);
		Alumno alumno2 = new Alumno(null, -5.5);
		Alumno alumno3 = new Alumno("Pepe Martínez Pérez", 5.6);
		
		/*Mostramos la informacion de los alumnos*/
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		
		/*Mostramos si los alumnos 1 y 2 son iguales o no*/
		if(alumno1.equals(alumno2)) {
			System.out.println("Los alumnos son iguales");
		} else {
			System.out.println("Los alumnos no son iguales");
		}
		
		/*Mostramos si los alumnos 1 y 3 son iguales o no*/
		if(alumno1.equals(alumno3)) {
			System.out.println("Los alumnos son iguales");
		} else {
			System.out.println("Los alumnos no son iguales");
		}
		
		/*Cambiamos los valores*/
		alumno1.setNombre(null);
		alumno1.setNotaMedia(-5);
		
		alumno2.setNombre("Pepe Martínez Pérez");
		alumno2.setNotaMedia(8);
		
		/*Mostramos los alumnos*/
		System.out.println(alumno1.getNombre() + " " + alumno1.getNotaMedia());
		System.out.println(alumno2.getNombre() + " " + alumno2.getNotaMedia());
		
		/*Creamos un bucle do while para pedir al usuario que introduzca una opcion valida del menu y mostrarle el menu*/
		do {
			/*Mostramos el menu al usuario*/
			System.out.println("\n" + "Menu:");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Alumno");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("\n" + "Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
		}while(opcion < 0 && opcion > 5);
		
		/*Creamos un bucle while para que mientras la eleccion sea diferente a 6 seguir repitiendo*/
		while(opcion != 5) {
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario realizar una funcion u otra*/
			switch(opcion) {
			
			/*Si la opcion es 1 mostramos los alumnos*/
			case 1 ->{
				AlumnoCRUD.listarAlumnos();
			}
			
			/*Si la opcion es 2 añadimos un alumno*/
			case 2 ->{	
				
				/*Pedimos al usuario que introduzca el nombre del alumno*/
				System.out.println("Introduce el nombre del alumno");
				
				/*Leemos el nombre del alumno*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la nota media del alumno*/
				System.out.println("Introduce la nota media del alumno");
				
				/*Leemos la nota del alumno*/
				nota = sc.nextInt();
				
				/*Añadimos los datos al nuevo alumno*/
				Alumno alumno = new Alumno(nombre, nota);
				
				/*Añadimos el alumno a la lista*/
				if(AlumnoCRUD.añadirAlumno(alumno)) {
					System.out.println("Se ha añadido el alumno");
				} else {
					System.out.println("No se ha podido añadir al alumno");
				}
			}
			
			/*Si la opcion es 3 modificamos un alumno*/
			case 3 ->{
				
				/*Pedimos al usuario que introduzca el nombre del alumno*/
				System.out.println("Introduce el nombre del alumno");
				
				/*Leemos el nombre del alumno*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la nota media del alumno*/
				System.out.println("Introduce la nota media del alumno");
				
				/*Leemos la nota del alumno*/
				nota = sc.nextInt();
				
				/*Modificamos el alumno*/
				if(AlumnoCRUD.modificarAlumno(nombre, nota)) {
					System.out.println("Se ha modificado el alumno");
				} else {
					System.out.println("No se ha podido modificar el alumno");
				}
			}
			
			/*Si la opcion es 4 borramos un alumno*/
			case 4 ->{
				
				/*Pedimos al usuario que introduzca el nombre del alumno*/
				System.out.println("Introduce el nombre del alumno");
				
				/*Leemos el nombre del alumno*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la nota media del alumno*/
				System.out.println("Introduce la nota media del alumno");
				
				/*Leemos la nota del alumno*/
				nota = sc.nextInt();
				
				/*Añadimos los datos al nuevo alumno*/
				Alumno alumno = new Alumno(nombre, nota);
				
				/*Borramos el alumno*/
				if(AlumnoCRUD.borrarAlumno(alumno)) {
					System.out.println("Se ha borrado al alumno");
				} else {
					System.out.println("No se ha borrado el alumno");
				}
			}
			}
			
			/*Mostramos el menu al usuario*/
			System.out.println("Menu:");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Alumno");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			
			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("Introduce una opcion");
			
			/*Leemos la eleccion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
		}
		
		/*Mostramos al usuario que ha salido del programa*/
		System.out.println("Has salido del programa");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}