package boletin1.ejercicio4;

public class PrincipalArticulo {
	public static void main(String[] args) {
		
		/*Creamos los productos llamando a la clase Articulo*/
		Articulo producto1 = new Articulo("Zapatos", 38.95, 8);
		Articulo producto2 = new Articulo(null, -2, -5);
		
		/*Mostramos al usuario los atributos del producto 1*/
		System.out.println(producto1.nombre + " - Precio: " + producto1.precio + "€ - IVA: " + producto1.IVA + "% - PVP: " + (producto1.precio + ((producto1.precio * producto1.IVA) / 100)) + "€ - Stock: " + producto1.cuantosQuedan + " unidades");
		
		/*Mostramos al usuario los atributos del producto 2*/
		System.out.println(producto2.nombre + " - Precio: " + producto2.precio + "€ - IVA: " + producto2.IVA + "% - PVP: " + (producto2.precio + ((producto2.precio * producto2.IVA) / 100)) + "€ - Stock: " + producto2.cuantosQuedan + " unidades");
		
		/*Cambiamos el precio del producto 1*/
		producto1.precio = 40.50;
	
		/*Cambiamos los valores a los atributos del producto 2*/
		producto2.nombre = "Camiseta";
		producto2.precio = 35;
		producto2.cuantosQuedan = 5;
		
		/*Mostramos al usuario los atributos del producto 1 con el nuevo cambio en el precio*/
		System.out.println(producto1.nombre + " - Precio: " + producto1.precio + "€ - IVA: " + producto1.IVA + "% - PVP: " + (producto1.precio + ((producto1.precio * producto1.IVA) / 100)) + "€ - Stock: " + producto1.cuantosQuedan + " unidades");
		
		/*Mostramos al usuario los atributos del producto 2 con el nuevo cambio en el precio*/
		System.out.println(producto2.nombre + " - Precio: " + producto2.precio + "€ - IVA: " + producto2.IVA + "% - PVP: " + (producto2.precio + ((producto2.precio * producto2.IVA) / 100)) + "€ - Stock: " + producto2.cuantosQuedan + " unidades");
	}
}