package boletincrud.ejercicio3;

public class Pizza {
	
	/**
	 * Codigo de la pizza
	 */
	private int codigo = 0;

	/**
	 * Tamaño de la pizza
	 */
	Tamaño tamaño = Tamaño.MEDIANA;
	
	/**
	 * Tipo de pizza
	 */
	Tipo tipo = Tipo.MARGARITA;
	
	/**
	 * Estado del pedido
	 */
	Estado estado = Estado.PEDIDA;
	
	/**
	 * Posibles valores del tamaño de la pizza
	 */
	enum Tamaño{
		MEDIANA, FAMILIAR
	}
	
	/**
	 * Posibles valores del tipo de pizza
	 */
	enum Tipo{
		MARGARITA, CUATROQUESOS, FUNGHI
	}
	
	/**
	 * Posibles valores del estado del pedido
	 */
	enum Estado{
		PEDIDA, SERVIDA
	}
	
	/**
	 * Constructor que inicializa los atributos codigo, tamaño, tipo y estado de la clase Pizza
	 * y comprueba si son validos los valores introducidos
	 * 
	 * @param codigo Codigo de la pizza
	 * @param tamaño Tamaño de la pizza
	 * @param tipo Tipo de la pizza
	 * @param estado Estado del pedido
	 */
	public Pizza(int codigo, String tamaño, String tipo, String estado) {
		
		if(codigo >= 0) {
			this.codigo = codigo;
		}
		
		if(tamaño != null) {
			if(tamaño.equalsIgnoreCase("Familiar")) {
				this.tamaño = Tamaño.FAMILIAR;
			} else {
				this.tamaño = Tamaño.MEDIANA;
			}
		}
		
		if(tipo != null) {
			if(tipo.equalsIgnoreCase("Cuatroquesos")) {
				this.tipo = Tipo.CUATROQUESOS;
			} else if(tipo.equalsIgnoreCase("Funghi")) {
				this.tipo = Tipo.FUNGHI;
			} else {
				this.tipo = Tipo.MARGARITA;
			}
		}
		
		if(estado != null) {
			if(estado.equalsIgnoreCase("Servida")) {
				this.estado = Estado.SERVIDA;
			} else {
				this.estado = Estado.PEDIDA;
			}
		}
	}
	
	/**
	 * Devolvemos el codigo del pedido
	 * 
	 * @return Devuelve el codigo del pedido
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Modificamos y actualizamos el codigo de la pizza si el valor es valido
	 * 
	 * @param codigo Codigo de la pizza
	 */
	public void setCodigo(int codigo) {
		if(codigo >= 0) {
			this.codigo = codigo;
		}
	}
	
	/**
	 * Devolvemos el tamaño de la pizza
	 * 
	 * @return Devuelve el tamaño de la pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}
	
	/**
	 * Modificamos y actualizamos el tamaño de la pizza si el valor es valido
	 * 
	 * @param tamaño Tamaño de la pizza
	 */
	public void setTamaño(String tamaño) {
		if(tamaño != null) {
			if(tamaño.equalsIgnoreCase("Familiar")) {
				this.tamaño = Tamaño.FAMILIAR;
			} else {
				this.tamaño = Tamaño.MEDIANA;
			}
		}
	}
	
	/**
	 * Devolvemos el tipo de la pizza
	 * 
	 * @return Devuelve el tipo de pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}
	
	/**
	 * Modificamos y actualizamos el tipo de pizza si el valor es valido
	 * 
	 * @param tipo Tipo de la pizza
	 */
	public void setTipo(String tipo) {
		if(tipo != null) {
			if(tipo.equalsIgnoreCase("Cuatroquesos")) {
				this.tipo = Tipo.CUATROQUESOS;
			} else if(tipo.equalsIgnoreCase("Funghi")) {
				this.tipo = Tipo.FUNGHI;
			} else {
				this.tipo = Tipo.MARGARITA;
			}
		}
	}
	
	/**
	 * Devuelve el estado del pedido de la pizza
	 * 
	 * @return Devuelve el estado del pedido
	 */
	public Estado getEstado() {
		return estado;
	}
	
	/**
	 * Modifica y actualiza el estado del pedido si el valor es valido
	 * 
	 * @param estado Estado del pedido
	 */
	public void setEstado(String estado) {
		if(estado != null) {
			if(estado.equalsIgnoreCase("Servida")) {
				this.estado = Estado.SERVIDA;
			} else {
				this.estado = Estado.PEDIDA;
			}
		}
	}
	
	/**
	 * Devolvemos una cadena que contiene la informacion de la pizza
	 * 
	 * @return Devuelve la informacion de la pizza
	 */
	public String toString() {
		
		String cadena;
		
		cadena = codigo + ": " + tamaño + " - " + tipo + " - " + estado;
		
		return cadena;
	}
	
	/**
	 * Comprobamos si las pizzas son similares y devolvemos true si lo son y false si no lo son
	 * 
	 * @return Devuelve si las pizzas son iguales
	 */
	public boolean equals(Object obj) {
		
		Pizza pizza2 = (Pizza) obj;
		
		boolean similares = false;
		
		if(this.codigo == pizza2.codigo) {
			similares = true;
		}
		
		return similares;
	}
}