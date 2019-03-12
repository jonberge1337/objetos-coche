package completarMolde;

import java.util.Scanner;

public class Gestiona_coche {

	public static int elegirMenu() {
		int menu;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de las siguientes opciones: ");
		System.out.println("1. Acelerar \n2. Frenar \n3. Ver velocidad \n4. salir");
		do {
			try {
				menu = sc.nextInt();
			} catch (Exception e) {
				menu = 0;
				sc.nextLine();
			}

			if(menu > 4 || menu < 1) {
				System.out.println("Introduce una opcion correcta");
			}
		} while (menu > 4 || menu < 1);


		return menu;
	}

	public static void acelera(Coche coche) {
		int velocidad;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce en cuanto quieres aumentar la velocidad: ");
		do {
			try {
				velocidad = sc.nextInt();
			} catch (Exception e) {
				velocidad = 0;
				sc.nextLine();
			}
			if(velocidad < 1) {
				System.out.println("Tienes que meter un numero mayor que 0");
			}
		} while (velocidad < 1);
		
		if(velocidad + coche.getVelocidad() > 120) {
			coche.acelera(120 - coche.getVelocidad());;
		} else {
			coche.acelera(velocidad);
		}

	}

	public static void frenar(Coche coche) {
		int velocidad;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce en cuanto quieres frenar la velocidad");
		do {
			try {
				velocidad = sc.nextInt();				
			} catch (Exception e) {
				velocidad = 0;
				sc.nextLine();
			}
			if(velocidad < 1) {
				System.out.println("Tienes que meter un numero mayor que 0");
			}
		} while (velocidad < 1);

		if(coche.getVelocidad() - velocidad < 0) {
			coche.frena(coche.getVelocidad());
		} else {
			coche.frena(velocidad);
		}
	}

	public static void verVelocidad(int velocidad) {
		if(velocidad == 0) {
			System.out.println("Estas parado");
		} else {
			System.out.println("Vas a " + velocidad + "km/h");
		}

	}

	public static void main(String[] args) {
		//programa que cree un coche , a continuacion mostrara un menu al usuario con las opciones 
		//acelerar frenar, ver velocidad, y salir.

		int menu;
		Coche bmw = new Coche();
		do {
			menu = elegirMenu();
			switch (menu) {
			case 1: acelera(bmw); break;
			case 2: frenar(bmw); break;
			case 3: verVelocidad(bmw.getVelocidad());
			default: System.out.println("Programa finalizado");	break;
			}
		} while (menu != 4);

	}

}
