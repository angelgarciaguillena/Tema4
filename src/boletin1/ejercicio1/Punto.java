package boletin1.ejercicio1;

public class Punto {
	
	/*Inicializamos los atributos de Punto privados*/
	private int x = 0;
	private int y = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Punto
	 * 
	 * @param x Coordenada x
	 * @param y Coordenada y
	 */
	public Punto (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Mostramos la coordenada x
	 * 
	 * @return Devuelve x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Modificamos la coordenada x
	 * 
	 * @param x Coordenada x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Mostramos la coordenada y
	 * 
	 * @return Devuelve x
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Modificamos la coordenada y
	 * 
	 * @param y Coordenada y
	 */
	public void setY(int y) {
		this.y = y;
	}

	
}
