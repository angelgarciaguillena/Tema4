package boletin1.ejercicio2;

public class Persona {
	
	/*Inicializamos los atributos de Persona*/
	String dni;
	String nombre;
	String apellidos;
	int edad;
	
	/**
	 * Constructor que inicializa los atributos de la clase Persona
	 * 
	 * @param dni Numero de identificacion
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad Edad de la persona
	 */
	Persona(String dni, String nombre, String apellidos, int edad){
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
