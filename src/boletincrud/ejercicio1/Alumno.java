package boletincrud.ejercicio1;

public class Alumno {
	
	/*Nombre del alumno*/
	private String nombre = "No especificado";
	
	/*Nota media del alumno*/
	private double notaMedia = 0;
	
	/**
	 * Constructor que inicializa los atributos nombre y notaMedia de la clase Alumno y comprueba que son validos
	 * 
	 * @param nombre Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		
		if(nombre != null) {
			this.nombre = nombre;
		}
		
		if(notaMedia >= 0) {
			this.notaMedia = notaMedia;
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
		if(nombre != null) {
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
	public String toString() {
		
		String cadena;
		
		cadena = nombre + " " + notaMedia;
		
		return cadena;
	}
	
	/**
	 * Devolvemos si dos alumnos son iguales o no
	 * 
	 * @return Devolvemos true si son iguales o false si no
	 */
	public boolean equals(Object obj) {
		
		Alumno alumno2 = (Alumno) obj;
		
		boolean sonIguales = false;
		
		if(this.nombre.equalsIgnoreCase(alumno2.nombre)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
}