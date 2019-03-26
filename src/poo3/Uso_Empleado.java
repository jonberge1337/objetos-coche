package poo3;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {

		Empleado[] misEmpleados = new Empleado[4];

		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);

		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);

		misEmpleados[2] = new Empleado("María martín", 105000, 2002, 03, 15);

		misEmpleados[3] = new Empleado("Antonio Fernández");
		
		for (Empleado empleado : misEmpleados) {
			
			
			empleado.setSubeSueldo(5);
			
		}
		
		for (Empleado empleado : misEmpleados) {
				System.out.println("Nombre:" + empleado.getNombre() + " Sueldo: " +
						empleado.getSueldo() + " Fecha de Alta: " + empleado.getAltaContrato());
		}


	}

}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

		altaContrato = calendario.getTime();

	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
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