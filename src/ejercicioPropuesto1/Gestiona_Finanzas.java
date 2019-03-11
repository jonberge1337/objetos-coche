package ejercicioPropuesto1;

import java.util.Scanner;

public class Gestiona_Finanzas {

	public static void main(String[] args) {
		double euros;
		double eurosMod;
		double dolares;
		double dolaresMod;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Finanzas cambio = new Finanzas();
		Finanzas cambio2 = new Finanzas(1.12);
		
		System.out.println("Introduce la cantidad de euros que quieres cambiar: ");
		euros = sc.nextDouble();
		
		eurosMod = cambio.eurosToDolares(euros);
		System.out.println("Con el constructor por defecto tienes " + eurosMod + "euros");
		
		eurosMod = cambio2.eurosToDolares(euros);
		System.out.println("Con el constructor especifico tienes " + eurosMod + "euros");
		
		System.out.println("Introduce la cantidad de dolares que quieres cambiar: ");
		dolares = sc.nextDouble();
		
		dolaresMod = cambio.dolaresToEuros(dolares);
		System.out.println("Con el constructor por defecto tienes " + dolaresMod + "dolares");
	
		dolaresMod = cambio2.dolaresToEuros(dolares);
		System.out.println("Con el constructor especifico tienes " + dolaresMod + "dolares");
	}

}
