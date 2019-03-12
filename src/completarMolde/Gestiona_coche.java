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
			menu = sc.nextInt();
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
			
			velocidad = sc.nextInt();
			if(velocidad + coche.getVelocidad() > 120) {
				System.out.println("Prohibido aumentar 120 km/h");
			}else {
				coche.acelera(velocidad);
			}
				
	}
	
	public static void frenar(Coche coche) {
		int velocidad;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce en cuanto quieres frenar la velocidad");
		
		velocidad = sc.nextInt();
		if(coche.getVelocidad() - velocidad < 0) {
			System.out.println("No puedes frenar tanto bajarias de 0 km/h");
		}else {
			coche.frena(velocidad);
		}
	}
	
	public static void verVelocidad(int velocidad) {
		System.out.println("Vas a " + velocidad + "km/h");
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
