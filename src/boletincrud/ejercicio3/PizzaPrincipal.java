package boletincrud.ejercicio3;

import java.util.Scanner;

public class PizzaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la opcion del usuario*/
		String opcion;
		
		/*Creamos una variable para almacenar el codigo de la pizza*/
		int codigo;
		
		/*Creamos una variable para almacenar el estado de la pizza*/
		String estado;
		
		/*Creamos una variable para almacenar el tipo de la pizza*/
		String tipo;
		
		/*Creamos una variable para almacenar el tamaño de la pizza*/
		String tamaño;
		
		/*Creamos una pizza*/
		Pizza pizza;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que mientras la eleccion sea diferente a d seguir
		 * repitiendo*/
		do {
			
			/*Mostramos el menu al usuario*/
			System.out.println("\n" + "Menu:");
			System.out.println("a. Listado de pizzas");
			System.out.println("b. Nuevo pedido");
			System.out.println("c. Pizza servida");
			System.out.println("d. Salir");

			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("\n" + "Introduce una opcion");

			/*Leemos la eleccion del usuario*/
			opcion = sc.nextLine().toLowerCase();
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario
			 * realizar una funcion u otra*/
			switch (opcion) {

			/*Si la opcion es a mostramos las pizzas llamando a la funcion*/
			case "a" -> {
				System.out.println("Lista de pizzas:");
				PizzaCRUD.listarPizzas();
			}

			/*Si la opcion es b añadimos una pizza*/
			case "b" -> {
				
				/*Pedimos al usuario que introduzca el codigo de la pizza*/
				System.out.println("Introduce el codigo de la pizza");
				
				/*Leemos el codigo del usuario*/
				codigo = sc.nextInt();
				sc.nextLine();
				
				/*Pedimos al usuario que introduzca el tamaño de la pizza*/
				System.out.println("Introduce el tamaño de la pizza");
				
				/*Leemos el tamaño del usuario*/
				tamaño = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el tipo de la pizza*/
				System.out.println("Introduce el tipo de pizza");
				
				/*Leemos el tipo del usuario*/
				tipo = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el estado de la pizza*/
				System.out.println("Introduce el estado de la pizza");
				
				/*Leemos el estado del usuario*/
				estado = sc.nextLine();
				
				/*Añadimos las caracteristicas al objeto*/
				pizza = new Pizza(codigo, tamaño, tipo, estado);
				
				/*Añadimos la pizza llamando a la funcion*/
				PizzaCRUD.añadirPizza(pizza);
			}

			/*Si la opcion es c modificamos la pizza como que ha sido entregada*/
			case "c" -> {
				
				/*Pedimos al usuario que introduzca el codigo de la pizza*/
				System.out.println("Introduce el codigo de la pizza");
				
				/*Leemos el codigo del usuario*/
				codigo = sc.nextInt();
				sc.nextLine();
				
				/*Mostramos al usuario si se ha modificado la pizza o no*/
				if(PizzaCRUD.modificarPizza(codigo)) {
					System.out.println("La pizza se ha modificado");
				} else {
					System.out.println("La pizza no se ha modificado");
				}
			}
			
			/*Si la opcion es d informamos al usuario de que ha salido del programa*/
			case "d" -> {
				System.out.println("Has salido del programa");
			}
			
			/*Si la opcion no es valida se lo informamos al usuario*/
			default -> {
				System.out.println("Opcion no valida");
			}
			}
		} while(!opcion.equals("d"));
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}