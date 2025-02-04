package boletin1.ejercicio3;

public class Rectangulo {
	
	/*Inicializamos los atributos de la clase Rectangulo*/
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Rectangulo y comprueba
	 * si los valores de las coordenadas son validos
	 * 
	 * @param x1 Coordenada x1 del rectangulo
	 * @param y1 Coordenada y1 del rectangulo
	 * @param x2 Coordenada x2 del rectangulo
	 * @param y2 Coordenada y2 del rectangulo
	 */
	Rectangulo(int x1, int y1, int x2, int y2){
				
		if(x1 < x2) {
			this.x1 = x1;
			this.x2 = x2;
		}
		
		if(y1 < y2) {
			this.y1 = y1;
			this.y2 = y2;
		}
	}
}