package boletincrud.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class GESTISIMAL {
	
	/*Creamos una lista para almacenar los articulos*/
	private static Set<Articulo> articulos = new HashSet<Articulo>();
	
	
	public static void listarArticulos(){
		for(Articulo articulo : articulos) {
			System.out.println(articulo);
		}
	}
	
	
	public static boolean añadirArticulo(Articulo articulo) {
		return articulos.add(articulo);
	}
	
	
	public static boolean eliminarArticulo(Articulo articulo){
		return articulos.remove(articulo);
	}
	
	
	public static boolean modificarArticulo(String nombre, double precio) {
		
		boolean valido = false;
		
		Articulo articulo = buscarArticulo(nombre);
		
		if(articulo != null) {
			articulo.setPrecio(precio);
			valido = true;
		}
		
		return valido;
	}
	
	
	public static boolean entradaMercancia(String nombre, int cantidad) {
		
		boolean valido = false;
		
		Articulo articulo = buscarArticulo(nombre);
		
		if(articulo != null) {
			articulo.setCuantosQuedan(articulo.getCuantosQuedan() + cantidad);
			valido = true;
		}
		
		return valido;
	}
	
	
	public static boolean salidaMercancia(String nombre, int cantidad) {
		
		boolean valido = false;
		
		Articulo articulo = buscarArticulo(nombre);
		
		if(articulo != null) {
			articulo.setCuantosQuedan(articulo.getCuantosQuedan() - cantidad);
			valido = true;
		}
		
		return valido;
	}
	
	
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
