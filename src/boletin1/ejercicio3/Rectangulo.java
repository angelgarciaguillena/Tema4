package boletin1.ejercicio3;

public class Rectangulo {
	
	/*Inicializamos los atributos de la clase Rectangulo*/
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Rectangulo y comprueba
	 * si los valores de las coordenadas son validos
	 * 
	 * @param x1 Coordenada x1 del rectangulo
	 * @param y1 Coordenada y1 del rectangulo
	 * @param x2 Coordenada x2 del rectangulo
	 * @param y2 Coordenada y2 del rectangulo
	 */
	public Rectangulo(int x1, int y1, int x2, int y2){
				
		if(x1 < x2) {
			this.x1 = x1;
			this.x2 = x2;
		}
		
		if(y1 < y2) {
			this.y1 = y1;
			this.y2 = y2;
		}
	}
	
	/**
	 * Mostramos la coordenada x1
	 * 
	 * @return Devuelve coordenada x1
	 */
	public int getX1() {
		return x1;
	}
	
	/**
	 * Modificamos la coordenada x1 y comprobamos si es valido
	 * 
	 * @param x1 Coordenada x1
	 */
	public void setX1(int x1) {
		if(x2 > x1) {
			this.x1 = x1;
		}
	}
	
	/**
	 * Mostramos la coordenada y1
	 * 
	 * @return Devuelve coordenada y1
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * Modificamos la coordenada y1 y comprobamos si es valido
	 * 
	 * @param y1 Coordenada y1
	 */
	public void setY1(int y1) {
		if(y2 > y1) {
			this.y1 = y1;
		}
	}
	
	/**
	 * Mostramos la coordenada x2
	 * 
	 * @return Devuelve coordenada x2
	 */
	public int getX2() {
		return x2;
	}
	
	/**
	 * Modificamos la coordenada x2 y comprobamos si es valido
	 * 
	 * @param x1 Coordenada x2
	 */
	public void setX2(int x2) {
		if(x2 > x1) {
			this.x2 = x2;
		}
	}
	
	/**
	 * Mostramos la coordenada y2
	 * 
	 * @return Devuelve coordenada y2
	 */
	public int getY2() {
		return y2;
	}
	
	/**
	 * Modificamos la coordenada y2 y comprobamos si es valido
	 * 
	 * @param y2 Coordenada y2
	 */
	public void setY2(int y2) {
		if(y2 > y1) {
			this.y2 = y2;
		}
	}
	
	/**
	 * Nos da el perimetro del rectangulo
	 * 
	 * @return Devuelve el perimetro
	 */
	public double getPerimetro() {
		double perimetro;
		perimetro = (Math.abs(this.x2 - this.x1) * 2) + (Math.abs(this.y2 - this.y1) * 2);
		return perimetro;
	}
	
	/**
	 * Nos da el area del rectangulo
	 *
	 * @return Devuelve el area
	 */
	public double getArea() {
		double area;
		area = Math.abs(this.x2 - this.x1) * (Math.abs(this.y2 - this.y1));
		return area;
	}
	
	/**
	 *  Devuelve la cadena con la informacion del rectangulo
	 * 
	 * @return Devuelve la cadena
	 */
	public String toString() {
		String cadena;
		cadena = "";
		cadena += "Coordenadas (" + this.x1 + "," + this.y1 + "),(" + this.x2 + "," + this.y2 + ")"; 
		return cadena;
	}
	
	
}