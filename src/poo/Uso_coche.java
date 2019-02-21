package poo;

import javax.swing.JOptionPane;

public class Uso_coche {

	public static void main(String[] args) {
		Coche micoche = new Coche();
		
//		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas");
//		System.out.println(micoche.dime_largo());
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));

		System.out.println(micoche.dime_datos());
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizado(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio final del coche es: " + micoche.precio_coche());
	}

}
