package boletin2.ejercicio2;

public class Libro {
	
	/*Titulo del libro*/
	private String titulo = "No especificado";
	
	/*Autor del libro*/
	private String autor = "No especificado";
	
	/*Ejemplares disponibles del libro*/
	private int ejemplares = 0;
	
	/*Ejemplares prestados del libro*/
	private int prestados = 0;
	
	/*Genero del libro*/
	Genero genero = Genero.NARRATIVO;
	
	/*Lista con los generos posibles del libro*/
	enum Genero{
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}
	
	/**
	 * Construictor que inicializa los atributos titulo y autor de la clase Libro y comprueba si los
	 * valores introducidos son validos
	 * 
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 */
	public Libro(String titulo, String autor) {
		
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
		
		if(autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
	}
	
	/**
	 * Construictor que inicializa los atributos titulo, autor, ejemplares y prestados de la clase Libro 
	 * y comprueba si los valores introducidos son validos
	 * 
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 * @param ejemplares Ejemplares del libro
	 * @param prestados Ejemplares prestados del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
		
		if(autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
		
		if(ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		
		if(prestados >= 0 && prestados <= ejemplares) {
			this.prestados = prestados;
		}
	}
	
	/**
	 * Construictor que inicializa los atributos titulo, autor, ejemplares, prestados y genero de la clase Libro 
	 * y comprueba si los valores introducidos son validos
	 * 
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 * @param ejemplares Ejmplares del libro
	 * @param prestados Ejemplares prestados del libro
	 * @param genero Genero del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
		
		if(autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
		
		if(ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		
		if(prestados >= 0 && prestados <= ejemplares) {
			this.prestados = prestados;
		}
		
		if(genero != null) {
			switch(genero.toUpperCase()) {
			case "NARRATIVO" ->{
				this.genero = Genero.NARRATIVO;
			}
			case "LIRICO" ->{
				this.genero = Genero.LIRICO;
			}
			case "DRAMATICO" ->{
				this.genero = Genero.DRAMATICO;
			}
			case "DIDACTICO" ->{
				this.genero = Genero.DIDACTICO;
			}
			case "POETICO"->{
				this.genero = Genero.POETICO;
			}
			}
		}
		
	}
	
	/**
	 * Devolvemos el titulo del libro
	 * 
	 * @return Devolvemos el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Devolvemos el autor del libro
	 * 
	 * @return Devolvemos el autor
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Devolvemos los ejemplares que hay del libro
	 * 
	 * @return Devuelve los ejemplares
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	
	/**
	 * Modificamos el numero de ejemplares del libro si el cambio es valido
	 * 
	 * @param ejemplares Numero de ejemplares del libro
	 */
	public void setEjemplares(int ejemplares) {
		if(ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
	}
	
	/**
	 * Devuelve el numero de ejemplares prestados del libro
	 * 
	 * @return Devuelve los ejemplares prestados
	 */
	public int getPrestados() {
		return prestados;
	}
	
	/**
	 * Modificamos los ejemplares del libro prestados si el cambio es valido
	 * 
	 * @param prestados Ejemplares del libro prestado
	 */
	public void setPrestados(int prestados) {
		if(prestados >= 0 && prestados <= ejemplares) {
			this.prestados = prestados;
		}
	}
	
	/**
	 * Devuelve el genero del libro
	 * 
	 * @return Devuelve el genero
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Calcula si quedan ejemplares para realizar un prestamo. Si quedan se le sumaran a libros prestados
	 * y se devolvera true pero si no se ha podido realizar el prestamo se devuelve false
	 * 
	 * @return Devuelve si el prestamo es valido o no
	 */
	public boolean prestamo() {
		boolean valido = false;
		
		if((ejemplares - prestados) > 0) {
			valido = true;
			prestados++;
		}
		
		return valido;
	}
	
	/**
	 * Devuelve el libro prestado a la biblioteca si hay libros prestados y devuelve true pero si no hay
	 * libros prestados no se podra realizar la operacion por lo que devuelve false
	 * 
	 * @return Devuelve si la operacion se ha realizado
	 */
	public boolean devolucion() {
		boolean esValido = false;
		
		if(prestados <= ejemplares && prestados > 0) {
			esValido = true;
			prestados--;
		}
		
		return esValido;
	}
	
	/**
	 * Devuelve la cadena con la informacion del libro
	 * 
	 * @return Devuelve la informacion del libro
	 */
	public String toString() {
		String cadena;
		
		cadena = "Titulo: " + titulo + " - Autor: " + autor + " - Genero: " + genero + " - Ejemplares: " + ejemplares + " - Prestados: " + prestados;
		
		return cadena;
	}
	
	/**
	 * Devuelve true si los libros son iguales o false si no lo son
	 * 
	 * @return Devuelve si los libros son iguales o no
	 */
	public boolean equals(Object obj) {
		
		Libro libro2 = (Libro) obj;
		
		boolean iguales = false;
		
		if(titulo.equalsIgnoreCase(libro2.titulo) && autor.equalsIgnoreCase(libro2.autor)) {
			iguales = true;
		}
		
		return iguales;
	}
}