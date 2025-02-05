package boletin1.ejercicio4;

public class PrincipalArticulo {
	public static void main(String[] args) {
		
		/*Creamos los productos llamando a la clase Articulo*/
		Articulo producto1 = new Articulo("Zapatos", 38.95, 8);
		Articulo producto2 = new Articulo(null, -2, -5);
		
		/*Mostramos al usuario los atributos del producto 1*/
		System.out.println(producto1.getNombre() + " - Precio: " + producto1.getPrecio() + "€ - IVA: " + Articulo.IVA + "% - PVP: " + (producto1.getPrecio() + ((producto1.getPrecio() * Articulo.IVA) / 100)) + "€ - Stock: " + producto1.getCuantosQuedan() + " unidades");
		
		/*Mostramos al usuario los atributos del producto 2*/
		System.out.println(producto2.getNombre() + " - Precio: " + producto2.getPrecio() + "€ - IVA: " + Articulo.IVA + "% - PVP: " + (producto2.getPrecio() + ((producto2.getPrecio() * Articulo.IVA) / 100)) + "€ - Stock: " + producto2.getCuantosQuedan() + " unidades");
		
		/*Cambiamos el precio del producto 1*/
		producto1.setPrecio(40.50);
	
		/*Cambiamos los valores a los atributos del producto 2*/
		producto2.setNombre("Camiseta");
		producto2.setPrecio(35);
		producto2.setCuantosQuedan(5);
		
		/*Mostramos al usuario los atributos del producto 1 modificado*/
		System.out.println(producto1.getNombre() + " - Precio: " + producto1.getPrecio() + "€ - IVA: " + Articulo.IVA + "% - PVP: " + (producto1.getPrecio() + ((producto1.getPrecio() * Articulo.IVA) / 100)) + "€ - Stock: " + producto1.getCuantosQuedan() + " unidades");
		
		/*Mostramos al usuario los atributos del producto 2 modificado*/
		System.out.println(producto2.getNombre() + " - Precio: " + producto2.getPrecio() + "€ - IVA: " + Articulo.IVA + "% - PVP: " + (producto2.getPrecio() + ((producto2.getPrecio() * Articulo.IVA) / 100)) + "€ - Stock: " + producto2.getCuantosQuedan() + " unidades");
	}
}