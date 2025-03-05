package boletincrud.ejercicio2;

import java.util.Scanner;

public class PrincipalArticulo {
	public static void main(String[] args) {
		
		/*Creamos un nuevo articulo*/
		Articulo articulo;
		
		/*Creamos los productos llamando a la clase Articulo*/
		Articulo producto1 = new Articulo("Zapatos", 38.95, 8);
		Articulo producto2 = new Articulo(null, -2, -5);
		
		/* Creamos una variable para almacenar la opcion del usuario */
		String opcion;
		
		/*Creamos una variable que almacena el descuento de un producto*/
		int descuento = 30;
		
		/*Creamos una variable para almacenar el pvp sin descuento*/
		double pvp;
		
		/*Creamos una variable para almacenar el pvp con descuento*/
		double pvpDescuento;
		
		/*Creamos una variable para almacenar los productos comprados por el usuario*/
		int comprados;
		
		/*Creamos una variable para almacenar cuantos articulos hay de un producto*/
		int cantidad;
		
		/*Creamos una variable para almacenar si la compra es valida*/
		boolean realizada;
		
		/*Creamos una variable que almacenara el nombre del producto*/
		String nombre;
		
		/*Creamos una variable que almacenara el cambio en el stock*/
		int cambio;
		
		/*Creamos una variable que almacenara el precio del articulo*/
		double precio;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Preguntamos al usuario cuantos articulos hay del producto*/
		System.out.println("¿Cuantos articulos hay del producto 1?");
		
		/*Leemos el numero de articulos del producto*/
		cantidad = sc.nextInt();
		
		/*Actualizamos el stock llamando a la funcion*/
		producto1.almacenar(cantidad);
		
		/*Preguntamos al usuario cuantos articulos hay del producto*/
		System.out.println("¿Cuantos articulos hay del producto 2?");
		
		/*Leemos el numero de articulos del producto*/
		cantidad = sc.nextInt();
		
		/*Actualizamos el stock llamando a la funcion*/
		producto2.almacenar(cantidad);
		
		/*Almacenamos los valores de los precios del producto 1*/
		pvp = producto1.getPVP();
		pvpDescuento = producto1.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 1*/
		System.out.println(producto1.toString());
		System.out.println("PVP sin descuento quiero porritos: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
		/*Preguntamos al usuario cuantos articulos quiere*/
		System.out.println("¿Cuantos articulos quieres?");
		
		/*Leemos el numero de productos que desea el usuario*/
		comprados = sc.nextInt();
		
		/*Avisamos al usuario si la compra se ha realizado correctamente*/
		realizada = producto1.vende(comprados);
		if(realizada) {
			/*Mostramos el precio total al usuario*/
			System.out.println("Precio total sin descuento: " + (pvp * comprados));
			System.out.println("Precio total con descuento: " + (pvpDescuento * comprados));
		} else {
			System.out.println("No se ha realizado la compra");
		}
		
		/*Almacenamos los valores de los precios del producto 2*/
		pvp = producto2.getPVP();
		pvpDescuento = producto2.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 2*/
		System.out.println(producto2.toString());
		System.out.println("PVP sin descuento: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
		/*Preguntamos al usuario cuantos articulos quiere*/
		System.out.println("¿Cuantos articulos quieres?");
		
		/*Leemos el numero de productos que desea el usuario*/
		comprados = sc.nextInt();
		
		/*Avisamos al usuario si la compra se ha realizado correctamente*/
		realizada = producto2.vende(comprados);
		if(realizada) {
			/*Mostramos el precio total al usuario*/
			System.out.println("Precio total sin descuento: " + (pvp * comprados));
			System.out.println("Precio total con descuento: " + (pvpDescuento * comprados));
		} else {
			System.out.println("No se ha realizado la compra");
		}
		
		/*Cambiamos el precio del producto 1*/
		producto1.setPrecio(40.50);
	
		/*Cambiamos los valores a los atributos del producto 2*/
		producto2.setNombre("Camiseta");
		producto2.setPrecio(35);
		producto2.setCuantosQuedan(5);
		
		/*Almacenamos los valores de los precios del producto 1 modificado*/
		pvp = producto1.getPVP();
		pvpDescuento = producto1.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 1 modificado*/
		System.out.println(producto1.toString());
		System.out.println("PVP sin descuento: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
		/*Preguntamos al usuario cuantos articulos quiere*/
		System.out.println("¿Cuantos articulos quieres?");
		
		/*Leemos el numero de productos que desea el usuario*/
		comprados = sc.nextInt();
		
		/*Avisamos al usuario si la compra se ha realizado correctamente*/
		realizada = producto1.vende(comprados);
		if(realizada) {
			/*Mostramos el precio total al usuario*/
			System.out.println("Precio total sin descuento: " + (pvp * comprados));
			System.out.println("Precio total con descuento: " + (pvpDescuento * comprados));
		} else {
			System.out.println("No se ha realizado la compra");
		}
		
		/*Almacenamos los valores de los precios del producto 2 modificado*/
		pvp = producto2.getPVP();
		pvpDescuento = producto2.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 2 modificado*/
		System.out.println(producto2.toString());
		System.out.println("PVP sin descuento: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
		/*Preguntamos al usuario cuantos articulos quiere*/
		System.out.println("¿Cuantos articulos quieres?");
		
		/*Leemos el numero de productos que desea el usuario*/
		comprados = sc.nextInt();
		sc.nextLine();
		
		/*Avisamos al usuario si la compra se ha realizado correctamente*/
		realizada = producto2.vende(comprados);
		if(realizada) {
			/*Mostramos el precio total al usuario*/
			System.out.println("Precio total sin descuento: " + (pvp * comprados));
			System.out.println("Precio total con descuento: " + (pvpDescuento * comprados));
		} else {
			System.out.println("No se ha realizado la compra");
		}
		
		/*Creamos un bucle do while para que mientras la eleccion sea diferente a 6 seguir
		 * repitiendo*/
		do {
			
			/*Mostramos el menu al usuario*/
			System.out.println("\n" + "Menu:");
			System.out.println("a. Listado");
			System.out.println("b. Alta");
			System.out.println("c. Baja");
			System.out.println("d. Modificacion");
			System.out.println("e. Entrada de mercancia");
			System.out.println("f. Salida de mercancia");
			System.out.println("g. Salir");


			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("\n" + "Introduce una opcion");

			/*Leemos la eleccion del usuario*/
			opcion = sc.nextLine().toLowerCase();
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario
			 * realizar una funcion u otra*/
			switch (opcion) {

			/*Si la opcion es a mostramos los articulos*/
			case "a" -> {
				System.out.println("Listado de articulos");
				GESTISIMAL.listarArticulos();
			}

			/*Si la opcion es b añadimos un articulo*/
			case "b" -> {
				
				/*Pedimos al usuario que introduzca el nombre del articulo*/
				System.out.println("Introduce el nombre del articulo");
				
				/*Leemos el nombre del usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca su precio*/
				System.out.println("introduce el precio del producto");
				
				/*Leemos el precio del producto*/
				precio = sc.nextDouble();
				
				/*Pedimos al usuario que introduzca el stock del articulo*/
				System.out.println("Introduce la cantidad del articulo");
				
				/*Leemos la cantidad del articulo*/
				cantidad = sc.nextInt();
				
				/*Añadimos los datos al articulo*/
				articulo = new Articulo(nombre, precio, cantidad);
				
				/*Llamamos a la funcion para añadir el articulo*/
				if(GESTISIMAL.añadirArticulo(articulo)) {
					System.out.println("El articulo se ha añadido correctamente");
				} else {
					System.out.println("El articulo no se ha añadido");
				}
			}

			/*Si la opcion es c eliminamos un articulo*/
			case "c" -> {
				/*Pedimos al usuario que introduzca el nombre del articulo*/
				System.out.println("Introduce el nombre del articulo");
				
				/*Leemos el nombre del usuario*/
				nombre = sc.nextLine();
				
				/*Buscamos el articulo*/
				articulo = GESTISIMAL.buscarArticulo(nombre);
				
				/*Llamamos a la funcion para eliminar el articulo*/
				if(GESTISIMAL.eliminarArticulo(articulo)) {
					System.out.println("El articulo se ha eliminado correctamente");
				} else {
					System.out.println("El articulo no se ha eliminado");
				}
			}

			/*Si la opcion es d modificamos un articulo*/
			case "d" -> {
				
				/*Pedimos al usuario que introduzca el nombre del articulo*/
				System.out.println("Introduce el nombre del articulo");
				
				/*Leemos el nombre del usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca su precio*/
				System.out.println("introduce el precio del producto");
				
				/*Leemos el precio del producto*/
				precio = sc.nextDouble();
				
				/*Llamamos a la funcion para modificar el articulo*/
				if(GESTISIMAL.modificarArticulo(nombre, precio)) {
					System.out.println("El articulo se ha modificado correctamente");
				} else {
					System.out.println("El articulo no se ha modificado");
				}
			}
			
			/*Si la opcion es e añadimos mercancia al stock*/
			case "e" -> {
				
				/*Pedimos al usuario que introduzca el nombre del articulo*/
				System.out.println("Introduce el nombre del articulo");
				
				/*Leemos el nombre del usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la cantidad entrante del stock*/
				System.out.println("Introduce la cantidad de entrada del articulo");
				
				/*Leemos la cantidad del articulo*/
				cambio = sc.nextInt();
				
				/*Llamamos a la funcion para añadir la cantidad de entrada al stock*/
				if(GESTISIMAL.entradaMercancia(nombre, cambio)) {
					System.out.println("Se ha realizado la entrada de la mercancia");
				} else {
					System.out.println("La entrada de mercancia no se ha realizado");
				}
			}
			
			/*Si la opcion es f eliminamos mercancia al stock*/
			case "f" -> {
				
				/*Pedimos al usuario que introduzca el nombre del articulo*/
				System.out.println("Introduce el nombre del articulo");
				
				/*Leemos el nombre del usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca la cantidad de salida del stock*/
				System.out.println("Introduce la cantidad de salida del articulo");
				
				/*Leemos la cantidad del articulo*/
				cambio = sc.nextInt();
				
				/*Llamamos a la funcion para eliminar la cantidad de salida al stock*/
				if(GESTISIMAL.salidaMercancia(nombre, cambio)) {
					System.out.println("Se ha realizado la salida de la mercancia");
				} else {
					System.out.println("La salida de mercancia no se ha realizado");
				}
			}
			
			/*Si la opcion es g informamos al usuario de que ha salido del programa*/
			case "g" -> {
				
				/* Mostramos al usuario que ha salido del programa */
				System.out.println("Has salido del programa");
			}
			
			/*Si la opcion no es valida se lo informamos al usuario*/
			default -> {
				System.out.println("Opcion no valida");
			}
			}
		} while(opcion != "g");
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}