package poo2;

import java.util.Scanner;

public class GestionaPajaro {

	public static void main(String[] args) {
		Pajaro[] pajaros=new Pajaro[5];
		int[] sumaColores;
		float media;

		rellenarArray(pajaros);
		imprimirArray(pajaros);
		media = mediaEdades(pajaros);
		imprimirMedia(media);
		sumaColores = contarColores(pajaros);
		contarColores(pajaros);
		mostrarContadores(sumaColores);
	}
	
	public static int[] contarColores(Pajaro[] pajaritos) {
		int[] cantidades = {0,0,0,0,0,0};
		
		for (int i = 0; i < pajaritos.length; i++) {
			switch (pajaritos[i].getcolor()) {
			case "verde": cantidades[0] += 1; break;
			case "amarillo": cantidades[1] += 1; break;
			case "gris": cantidades[2] += 1; break;
			case "negro": cantidades[3] += 1; break;
			case "blanco": cantidades[4] += 1; break;
			default: cantidades[5] += 1; break;
			}
		}
		
		return cantidades;
	}
	
	public static void mostrarContadores(int[] contadores) {
		for (int i = 0; i < contadores.length; i++) {
			switch (i) {
			case 0: System.out.println("Hay " + contadores[i] + " pajaros verde"); break;
			case 1: System.out.println("Hay " + contadores[i] + " pajaros amarillo"); break;	
			case 2: System.out.println("Hay " + contadores[i] + " pajaros gris"); break;
			case 3: System.out.println("Hay " + contadores[i] + " pajaros negro"); break;
			case 4: System.out.println("Hay " + contadores[i] + " pajaros blanco"); break;
			default: System.out.println("Hay " + contadores[i] + " pajaros de color no establecidos"); break;
			}
		}
	}

	public static void imprimirMedia(float media) {
		System.out.println("La media de las edades es de "+media);
	}

	public static float mediaEdades(Pajaro[] pajaros ) {
		float media;
		int suma=0;
		for(int i=0;i<pajaros.length;i++) {
			suma=suma+pajaros[i].getEdad();
		}
		media=suma/5f;
		return media;
	}

	public static void imprimirArray(Pajaro[] pajaros) {
		for(int i=0;i<pajaros.length;i++) {
			System.out.println("El Pajaro "+(i+1)+" tiene   "+pajaros[i].getEdad()+" años ");
			pajaros[i].printcolor();
		}
	}

	public static void rellenarArray(Pajaro[] pajaros) {
		int e;
		char c;
		Scanner sc=new Scanner(System.in);		
		
		for(int i=0;i<pajaros.length;i++) {
			pajaros[i]=new Pajaro();			
			System.out.println("Mete edad");	

			e=sc.nextInt();
			sc.nextLine();
			System.out.println("Mete  char color");		
			c=sc.nextLine().charAt(0);
			pajaros[i].setedad(e);
			pajaros[i].setcolor(c);
		}
		sc.close();
	}
}