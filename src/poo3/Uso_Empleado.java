package poo3;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		//		Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		//		
		//		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
		//		
		//		Empleado empleado3 = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		//		
		//		empleado1.setSubeSueldo(5);
		//		
		//		empleado1.setSubeSueldo(5);
		//		
		//		empleado1.setSubeSueldo(5);
		//		
		//		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() +
		//				" Fecha de Alta: " + empleado1.getAltaContrato());
		//		
		//		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() +
		//				" Fecha de Alta: " + empleado2.getAltaContrato());
		//		
		//		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() +
		//				" Fecha de Alta: " + empleado3.getAltaContrato());

		Empleado[] misEmpleados = new Empleado[3];

		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);

		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);

		misEmpleados[2] = new Empleado("María martín", 105000, 2002, 03, 15);

//		for (int i = 0; i < 3; i++) {
//			misEmpleados[i].setSubeSueldo(5);
//		}
		
		for (Empleado empleado : misEmpleados) {
			
			
			empleado.setSubeSueldo(5);
			
		}
		
		for (Empleado empleado : misEmpleados) {
				System.out.println("Nombre:" + empleado.getNombre() + " Sueldo: " +
						empleado.getSueldo() + " Fecha de Alta: " + empleado.getAltaContrato());
		}

//		for (int i = 0; i < misEmpleados.length; i++) {
//			System.out.println("Nombre:" + misEmpleados[i].getNombre() + " Sueldo: " +
//					misEmpleados[i].getSueldo() + " Fecha de Alta: " + misEmpleados[i].getAltaContrato());
//		}

	}

}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

		altaContrato = calendario.getTime();

	}

	public String getNombre() {
		return this.nombre;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	public void setSubeSueldo(double porcentaje) {
		double aumento = this.sueldo * porcentaje / 100;

		this.sueldo += aumento;
	}

	private String nombre;

	private double sueldo;

	private Date altaContrato;

}