package ejercicioPropuesto1;

public class Finanzas {
	private double cambio;
	
	Finanzas(){
		this.cambio = 1.36;
	}
	
	Finanzas(double cambio){
		this.cambio = cambio;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}
		
}
