package boletin4.ejercicio3;

public class FechaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos un objeto fecha*/
		Fecha fecha = new Fecha(12, 8, 2020);
		
		/*Mostramos la fecha*/
		System.out.println(fecha.toString());
		
		/*Modificamos la fecha*/
		fecha.setDia(31);
		fecha.setMes(4);
		fecha.setAño(2030);
		
		/*Pasamos al dia siguiente llamando a la funcion*/
		fecha.diaSiguiente();
		
		/*Mostramos la fecha*/
		System.out.println(fecha.toString());
		
		/*Comprobamos si el año es bisiesto o no*/
		System.out.println(fecha.esBisiesto() ? "Es bisiesto" : "No es bisiesto");
	}
}