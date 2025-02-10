package boletin1.ejercicio4;

import java.util.Scanner;

public class PrincipalArticulo {
	public static void main(String[] args) {
		
		/*Creamos los productos llamando a la clase Articulo*/
		Articulo producto1 = new Articulo("Zapatos", 38.95, 8);
		Articulo producto2 = new Articulo(null, -2, -5);
		
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
		
		/*Avisamos al usuario si la compra se ha realizado correctamente*/
		realizada = producto2.vende(comprados);
		if(realizada) {
			/*Mostramos el precio total al usuario*/
			System.out.println("Precio total sin descuento: " + (pvp * comprados));
			System.out.println("Precio total con descuento: " + (pvpDescuento * comprados));
		} else {
			System.out.println("No se ha realizado la compra");
		}
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}