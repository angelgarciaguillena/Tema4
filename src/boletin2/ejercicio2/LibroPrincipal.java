package boletin2.ejercicio2;

public class LibroPrincipal {
	public static void main(String[] args) {
		
		/*Creamos varios libros*/
		Libro libro1 = new Libro("Las lagrimas de Shiva", "Cesar Mallorqui", 10, 2, "Narrativo");
		Libro libro2 = new Libro(null, null, -3, -5, null);
		Libro libro3 = new Libro("Las lagrimas de Shiva", "Cesar Mallorqui", 7, 5, "Narrativo");
		
		/*Mostramos la informacion de los libros*/
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		
		/*Cambiamos los valores*/
		libro1.setPrestados(-10);
		libro1.setEjemplares(-7);
		
		libro2.setEjemplares(7);
		libro2.setPrestados(3);
		
		/*Cogemos prestado un libro*/
		libro1.prestamo();
		
		/*Devolvemos un libro*/
		libro3.devolucion();
		
		/*Mostramos la informacion de los libros*/
		System.out.println("Titulo: " + libro1.getTitulo() + " - Autor: " + libro1.getAutor() + " - Genero: " + libro1.getGenero() + " - Ejemplares: " + libro1.getEjemplares() + " - Prestados: " + libro1.getPrestados());
		System.out.println("Titulo: " + libro2.getTitulo() + " - Autor: " + libro2.getAutor() + " - Genero: " + libro2.getGenero() + " - Ejemplares: " + libro2.getEjemplares() + " - Prestados: " + libro2.getPrestados());
		System.out.println("Titulo: " + libro3.getTitulo() + " - Autor: " + libro3.getAutor() + " - Genero: " + libro3.getGenero() + " - Ejemplares: " + libro3.getEjemplares() + " - Prestados: " + libro3.getPrestados());
		
		/*Comprobamos si los libros 1 y 3 son iguales*/
		if(libro1.equals(libro3)) {
			System.out.println("Los libros son iguales");
		} else {
			System.out.println("Los libros no son iguales");
		}
		
		/*Comprobamos si los libros 1 y 2 son iguales*/
		if(libro1.equals(libro2)) {
			System.out.println("Los libros son iguales");
		} else {
			System.out.println("Los libros no son iguales");
		}
	}
}