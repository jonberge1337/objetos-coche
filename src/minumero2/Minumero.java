package minumero2;

public class Minumero {
	private int numero;
	
	public Minumero() {
		
	}
	
	public Minumero(int numero) {
		this.numero = numero;
		
	}
	
	public void aniade(int numero) {
		this.numero = numero;
	}
	
	public void suma(int numero) {
		this.numero += numero;
	}
	
	public void resta(int numero) {
		this.numero -= numero;
	}
	
	public int getValor() {
		return this.numero;
	}
	
	public int getDoble() {
		int doble;
		doble = numero * 2;
		return doble;
	}
	
	public int getTriple() {
		int triple;
		triple = numero * 3;
		return triple;
	}
	
	public int getCuadruple() {
		int cuadruple;
		cuadruple = numero * 4;
		return cuadruple;
	}
	
	
}
