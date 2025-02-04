package boletin1.ejercicio4;

public class Articulo {
	
	/*Inicializamos los atributos de la clase Articulo*/
	String nombre = "Articulo";
	double precio = 0;
	final int IVA = 21;
	int cuantosQuedan = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Articulo y comprueba
	 * que los valores sean validos para almacenarlos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param cuantosQuedan Numero que indica cuantos articulos quedan en el almacen
	 */
	Articulo(String nombre, double precio, int cuantosQuedan){
		
		if(nombre != null && !nombre.isEmpty() && nombre.length() < 20) {
			this.nombre = nombre;
		}
		
		if(precio > 0) {
			this.precio = precio;
		}
		
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
}