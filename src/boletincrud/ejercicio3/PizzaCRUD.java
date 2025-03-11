package boletincrud.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class PizzaCRUD {
	
	/**
	 * Lista donde se almacenan todas las pizzas
	 */
	private static Set<Pizza> pizzas = new HashSet<Pizza>();
	
	/**
	 * Funcion para mostrar todas las pizzas
	 */
	public static void listarPizzas() {
		for(Pizza pizza : pizzas) {
			System.out.println(pizza);
		}
	}
	
	/**
	 * Funcion para añadir una nueva pizza
	 * 
	 * @param pizza Pizza nueva
	 * @return Devuelve true si es valido o false si no se ha realizado
	 */
	public static boolean añadirPizza(Pizza pizza) {
		return pizzas.add(pizza);
	}
	
	/**
	 * Funcion para buscar la pizza y devolverla
	 * 
	 * @param codigo Codigo de la pizza
	 * @return La pizza que queremos buscar
	 */
	public static Pizza buscarPizza(int codigo) {
		Pizza pizza = null;
		
		for(Pizza pizzas : pizzas) {
			if(pizzas.getCodigo() == codigo) {
				pizza = pizzas;
			}
		}
		
		return pizza;
	}
	
	/**
	 * Funcion para modificar que la pizza ha sido servida
	 * 
	 * @param codigo Codigo de la pizza
	 * @return Devuelve true si la operacion se ha realizado o false si no se ha realizado
	 */
	public static boolean modificarPizza(int codigo) {
		
		boolean valido = false;
		Pizza pizza;
		
		pizza = buscarPizza(codigo);
		
		if(pizza != null) {
			pizza.setEstado("Servida");
			valido = true;
		}
		
		return valido;
	}
}