package boletin4.ejercicio1;

public class Hora {
	
	/**
	 * Horas de la hora 
	 */
	private int hora = 0;
	
	/**
	 * Minutos de la hora
	 */
	private int minuto = 0;
	
	/**
	 * Segundos de la hora
	 */
	private int segundo = 0;
	
	/**
	 * Construcro que coumprueba si los valores de los atributos son correctos y si es
	 * asi les asigna los valores
	 * 
	 * @param hora Horas
	 * @param minuto Minutos
	 * @param segundo Segundos
	 */
	public Hora(int hora, int minuto, int segundo) {
		
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
		
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
		
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}
	
	/**
	 * Funcion que devuelve las horas
	 * 
	 * @return Devuelve las horas
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Funcion que modifica las horas si el valor es valido
	 * 
	 * @param hora Horas
	 */
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}

	/**
	 * Funcion que devuelve los minutos
	 * 
	 * @return Devuelve los minutos
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Funcion que modifica los minutos si el valor es valido
	 * 
	 * @param minuto Minuto
	 */
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}
	
	/**
	 * Funcion que devuelve los segundos
	 * 
	 * @return Devuelve los segundos
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Funcion que modifica los segundos si el valor es valido
	 * 
	 * @param segundo Segundos
	 */
	public void setSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	/**
	 * Funcion para incrementar 1 segundo la hora
	 */
	public void inc() {
		
		if(segundo == 59) {
			segundo = 0;
		} else {
			segundo++;
		}
		
		if(minuto == 59) {
			minuto = 0;
			hora += 1;
		} 
		
		if(hora >= 23) {
			hora = 0;
		}
	}	
	
	/**
	 * Funcion para mostrar la hora
	 * 
	 * @return Devuelve la hora
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		if(hora < 10) {
			cadena += "0" + hora + ":";
		} else {
			cadena += hora + ":";
		}
		
		if(minuto < 10) {
			cadena += "0" + minuto + ":";
		} else {
			cadena += minuto + ":";
		}
		
		if(segundo < 10) {
			cadena += "0" + segundo;
		} else {
			cadena += segundo;
		}
		
		return cadena;
	}
}
