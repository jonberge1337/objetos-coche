package ejercicioPropuesto1;

import java.util.Scanner;

public class Gestiona_Finanzas_metodo {

	public static double pedirDinero() {
		double dinero;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad que quieres cambiar: ");
		dinero = sc.nextDouble();
		
		return dinero;		
	}
	
	public static double cambiarDinero(double din, Finanzas cambio) {
		double cambiado;
		int opcion;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Si quieres cambiar euros por dolares introduce 1,");
		System.out.println("en caso contrario si quieres cambiar dolares por euro introduce 2");
		do {
			opcion = sc.nextInt();
			if (opcion != 1 || opcion != 2) {
				System.out.println("numero incorrecto te recuerdo los opciones que hay");
				System.out.println("Si quieres cambiar euros por dolares introduce 1,");
				System.out.println("en caso contrario si quieres cambiar dolares por euro introduce 2");
			}
		} while (opcion != 1 || opcion != 2);
		
		
		if(opcion == 1) {
			cambiado = cambio.eurosToDolares(din);
		}else {
			cambiado = cambio.dolaresToEuros(din);
		}
		
		return cambiado;
	}
	
	public static void main(String[] args) {
		double monLoc;
		double cambiado;
		Finanzas cambio = new Finanzas();
		Finanzas cambio2 = new Finanzas(1.12);
		
		monLoc = pedirDinero();
		cambiado = cambiarDinero(monLoc, cambio);
		
		
	}

}
