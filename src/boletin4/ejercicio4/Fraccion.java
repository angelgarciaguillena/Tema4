package boletin4.ejercicio4;

public class Fraccion {
	
	/**
	 * Numerador de la fraccion
	 */
	private int numerador = 0;
	
	/**
	 * Denominador de la fraccion
	 */
	private int denominador = 0;
	
	/**
	 * Constructor que inicializa los atribuitos de la clase Fraccion y 
	 * comprueba si los valores son validos
	 * 
	 * @param numerador Numerador de la fraccion
	 * @param denominador Denominador de la fraccion
	 */
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		
		if(denominador != 0) {
			this.denominador = 0;
		}
	}
	
	/**
	 * Constructor que permite crear un objeto vacio
	 */
	public Fraccion() {
		
	}
	
	/**
	 * Funcion que devuelve el numerador de la fraccion
	 * 
	 * @return Devuelve el numerador de la fraccion
	 */
	public int getNumerador() {
		return numerador;
	}
	
	/**
	 * Funcion que modifica el numerador de la fraccion
	 * 
	 * @param numerador Numerador de la fraccion
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	/**
	 * Funcion que devuelve el denominador de la fraccion
	 * 
	 * @return Devuelve el denominador de la fraccion
	 */
	public int getDenominador() {
		return denominador;
	}
	
	/**
	 * Funcion que modifica el denominador de la fraccion si comprueba que su valor 
	 * es correcto
	 * 
	 * @param denominador Denominador de la fraccion
	 */
	public void setDenominador(int denominador) {
		if(denominador != 0) {
			this.denominador = 0;
		}
	}
	
	/**
	 * Funcion que sirve para sumar dos fracciones y devuelve el resultado de la suma
	 * 
	 * @param fraccion2 Fraccion para sumar
	 * @return Devuelve el resultado de la operacion
	 */
	public Fraccion sumaFracciones(Fraccion fraccion2) {
		Fraccion resultado = new Fraccion();
		
		if(this.denominador != fraccion2.denominador) {
			resultado.denominador = this.denominador * fraccion2.denominador;
			resultado.numerador = (this.numerador * fraccion2.denominador) + (fraccion2.numerador * this.denominador);
		} else {
			resultado.numerador = this.numerador + fraccion2.numerador;
		}
		resultado.simplificaFraccion();
		
		return resultado;
	}
	
	/**
	 * Funcion que sirve para restar dos fracciones y devuelve el resultado de la resta
	 * 
	 * @param fraccion2 Fraccion para restar
	 * @return Devuelve el resultado de la operacion
	 */
	public Fraccion restaFracciones(Fraccion fraccion2) {
		Fraccion resultado = new Fraccion();
		
		if(this.denominador != fraccion2.denominador) {
			resultado.denominador = this.denominador * fraccion2.denominador;
			resultado.numerador = (this.numerador * fraccion2.denominador) - (fraccion2.numerador * this.denominador);
		} else {
			resultado.numerador = this.numerador - fraccion2.numerador;
		}
		resultado.simplificaFraccion();
		
		return resultado;
	}
	
	/**
	 * Funcion que sirve para multiplicar dos fracciones y devuelve el resultado de la multiplicacion
	 * 
	 * @param fraccion2 Fraccion para multiplicar
	 * @return Devuelve el resultado de la operacion
	 */
	public Fraccion multiplicaFracciones(Fraccion fraccion2) {
		Fraccion resultado = new Fraccion();
		
		resultado.numerador = this.numerador * fraccion2.numerador;
		resultado.denominador = this.denominador * fraccion2.denominador;
		resultado.simplificaFraccion();
		
		return resultado;
	}
	
	/**
	 * Funcion que sirve para dividir dos fracciones y devuelve el resultado de la division
	 * 
	 * @param fraccion2 Fraccion para dividir
	 * @return Devuelve el resultado de la operacion
	 */
	public Fraccion divideFraccion(Fraccion fraccion2) {
		Fraccion resultado = new Fraccion();
		
		resultado.numerador = this.numerador * fraccion2.denominador;
		resultado.denominador = this.denominador * fraccion2.numerador;
		resultado.simplificaFraccion();
		
		return resultado;
	}
	
	/**
	 * Funcion que se encarga de calcular el maximo comun divisor
	 * 
	 * @param a Numerador de la fraccion
	 * @param b Denominador de la fraccion
	 * @return Devuelve el maximo comun divisor
	 */
	private int calcularMCD(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return Math.abs(a);
	}
	
	/**
	 * Funcion que se encarga de simplificar la fraccion 
	 */
	public void simplificaFraccion() {
	    if (numerador != 0) {
	        int mcd = calcularMCD(numerador, denominador);
	        numerador /= mcd;
	        denominador /= mcd;
	    }
	}

	/**
	 * Funcion que devuelve una cadena que contiene la fraccion
	 * 
	 * @return Devuelve la fraccion
	 */
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
}