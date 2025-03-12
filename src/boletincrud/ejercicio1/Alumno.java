package boletincrud.ejercicio1;

import java.util.Objects;

public class Alumno {
	
	/**
	 * Nombre del alumno
	 */
	private String nombre = "No especificado";
	
	/**
	 * Nota media del alumno
	 */
	private double notaMedia = 0;
	
	/**
	 * Constructor que inicializa los atributos nombre y notaMedia de la clase Alumno y comprueba que son validos
	 * 
	 * @param nombre Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if(notaMedia >= 0) {
			this.notaMedia = notaMedia;
		}
	}
	
	/**
	 * Constructor que inicializa el atributo nombre de la clase Alumno y comprueba que es valido
	 * 
	 * @param nombre Nombre del alumno
	 */
	public Alumno(String nombre) {
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Devolvemos el nombre del alumno
	 * 
	 * @return Nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificamos el nombre del alumno si es valido
	 * 
	 * @param nombre Nombre del alumno
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Devolvemos la nota media del alumno
	 * 
	 * @return Nota media del alumno
	 */
	public double getNotaMedia() {
		return notaMedia;
	}
	
	/**
	 * Modificamos la nota media del alumno si es valida
	 * 
	 * @param notaMedia
	 */
	public void setNotaMedia(double notaMedia) {
		if(notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	
	/**
	 * Devolvemos una cadena con la informacion del alumno
	 * 
	 * @return Cadena con la informacion del alumno
	 */
	@Override
	public String toString() {
		
		String cadena;
		
		cadena = nombre + " " + notaMedia;
		
		return cadena;
	}
	
	/**
	 * Funcion hash de la clase Alumno
	 * 
	 * @return Devuelve el objeto
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	/**
	 * Metodo equals para comparar si los objetos son iguales
	 * 
	 * @return Devuelve true si son iguales o false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		
		Alumno alumno;
		
		alumno = (Alumno) obj;
		
		if(this.nombre.equalsIgnoreCase(alumno.nombre)) {
			igual = true;
		}
		
		return igual;
	}
}