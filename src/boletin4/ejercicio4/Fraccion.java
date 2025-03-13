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
	
	public Fraccion sumaFracciones(Fraccion fraccion2) {
		Fraccion resultado = new Fraccion();
		
		if(this.denominador != fraccion2.denominador) {
			resultado.denominador = this.denominador * fraccion2.denominador;
			resultado.numerador = (this.numerador * fraccion2.denominador) + (fraccion2.numerador * this.denominador);
		} else {
			resultado.numerador = this.numerador + fraccion2.numerador;
		}
		
		return resultado;
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