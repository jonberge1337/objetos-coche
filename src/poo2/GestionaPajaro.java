package poo2;

import java.util.Scanner;

public class GestionaPajaro {
	public static float mediaMetodo(int num1, int num2) {
		return (num1 + num2) / 2f;
	}

	public static void main(String[] args) {
		Pajaro[] pajaros = new Pajaro[5];
		//		float media;
		int edad;
		char color;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < pajaros.length; i++) {
			pajaros[i] = new Pajaro();

			System.out.println("Introduce una edad: ");
			edad = sc.nextInt();
			pajaros[i].setedad(edad);

//			sc.nextLine();

			System.out.println("Introduce la inicial del color del pajaro: ");
			color = sc.next().charAt(0);
			pajaros[i].setcolor(color);
		}

		for (int i = 0; i < pajaros.length; i++) {
			System.out.println(pajaros[i] + "es de color " + pajaros[i].getcolor() +
					" y tiene " + pajaros[i].getEdad() + " años");
		}
		sc.close();
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
