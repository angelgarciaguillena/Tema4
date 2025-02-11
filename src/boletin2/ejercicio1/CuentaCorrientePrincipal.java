package boletin2.ejercicio1;

public class CuentaCorrientePrincipal {
	public static void main(String[] args) {
		
		/*Creamos varias cuentas corrientes*/
		CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Pepe", 1900, "Extranjera");
		CuentaCorriente cuenta2 = new CuentaCorriente("12", null, -4, "Australiana");
		CuentaCorriente cuenta3 = new CuentaCorriente("12345678A", "Pepe", 2800, "Española");
		
		/*Probamos a sacar dinero*/
		if(cuenta1.sacarDinero(700)) {
			System.out.println("Se ha sacado el dinero");
		} else {
			System.out.println("No se ha realizado la operacion");
		}
		
		if(cuenta3.sacarDinero(2900)) {
			System.out.println("Se ha sacado el dinero");
		} else {
			System.out.println("No se ha realizado la operacion");
		}
		
		/*Probamos a meter dinero*/
		if(cuenta1.ingresarDinero(200)) {
			System.out.println("Se ha ingresado el dinero");
		} else {
			System.out.println("No se ha realizado la operacion");
		}
		
		if(cuenta3.ingresarDinero(-3000)) {
			System.out.println("Se ha ingresado el dinero");
		} else {
			System.out.println("No se ha realizado la operacion");
		}
		
		/*Mostramos las cuentas bancarias*/
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		
		/*Mostramos si las cuentas son iguales*/
		if(cuenta1.equals(cuenta2)) {
			System.out.println("Las cuentas son iguales");
		} else {
			System.out.println("Las cuentas no son iguales");
		}
		
		if(cuenta1.equals(cuenta3)) {
			System.out.println("Las cuentas son iguales");
		} else {
			System.out.println("Las cuentas no son iguales");
		}
	}
}
