package boletincrud.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {
	
	/**
	 * Creamos un conjunto para almacenar los discos
	 */
	private static Set<Disco> discos = new HashSet<Disco>();
	
	/**
	 * Funcion que muestra los discos del conjunto
	 */
	public static void mostrarDisco() {
		for(Disco disco : discos) {
			System.out.println(disco);
		}
	}
	
	/**
	 * Funcion que añade un nuevo disco al conjunto
	 * 
	 * @param disco Disco que queremos añadir
	 * @return Devuelve true si se ha añadido o false si no se ha podido añadir
	 */
	public static boolean añadirDisco(Disco disco) {
		return discos.add(disco);
	}
	
	/**
	 * Funcion que elimina un disco del conjunto
	 * 
	 * @param disco Disco que queremos eliminar
	 * @return Devuelve true si se ha podido eliminar o false si no se puede eliminar
	 */
	public static boolean eliminarDisco(Disco disco) {
		return discos.remove(disco);
	}
}