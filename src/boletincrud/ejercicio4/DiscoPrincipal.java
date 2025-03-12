package boletincrud.ejercicio4;

import java.util.Scanner;

public class DiscoPrincipal {
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la opcion del usuario*/
		int opcion;
		
		/*Creamos una variable para almacenar el codigo*/
		int codigo;
		
		/*Creamos un nuevo objeto disco*/
		Disco disco;
		
		/*Creamos un bucle do while para que mientras la eleccion sea diferente a 4 seguir
		 * repitiendo*/
		do {
			
			/*Mostramos el menu llamando a la funcion*/
			menu();

			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("\n" + "Introduce una opcion");

			/*Leemos la eleccion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario
			 * realizar una funcion u otra*/
			switch (opcion) {

			/*Si la opcion es 1 mostramos los discos llamando a la funcion*/
			case 1 -> {
				System.out.println("Lista de discos:");
				DiscoCRUD.mostrarDisco();
			}

			/*Si la opcion es 2 añadimos un disco*/
			case 2 -> {
				
				/*Creamos un disco llamando a la funcion*/
				disco = creaDisco();
				
				/*Mostramos al usuario si el disco se ha añadido o no*/
				if(DiscoCRUD.añadirDisco(disco)) {
					System.out.println("El disco se ha añadido correctamente");
				} else {
					System.out.println("El disco no se ha añadido");
				}
			}

			/*Si la opcion es 3 eliminamos un disco*/
			case 3 -> {
				
				/*Pedimos al usuario que introduzca el codigo llamando a la funcion*/
				codigo = pedirCodigo();
				
				/*Creamos un nuevo disco*/
				disco = new Disco(codigo);
				
				/*Mostramos al usuario si se ha eliminado el disco o no*/
				if(DiscoCRUD.eliminarDisco(disco)) {
					System.out.println("El disco se ha eliminado correctamente");
				} else {
					System.out.println("El disco no se ha eliminado");
				}
			}

			/*Si la opcion es 4 informamos al usuario de que ha salido del programa*/
			case 4 -> {
				System.out.println("Has salido del programa");
			}
			
			/*Si la opcion no es valida se lo informamos al usuario*/
			default -> {
				System.out.println("Opcion no valida");
			}
			}
		} while (opcion != 4);

		/*Cerramos el Scanner*/
		sc.close();
	}
	
	public static void menu() {
		/* Mostramos el menu al usuario */
		System.out.println("\n" + "Menu:");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Borrar");
		System.out.println("4. Salir");
	}
	
	public static Disco creaDisco() {
		
		/*Creamos una variable para almacenar el codigo*/
		int codigo;
		
		/*Creamos una variable para almacenar el autor*/
		String autor;
		
		/*Creamos una variable para almacenar el titulo*/
		String titulo;
		
		/*Creamos una variable para almacenar la duracion*/
		int duracion;
		
		/*Creamos una variable para almacenar el genero*/
		String genero;
		
		/*Creamos un nuevo disco*/
		Disco disco;
		
		/*Pedimos al usuario que introduzca el codigo llamando a la funcion*/
		codigo = pedirCodigo();
		
		/*Pedimos al usuario que introduzca el autor*/
		System.out.println("Introduce el autor");
		
		/*Leemos el autor del disco*/
		autor = sc.nextLine();
		
		/*Pedimos al usuario que introduzca el titulo*/
		System.out.println("Introduce el titulo");
		
		/*Leemos el titulo del disco*/
		titulo = sc.nextLine();
		
		/*Pedimos al usuario que introduzca la duracion*/
		System.out.println("Introduce la duracion");
		
		/*Leemos la duracion del disco*/
		duracion = sc.nextInt();
		sc.nextLine();
		
		/*Pedimos al usuario que introduzca el genero*/
		System.out.println("Introduce el genero");
		
		/*Leemos el genero del disco*/
		genero = sc.nextLine().toUpperCase();
		
		/*Añadimos los valores al disco*/
		disco = new Disco(codigo, autor, titulo, duracion, genero);
		
		/*Devolvemos el objeto disco*/
		return disco;
	}
	
	private static int pedirCodigo() {
		
		/*Creamos una variable para almacenar el codigo*/
		int codigo;
		
		/*Pedimos al usuario que introduzca el codigo*/
		System.out.println("Introduce el codigo");
		
		/*Leemos el codigo del disco*/
		codigo = sc.nextInt();
		sc.nextLine();
		
		/*Devolvemos el codigo del disco*/
		return codigo;
	}
}