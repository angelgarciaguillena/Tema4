package boletin2.ejercicio4;

public class PizzaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos varias pizzas*/
		Pizza pizza1 = new Pizza(203949, "Mediana", "Funghi", "Pedida");
		Pizza pizza2 = new Pizza(-8, null, null, null);
		Pizza pizza3 = new Pizza(203949, "Mediana", "Funghi", "Pedida");
		
		/*Mostramos la informacion de las pizzas*/
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);
		
		/*Comprobamos si las pizzas 1 y 2 son iguales*/
		if(pizza1.equals(pizza2)) {
			System.out.println("Las pizzas son iguales");
		} else {
			System.out.println("Las pizzas no son iguales");
		}
		
		/*Comprobamos si las pizzas 1 y 3 son iguales*/
		if(pizza1.equals(pizza3)) {
			System.out.println("Las pizzas son iguales");
		} else {
			System.out.println("Las pizzas no son iguales");
		}
		
		/*Cambiamos los valores*/
		pizza1.setCodigo(-10);
		pizza1.setTamaño(null);
		pizza1.setTipo(null);
		pizza1.setEstado(null);
		
		pizza2.setCodigo(203949);
		pizza2.setTamaño("Mediana");
		pizza2.setTipo("Funghi");
		pizza2.setEstado("Pedida");;
		
		/*Mostramos las pizzas*/
		System.out.println(pizza1.getCodigo() + ": " + pizza1.getTamaño() + " - " + pizza1.getTipo() + " - " + pizza1.getEstado());
		System.out.println(pizza2.getCodigo() + ": " + pizza2.getTamaño() + " - " + pizza2.getTipo() + " - " + pizza2.getEstado());
	}
}