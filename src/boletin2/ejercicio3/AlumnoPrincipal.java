package boletin2.ejercicio3;

public class AlumnoPrincipal {
	public static void main(String[] args) {
		
		/*Creamos varios alumnos*/
		Alumno alumno1 = new Alumno("Pepe Martínez Pérez", 7.7);
		Alumno alumno2 = new Alumno(null, -5.5);
		Alumno alumno3 = new Alumno("Pepe Martínez Pérez", 5.6);
		
		/*Mostramos la informacion de los alumnos*/
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		
		/*Mostramos si los alumnos 1 y 2 son iguales o no*/
		if(alumno1.equals(alumno2)) {
			System.out.println("Los alumnos son iguales");
		} else {
			System.out.println("Los alumnos no son iguales");
		}
		
		/*Mostramos si los alumnos 1 y 3 son iguales o no*/
		if(alumno1.equals(alumno3)) {
			System.out.println("Los alumnos son iguales");
		} else {
			System.out.println("Los alumnos no son iguales");
		}
		
		/*Cambiamos los valores*/
		alumno1.setNombre(null);
		alumno1.setNotaMedia(-5);
		
		alumno2.setNombre("Pepe Martínez Pérez");
		alumno2.setNotaMedia(8);
		
		/*Mostramos los alumnos*/
		System.out.println(alumno1.getNombre() + " " + alumno1.getNotaMedia());
		System.out.println(alumno2.getNombre() + " " + alumno2.getNotaMedia());
	}
}