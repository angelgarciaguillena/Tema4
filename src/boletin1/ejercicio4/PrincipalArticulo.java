package boletin1.ejercicio4;

public class PrincipalArticulo {
	public static void main(String[] args) {
		
		/*Creamos un objeto llamando a la clase Articulo*/
		Articulo producto = new Articulo();
		
		/*Aignamos valores a los atributos del producto*/
		producto.nombre = "Zapatos";
		producto.precio = 38.95;
		producto.cuantosQuedan = 8;
		
		/*Mostramos al usuario los atributos del producto*/
		System.out.println(producto.nombre + " - Precio: " + producto.precio + "€ - IVA: " + producto.IVA + "% - PVP: " + (producto.precio + ((producto.precio * producto.IVA) / 100)) + "€");
		
		/*Cambiamos el precio del producto*/
		producto.precio = 40.50;
		
		/*Mostramos al usuario los atributos del producto con el nuevo cambio en el precio*/
		System.out.println(producto.nombre + " - Precio: " + producto.precio + "€ - IVA: " + producto.IVA + "% - PVP: " + (producto.precio + ((producto.precio * producto.IVA) / 100)) + "€");
	}
}