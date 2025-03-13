package boletin4.ejercicio2;

public class Contador {
	
	/**
	 * Contador
	 */
	private int cont = 0;
	
	/**
	 * Constructor que inicializa el atributo cont de la clase Contador
	 * 
	 * @param cont Contador
	 */
	public Contador(int cont) {
		if(cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Funcion que devuelve el valor del contador
	 * 
	 * @return Devuelve el contador
	 */
	public int getCont() {
		return cont;
	}
	
	/**
	 * Funcion que modifica el valor del contador si el valor es valido
	 * 
	 * @param cont Contador
	 */
	public void setCont(int cont) {
		if(cont >= 0) {
			this.cont = cont;
		} else {
			cont = 0;
		}
	}
	
	/**
	 * Funcion que sirve para incrementar el contador
	 */
	public void incrementa() {
		if(cont >= 0) {
			cont++;
		}
	}
	
	/**
	 * Funcion que sirve para decrementar el contador
	 */
	public void decrementar() {
		if(cont - 1 >= 0) {
			cont--;
		} else {
			cont = 0;
		}
	}
}