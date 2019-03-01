package poo3;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		

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