package boletincrud.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class GESTISIMAL {
	
	/**
	 * Creamos una lista para almacenar los articulos
	 */
	private static Set<Articulo> articulos = new HashSet<Articulo>();
	
	/**
	 * Funcion para mostrar todos los articulos de la lista
	 */
	public static void listarArticulos(){
		for(Articulo articulo : articulos) {
			System.out.println(articulo);
		}
	}
	
	/**
	 * Funcion para añadir un nuevo articulo a la lista
	 * 
	 * @param articulo Articulo para añadir
	 * @return Devuelve true si se ha añadido o false si no se ha realizado
	 */
	public static boolean añadirArticulo(Articulo articulo) {
		return articulos.add(articulo);
	}
	
	/**
	 * Funcion para eliminar un articulo de la lista
	 * 
	 * @param articulo Articulo a eliminar
	 * @return Devuelve true si se ha eliminado o false si no se ha eliminado
	 */
	public static boolean eliminarArticulo(Articulo articulo){
		return articulos.remove(articulo);
	}
	
	/**
	 * Funcion para modificar un articulo de la lista
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Cambio de precio del producto
	 * @return Devuelve true si se ha modificado o false si no se ha modificado
	 */
	public static boolean modificarArticulo(String nombre, double precio) {
		
		boolean valido = false;
		
		Articulo articulo = buscarArticulo(nombre);
		
		if(articulo != null) {
			articulo.setPrecio(precio);
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Funcion para añadir mas mercancia al stock
	 * 
	 * @param nombre Nombre del producto
	 * @param cantidad Cantidad que se añade al stock
	 * @return Devuelve true si se ha realizado la suma o false si no se ha realizado el añadido
	 */
	public static boolean entradaMercancia(String nombre, int cantidad) {
		
		boolean valido = false;
		
		Articulo articulo = buscarArticulo(nombre);
		
		if(articulo != null) {
			articulo.setCuantosQuedan(articulo.getCuantosQuedan() + cantidad);
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Funcion para restar mercancia al stock
	 * 
	 * @param nombre Nombre del producto
	 * @param cantidad Cantidad que se elimina del stock
	 * @return Devuelve true si se ha eiminado o false si no se ha eliminado
	 */
	public static boolean salidaMercancia(String nombre, int cantidad) {
		
		boolean valido = false;
		
		Articulo articulo = buscarArticulo(nombre);
		
		if(articulo != null) {
			articulo.setCuantosQuedan(articulo.getCuantosQuedan() - cantidad);
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Funcion para buscar un articulo en la lista
	 * 
	 * @param nombre Nombre del articulo
	 * @return Devuelve el articulo si se ha encontrado o null si no se ha encontrado
	 */
	public static Articulo buscarArticulo(String nombre) {
		
		Articulo art = null;
		
		for(Articulo articulo : articulos) {
			if(articulo.getNombre().equalsIgnoreCase(nombre)) {
				art = articulo;
			}
		}
		
		return art;
	}
}