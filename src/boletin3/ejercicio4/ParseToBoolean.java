package boletin3.ejercicio4;

public class ParseToBoolean {
	
	/**
	 * Comprueba si el numero es igual a 0 devuelve false pero si es igual a 1 devuelve true
	 * 
	 * @param numero Numero entero
	 * @return Devuelve true si es 1 o false si es 0
	 */
	static boolean parseToBoolean(int numero) {
		
		boolean es1 =  true;
		
		if(numero == 0) {
			es1 = false;
		} else if(numero == 1) {
			es1 = true;
		}
		
		return es1;
	}
	
	/**
	 * Calcula y devuelve true si la cadena es "true" y false si la cadena es "false"
	 * 
	 * @param frase Frase
	 * @return Devuelve true si la cadena es "true" o false si es "false"
	 */
	static boolean parseToBoolean(String frase) {
		
		 boolean esTrue = false;
		 
		 if(frase.equalsIgnoreCase("true")) {
			 esTrue = true;
		 } else if(frase.equalsIgnoreCase("false")) {
			 esTrue = false;
		 }
		 
		 return esTrue;
	}
}
