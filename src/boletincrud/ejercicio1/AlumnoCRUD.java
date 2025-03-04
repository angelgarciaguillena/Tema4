package boletincrud.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRUD {
	
	/*Creamos una lista para almacenar los alumnos*/
	private static Set<Alumno> alumnos = new HashSet<Alumno>();
	
	public static void listarAlumnos() {
		for(Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}
	
	public static boolean añadirAlumno(Alumno alumno) {
		return alumnos.add(alumno);
	}
	
	public static boolean modificarAlumno(String nombre, double media) {
		boolean esValido = false;
		
		for(Alumno alumno : alumnos) {
			if(alumno.getNombre().equalsIgnoreCase(nombre)) {
				alumno.setNotaMedia(media);
				esValido = true;
			}
		}
		
		return esValido;
	}
	
	public static boolean borrarAlumno(Alumno alumno) {
		return alumnos.remove(alumno);
	}
}
