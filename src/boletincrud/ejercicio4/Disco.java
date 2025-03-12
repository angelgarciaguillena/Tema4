package boletincrud.ejercicio4;

import java.util.Objects;

public class Disco {
	
	/**
	 * Codigo del disco
	 */
	private int codigo = 0;
	
	/**
	 * Autor del disco
	 */
	private String autor = "";
	
	/**
	 * Titulo del disco
	 */
	private String titulo = "";
	
	/**
	 * Duracion del disco
	 */
	private int duracion = 0;
	
	/**
	 * Genero del disco
	 */
	private Genero genero = Genero.ROCK;
	
	/**
	 * Posibles generos del disco
	 */
	enum Genero{
		ROCK,JAZZ,POP,BLUES
	}
	
	/**
	 * Constructor que inicializa los atributos de la clase Disco y 
	 * comprueba si los valores son correctos antes de asignarlos
	 * 
	 * @param codigo Codigo del disco
	 * @param autor Autor del disco
	 * @param titulo Titulo del disco
	 * @param duracion Duracion del disco
	 * @param genero Genero del disco
	 */
	public Disco(int codigo, String autor, String titulo, int duracion, String genero) {
		
		if(codigo >= 0) {
			this.codigo = codigo;
		}
		
		if(autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
		
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
		
		if(duracion >= 0) {
			this.duracion = duracion;
		}
		
		if(genero != null) {
			switch(genero) {
			case "ROCK", "JAZZ", "POP", "BLUES" ->{
				this.genero = Genero.valueOf(genero);
			}
			}
		}
	}
	
	/**
	 * Constructor que inicializa el atributo nombre de la clase Disco y 
	 * comprueba si su valor es correcto antes de asignarlo
	 * 
	 * @param codigo Codigo del disco
	 */
	public Disco(int codigo) {
		if(codigo >= 0) {
			this.codigo = codigo;
		}
	}
	
	/**
	 * Funcion que devuelve el codigo del disco
	 * 
	 * @return Devuelve el codigo del disco
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Funcion que modifica el codigo del disco
	 * 
	 * @param codigo Codigo del disco
	 */
	public void setCodigo(int codigo) {
		if(codigo >= 0) {
			this.codigo = codigo;
		}
	}
	
	/**
	 * Funcion que devuelve el autor del disco
	 * 
	 * @return Devuelve el autor del disco
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Funcion que modifica el autor del disco
	 * 
	 * @param autor Autor del disco
	 */
	public void setAutor(String autor) {
		if(autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
	}
	
	/**
	 * Funcion que devuelve el titulo del disco
	 * 
	 * @return Devuelve el titulo del disco
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Funcion que modifica el titulo del disco
	 * 
	 * @param titulo Titulo del disco
	 */
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
	}
	
	/**
	 * Funcion que devuelve la duracion del disco
	 * 
	 * @return Devuelve la duracion del disco
	 */
	public int getDuracion() {
		return duracion;
	}
	
	/**
	 * Funcion que modifica la duracion del disco
	 * 
	 * @param duracion Duracion del disco
	 */
	public void setDuracion(int duracion) {
		if(duracion >= 0) {
			this.duracion = duracion;
		}
	}
	
	/**
	 * Funcion que devuelve el genero del disco
	 * 
	 * @return Devuelve el genero del disco
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Funcion que modifica el genero del disco
	 * 
	 * @param genero Genero del disco
	 */
	public void setGenero(String genero) {
		if(genero != null) {
			switch(genero.toUpperCase()) {
			case "ROCK", "JAZZ", "POP", "BLUES" ->{
				this.genero = Genero.valueOf(genero);
			}
			}
		}
	}
	
	/**
	 * Metodo que devuelve la informacion del disco
	 * 
	 * @return Devuelve una cadena con la informacion del disco
	 */
	@Override
	public String toString() {
		return codigo + " - " + autor + " - " + titulo + " - " + duracion + " - " + genero;
	}

	/**
	 * Metodo hash de la clase Disco
	 * 
	 * @return Devuelve el disco
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	/**
	 * Metodo que comprueba si los discos son iguales
	 * 
	 * @return Devuelve true si son iguales o false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		
		boolean igual = false;
		
		Disco disco = (Disco) obj;
		
		if(this.codigo == disco.codigo) {
			igual = true;
		}
		
		return igual;
	}
}