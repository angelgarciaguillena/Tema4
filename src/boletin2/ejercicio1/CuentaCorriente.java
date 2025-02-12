package boletin2.ejercicio1;

public class CuentaCorriente {
	
	/*DNI de la persona*/
	private String dni = "No insertado";
	
	/*Nombre de la persona*/
	private String nombre = "No insertado";
	
	/*Saldo de la persona*/
	private double saldo = 0;
	
	/*Nacionalidad de las personas*/
	Nacionalidad nacionalidad = Nacionalidad.ESPAÑOLA;
	
	/*Nacionalidades posibles de las personas*/
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}
	
	/**
	 * Constructor que inicializa los atributos dni y saldo de la clase CuentaCorriente
	 * si los valores son correctos
	 * 
	 * @param dni DNI de la persona
	 * @param saldo Saldo de la persona
	 */
	public CuentaCorriente(String dni, int saldo) {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	/**
	 * Constructor que inicializa los atributos dni, nombre y saldo de la clase CuentaCorriente
	 * si los valores son correctos
	 * 
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param saldo Saldo de la persona
	 */
	public CuentaCorriente(String dni, String nombre, int saldo) {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		}
		
		if(nombre != null) {
			this.nombre = nombre;
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	/**
	 * Constructor que inicializa los atributos dni, nombre, saldo y nacionalidad de la clase CuentaCorriente
	 * si los valores son correctos
	 * 
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param saldo Saldo de la persona
	 * @param nacionalidad Nacionalidad de la persona
	 */
	public CuentaCorriente(String dni, String nombre, int saldo, String nacionalidad) {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		}
		
		if(nombre != null) {
			this.nombre = nombre;
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		}
		
		if(nacionalidad != null) {
			if(nacionalidad.equalsIgnoreCase("Extranjera")) {
				this.nacionalidad = Nacionalidad.EXTRANJERA;
			} else {
				this.nacionalidad = Nacionalidad.ESPAÑOLA;
			}
		}
	}
	
	/**
	 * Mostramos el DNI
	 * 
	 * @return Devuelve el DNI
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Mostramos el nombre
	 * 
	 * @return Devolvemos el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificamos el nombre y lo actualizamos si es valido
	 * 
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		if(nombre != null) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Muestra el saldo
	 * 
	 * @return Devuelve el saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Modificamos el saldo y lo actualizamos si es valido
	 * 
	 * @param saldo Saldo de la persona
	 */
	public void setSaldo(int saldo) {
		if(saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	/**
	 * Mostramos la nacionalidad
	 * 
	 * @return Devuelve la nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	
	/**
	 * Modificamos la nacionalidad y lo actualizamos si es valido
	 * 
	 * @param nacionalidad Nacionalidad de la persona
	 */
	public void setNacionalidad(String nacionalidad) {
		if(nacionalidad != null) {
			if(nacionalidad.equalsIgnoreCase("Extranjera")) {
				this.nacionalidad = Nacionalidad.EXTRANJERA;
			} else {
				this.nacionalidad = Nacionalidad.ESPAÑOLA;
			}
		}
	}
	
	/**
	 * Si el dinero que se quiere sacar es menos o igual al que existe
	 * en la cuenta devolvera que la operacion es valida y restara el dinero
	 * de la cuenta
	 * 
	 * @param dinero Dinero que quiere retirar
	 * @return Devuelve si la operacion es valida o no
	 */
	public boolean sacarDinero(double dinero) {
		
		boolean esValido = false;
		
		if((saldo - dinero) >= 0) {
			saldo = saldo - dinero;
			esValido = true;
		}
		
		return esValido;
	}
	
	/**
	 * Si el dinero que se quiere meter a la cuenta es valido se devolvera que la operacion es valida 
	 * 
	 * @param dinero Dinero que se quiere añadir
	 * @return Devuelve si la operacion es valida o no
	 */
	public boolean ingresarDinero(double dinero) {
		
		boolean valido = false;
				
		if((saldo + dinero) > saldo) {
			saldo += dinero;
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Devolvemos una cadena con la informacion de la cuenta
	 * 
	 * @return cadena Devuelve la cadena con la informacion de la cuenta
	 */
	public String toString() {
		
		String cadena;
		
		cadena = "DNI del titular: " + dni + " - Nombre del titular de la cuenta: " + nombre + " - Saldo de la cuenta: " + saldo + " - Nacionalidad: " + nacionalidad;
		
		return cadena;
	}
	
	/**
	 * Devuelve si dos cuentas corrientes son iguales o no
	 * 
	 * @return Devuelve si son iguales
	 */
	public boolean equals(Object obj) {
		
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;
		
		boolean iguales = false;
		
		if(this.nombre.equalsIgnoreCase(cuenta2.nombre) && this.dni.equalsIgnoreCase(cuenta2.dni)) {
			iguales = true;
		}
		
		return iguales;
	}
}