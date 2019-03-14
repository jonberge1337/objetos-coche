package ejercicioPropuesto1;

import java.util.Scanner;

public class Gestiona_Finanzas {
	public static double dolaresToEuros (double dinero, Finanzas f) {
		dinero = dinero / f.getCambio();
		return dinero;
	}
	
	public static double eurosToDolares (double dinero, Finanzas f) {
		dinero = dinero * f.getCambio();
		return dinero;
	}
	
	public static void main(String[] args) {
		double euros;
		double eurosMod;
		double dolares;
		double dolaresMod;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Finanzas f1 = new Finanzas();
		Finanzas f2 = new Finanzas(1.12);
		
		System.out.println("Introduce la cantidad de euros que quieres cambiar: ");
		euros = sc.nextDouble();
		
		eurosMod = eurosToDolares(euros, f1);
		System.out.println("Con el constructor por defecto tienes " + eurosMod + "euros");
		
		eurosMod = eurosToDolares(euros, f2);
		System.out.println("Con el constructor especifico tienes " + eurosMod + "euros");
		
		System.out.println("Introduce la cantidad de dolares que quieres cambiar: ");
		dolares = sc.nextDouble();
		
		dolaresMod = dolaresToEuros(dolares, f1);
		System.out.println("Con el constructor por defecto tienes " + dolaresMod + "dolares");
	
		dolaresMod = dolaresToEuros(dolares, f2);
		System.out.println("Con el constructor especifico tienes " + dolaresMod + "dolares");
	}

}
