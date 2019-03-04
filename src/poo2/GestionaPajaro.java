package poo2;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionaPajaro {
	
	public static float mediaMetodo(int num1, int num2) {
		return (num1 + num2) / 2f;
	}
	
	public static int pedirEdad() {
		int edad;
//		Scanner sc = new Scanner(System.in);
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del pajaro: "));
//		System.out.println("Introduce la edad del pajaro: ");
//		edad = sc.nextInt();
		
//		sc.close();
		return edad;
	}
	
	public static char pedirColor() {
		String colorStr;
		char color;
		
		do {
			colorStr = JOptionPane.showInputDialog("Introduce la primera letra del color: ");
		} while (colorStr.length() > 1);
		
		color = colorStr.charAt(0);
//		Scanner sc = new Scanner(System.in);

//		System.out.println("Introduce la primera letra del color: ");
//		color = sc.next().charAt(0);
		
//		sc.close();
		return color;
	}
	
	public static Pajaro[] crearPajaros() {
		Pajaro[] pajaros = new Pajaro[5];
		int edad;
		char color;		
		
		for (int i = 0; i < pajaros.length; i++) {
			pajaros[i] = new Pajaro();
			edad = pedirEdad();
			pajaros[i].setedad(edad);
			color = pedirColor();
			pajaros[i].setcolor(color);
		}
		
		return pajaros;		
	}
	
	public static void mostrarPajaros(Pajaro[] pajaritos) {
		for (int i = 0; i < pajaritos.length; i++) {
			System.out.println("Pajaro " + i +  "es de color " + pajaritos[i].getcolor() +
					" y tiene " + pajaritos[i].getEdad() + " años");
		}
	}

	public static void main(String[] args) {
		Pajaro[] pajaros = crearPajaros();
		mostrarPajaros(pajaros);

		
		//		p=new Pajaro(); //crea un objeto de la clase Pajaro

		//		p.setedad(7); //actualiza la edad a 5
		//		p.setcolor('v');

		//		p1 = new Pajaro();
		//		p1.setedad(6);
		//		p1.setcolor('g');

		//		System.out.print("El primero pajaro tiene ");
		//		p1.printedad();
		//		System.out.print("años y tiene el color ");
		//		p1.printcolor();
		//		System.out.println();
		//		
		//		System.out.print("El segundo pajaro tiene ");
		//		p.printedad();
		//		System.out.print("años y tiene el color ");
		//		p.printcolor();
		//		System.out.println();

		//		media = mediaMetodo(p.getEdad(), p1.getEdad());

		//		media = ((float) p.getEdad() + p1.getEdad()) / 2;
		//		System.out.println("La media de la edad es " + media);

		//		p.printedad(); //muestra por pantalla dicha edad
	}

}
