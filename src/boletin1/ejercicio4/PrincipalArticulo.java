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
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Almacenamos los valores de los precios del producto 1*/
		pvp = producto1.getPVP();
		pvpDescuento = producto1.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 1*/
		System.out.println(producto1.toString());
		System.out.println("PVP sin descuento quiero porritos: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
		/*Preguntamos al usuario cuantos articulos quiere*/
		System.out.println("¿Cuantos articulos quieres?");
		
		/*Leemos el numero de productos que desea el usuarioi*/
		
		/*Almacenamos los valores de los precios del producto 2*/
		pvp = producto2.getPVP();
		pvpDescuento = producto2.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 2*/
		System.out.println(producto2.toString());
		System.out.println("PVP sin descuento: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
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
		
		/*Almacenamos los valores de los precios del producto 2 modificado*/
		pvp = producto2.getPVP();
		pvpDescuento = producto2.getPVPDescuento(descuento);
		
		/*Mostramos al usuario los atributos del producto 2 modificado*/
		System.out.println(producto2.toString());
		System.out.println("PVP sin descuento: " + pvp);
		System.out.println("PVP con descuento: " + pvpDescuento);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}