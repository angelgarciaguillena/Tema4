package boletin1.ejercicio4;

public class Articulo {
	
	/*Inicializamos los atributos de la clase Articulo*/
	private String nombre = "Articulo";
	private double precio = 0;
	public static final int IVA = 21;
	private int cuantosQuedan = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Articulo y comprueba
	 * que los valores sean validos para almacenarlos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param cuantosQuedan Numero que indica cuantos articulos quedan en el almacen
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan){
		
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
	
	/**
	 * Mostramos el nombre del articulo
	 * 
	 * @return Devuelve el nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificamos el nombre del articulo y comprobamos si es valido
	 * 
	 * @param nombre Nombre del articulo
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Mostramos el precio del articulo
	 * 
	 * @return Devuelve el precio del articulo
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Modificamos el precio del articulo y comprobamos si es valido
	 * 
	 * @param precio Precio del articulo
	 */
	public void setPrecio(double precio) {
		if(precio >= 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * Mostramos el stock del articulo
	 * 
	 * @return Devuelve el stock del articulo
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	/**
	 * Modificamos el stock del articulo y comprobamos si es valido
	 * 
	 * @param cuantosQuedan Stock del articulo
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
}