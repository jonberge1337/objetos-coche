package minumero2;

public class GestionaNumero {

	public static void main(String[] args) {
		int numero = 5;
		Minumero n1 = new Minumero();
		
		System.out.println(n1.getValor());
		
		n1.aniade(numero);
		
		System.out.println("El doble de " + numero + " es: " + n1.getDoble());
		System.out.println("El triple de " + numero + " es: " + n1.getTriple());
		System.out.println("El cuadruple de " + numero + " es: " + n1.getCuadruple());
	}

}
