package boletin1.ejercicio2;

public class Persona {
	
	/*Inicializamos los atributos de Persona privados*/
	private String dni = "12345678A";
	private String nombre = "Nombre";
	private String apellidos = "Apellidos";
	private int edad = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Persona y
	 * comprueba si los valores son validos
	 * 
	 * @param dni Numero de identificacion
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad Edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad){
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		}
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if(apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		}
		
		if(edad >= 0) {
			this.edad = edad;
		}
	}
	
	/**
	 * Mostramos el dni
	 * 
	 * @return Devuelve dni
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Mostramos el nombre
	 * 
	 * @return Devuelve nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificamos el nombre
	 * 
	 * @param Nombre de persona
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Mostramos los apellidos
	 * 
	 * @return Devuelve apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Modificamos los apellidos
	 * 
	 * @@param Apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		if(apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		}
	}
		
	/**
	 * Mostramos la edad
	 * 
	 * @return Devuelve edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Modificamos la edad y comprobamos que es valido
	 * 
	 * @param Edad de la persona
	 */
	public void setEdad(int edad) {
		if(edad >= 0) {
			this.edad = edad;
		}
	}
	
	/**
	 * Devuelve true si es mayor de edad (false si no)
	 * 
	 * @return Devuelve si es mayor
	 */
	public boolean esMayorEdad() {
		boolean esMayor;
		esMayor = edad >= 18 ? true : false;
		return esMayor;
	}
	
	/**
	 * Devuelve true si tiene 65 años o más (false si no)
	 * 
	 * @return Devuelve si es jubilado
	 */
	public boolean esJubilado() {
		boolean esJubilado;
		esJubilado = edad >= 65 ? true : false;
		return esJubilado;
	}
	
	/**
	 * Devuelve la diferencia de edad entre la persona y p
	 * 
	 * @param p Objeto Persona
	 * @return Devuelve la diferencia de edad
	 */
	public int diferenciaEdad(Persona p) {
		int diferenciaEdad;
		diferenciaEdad = this.edad - p.edad;
		return diferenciaEdad;
	}
	
	/**
	 * Devuelve una cadena con la información del objeto
	 * 
	 * @return Devuelve la cadena
	 */
	public String toString() {
		String cadena;
		cadena = "";
		cadena += "DNI: " + dni + " Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
		return cadena;
	}
}