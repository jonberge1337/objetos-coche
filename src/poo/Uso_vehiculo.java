package poo;

public class Uso_vehiculo {

	public static void main(String[] args) {
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("azul");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizado("Si");
		
		System.out.println(micoche1.dime_datos() + " " + micoche1.dime_asientos() + " " + micoche1.dime_climatizador());
		
		System.out.println(mifurgoneta1.dimeDatosFurgoneta());
		
		System.out.println(mifurgoneta1.color);
	}

}
