package boletin4.ejercicio1;

public class HoraPrincipal {
	public static void main(String[] args) {
		
		/*Creamos un objeto hora*/
		Hora hora = new Hora(10, 20, 30);
		
		/*Incrementamos la hora*/
		hora.inc();
		
		/*Mostramos la hora*/
		System.out.println(hora.toString());
		
		/*Cambiamos la hora*/
		hora.setHora(23);
		hora.setMinuto(59);
		hora.setSegundo(59);
		
		/*Incrementamos la hora*/
		hora.inc();
		
		/*Mostramos la hora*/
		System.out.println(hora.toString());
	}
}