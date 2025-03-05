package boletincrud.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRUD {
	
	/*Creamos una lista para almacenar los alumnos*/
	private static Set<Alumno> alumnos = new HashSet<Alumno>();
	
	/**
	 * La funcion se encarga de listar a los alumnos existentes
	 */
	public static void listarAlumnos() {
		for(Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}
	
	/**
	 * La funcion se encarga de añadir un nuevo alumno a la lista
	 * 
	 * @param alumno Alumno que se añade
	 * @return Devuelve true si se ha añadido o false si no
	 */
	public static boolean añadirAlumno(Alumno alumno) {
		return alumnos.add(alumno);
	}
	
	/**
	 * La funcion se encarga de modificar un alumno existente en la lista
	 * 
	 * @param nombre Nombre del alumno
	 * @param media Nota del alumno
	 * @return Devuelve true si se ha modificado el alumno o false si no se ha modificado
	 */
	public static boolean modificarAlumno(String nombre, double media) {
		boolean esValido = false;
		
		Alumno alumno = buscarAlumno(nombre);
		
		if(alumno != null) {
			alumno.setNotaMedia(media);
			esValido = true;
		}
		
		return esValido;
	}
	
	/**
	 * La funcion se encarga de borrar al alumno
	 * 
	 * @param alumno Alumno de la lista
	 * @return Devuelve true si se ha borrado o false si no se ha borrado
	 */
	public static boolean borrarAlumno(Alumno alumno) {
		return alumnos.remove(alumno);
	}
	
	/**
	 * La funcion se encarga de buscar a un alumno existente en la lista
	 * 
	 * @param nombre Nombre del alumno
	 * @return Devuelve el alumno
	 */
	public static Alumno buscarAlumno(String nombre) {
		 
		Alumno alumn = null;
		
		for(Alumno alumno : alumnos) {
			if(alumno.getNombre().equalsIgnoreCase(nombre)) {
				alumn = alumno;
			}
		}
		
		return alumn;
	}
}