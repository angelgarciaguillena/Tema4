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
	
	/**
	 * Modifica ambas coordenadas
	 * 
	 * @param x Coordenada x
	 * @param y Coordenada y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * Desplaza el punto la cantidad
	 * 
	 * @param dx Diferencia de x
	 * @param dy Diferencia de y
	 */
	public void desplaza(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}
	
	/**
	 * Calcula y devuelve la distancia entre el propio objeto y otro objeto
	 * 
	 * @param p Objeto P
	 * @return Devuelve la distancia entre los objetos
	 */
	public double distancia(Punto p) {
		double distancia;
		
		distancia = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
		return distancia;
	}
	
	/**
	 * Devuelve una cadena con los valores de las coordenadas
	 * 
	 * @return Devuelve la cadena con las coordenadas
	 */
	public String toString() {
		
		String cadena;
		cadena = "";
		cadena += "(" + x + "," + y + ")"; 
		return cadena;
	}
}
