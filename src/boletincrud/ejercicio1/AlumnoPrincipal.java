package boletincrud.ejercicio1;

import java.util.Scanner;

public class AlumnoPrincipal {
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		/* Creamos una variable para almacenar la opcion del usuario */
		int opcion;

		/* Creamos una variable para almacenar el nombre del alumno */
		String nombre;

		/* Creamos una variable para almacenar la nota del alumno */
		double nota;
		
		/*Creamos un nuevo alumno*/
		Alumno alumno;

		/*Creamos un bucle do while para que mientras la eleccion sea diferente a 5 seguir
		 * repitiendo*/
		do {
			
			/*Mostramos el menu llamando a la funcion*/
			menu();

			/* Pedimos al usuario que introduzca una opcion */
			System.out.println("\n" + "Introduce una opcion");

			/* Leemos la eleccion del usuario */
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario
			 * realizar una funcion u otra*/
			switch (opcion) {

			/* Si la opcion es 1 mostramos los alumnos */
			case 1 -> {
				System.out.println("\n" + "Lista de alumnos:");
				AlumnoCRUD.listarAlumnos();
			}

			/* Si la opcion es 2 añadimos un alumno */
			case 2 -> {

				/*Creamos un alumno llamando a la funcion*/
				alumno = creaAlumno();

				/* Añadimos el alumno a la lista */
				if (AlumnoCRUD.añadirAlumno(alumno)) {
					System.out.println("Se ha añadido el alumno");
				} else {
					System.out.println("No se ha podido añadir al alumno");
				}
			}

			/* Si la opcion es 3 modificamos un alumno */
			case 3 -> {

				/* Pedimos al usuario que introduzca el nombre del alumno llamando a la funcion*/
				nombre = pideNombre();

				/* Pedimos al usuario que introduzca la nota media del alumno llamando a la funcion*/
				nota = pideNota();
				
				/* Modificamos el alumno */
				if (AlumnoCRUD.modificarAlumno(nombre, nota)) {
					System.out.println("Se ha modificado el alumno");
				} else {
					System.out.println("No se ha podido modificar el alumno");
				}
			}

			/* Si la opcion es 4 borramos un alumno */
			case 4 -> {

				/* Pedimos al usuario que introduzca el nombre del alumno llamando a la funcion*/
				nombre = pideNombre();
				
				/*Creamos un alumno con el nombre*/
				alumno = new Alumno(nombre);

				/* Borramos el alumno */
				if (AlumnoCRUD.borrarAlumno(alumno)) {
					System.out.println("Se ha borrado al alumno");
				} else {
					System.out.println("No se ha borrado el alumno");
				}
			}
			
			/*Si la opcion es 5 informamos al usuario de que ha salido del programa*/
			case 5 -> {
				/* Mostramos al usuario que ha salido del programa */
				System.out.println("Has salido del programa");
			}
			
			/*Si la opcion no es valida se lo informamos al usuario*/
			default -> {
				System.out.println("Opcion no valida");
			}
			}
		} while (opcion != 5);

		/* Cerramos el Scanner */
		sc.close();
	}
	
	public static void menu() {
		/* Mostramos el menu al usuario */
		System.out.println("\n" + "Menu:");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}
	
	private static String pideNombre() {
		
		/* Creamos una variable para almacenar el nombre del alumno */
		String nombre;
		
		/* Pedimos al usuario que introduzca el nombre del alumno */
		System.out.println("Introduce el nombre del alumno");

		/* Leemos el nombre del alumno */
		nombre = sc.nextLine();
		
		/*Devuelve el nombre del alumno*/
		return nombre;
	}
	
	private static double pideNota() {
		
		/* Creamos una variable para almacenar la nota del alumno */
		double nota;
		
		/* Pedimos al usuario que introduzca la nota media del alumno */
		System.out.println("Introduce la nota media del alumno");

		/* Leemos la nota del alumno */
		nota = sc.nextDouble();
		sc.nextLine();
		
		/*Devolvemos la nota del alumno*/
		return nota;
	}
	
	public static Alumno creaAlumno() {
		
		/* Creamos una variable para almacenar el nombre del alumno */
		String nombre;
		
		/* Creamos una variable para almacenar la nota del alumno */
		double nota;
		
		/*Creamos un Alumno*/
		Alumno alumno;
		
		/* Pedimos al usuario que introduzca el nombre del alumno llamando a la funcion*/
		nombre = pideNombre();

		/* Pedimos al usuario que introduzca la nota media del alumno llamando a la funcion*/
		nota = pideNota();
		
		/* Añadimos los datos al nuevo alumno */
		alumno = new Alumno(nombre, nota);
		
		/*Devolvemos el alumno*/
		return alumno;
	}
}