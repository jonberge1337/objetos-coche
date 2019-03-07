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
		mostrarContadores(sumaColores);
	}
	
	public static int[] contarColores(Pajaro[] pajaritos) {
		int[] cantidades = new int[6]; // por defecto os arrays se inicializan a 0
		
		for (int i = 0; i < pajaritos.length; i++) {
			switch (pajaritos[i].getcolor()) {
			case 'v': cantidades[0] += 1; break;
			case 'a': cantidades[1] += 1; break;
			case 'g': cantidades[2] += 1; break;
			case 'n': cantidades[3] += 1; break;
			case 'b': cantidades[4] += 1; break;
			default: cantidades[5] += 1; break;
			}
		}
		
		return cantidades;
	}
	
	public static void mostrarContadores(int[] contadores) {
		
		String[] colores = {"verde", "amarillo", "gris", "negro", "blanco", "color no establecido"};
		
		for (int i = 0; i < contadores.length; i++) {
			System.out.println("Hay " + contadores[i] + "pajaros" + colores[i]);
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
			System.out.println("Mete char color");		
			c=sc.nextLine().charAt(0);
			pajaros[i].setedad(e);
			pajaros[i].setcolor(c);
		}
		sc.close();
	}
}