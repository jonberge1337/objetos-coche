package poo4;

import java.util.Scanner;

public class GestionAlumno {
	public static void mostrarAlumnos(Alumno primero, Alumno segundo) {
		System.out.println("El primer alumno se llama " + primero.getNombre() + " y tiene "
				+ primero.getEdad() + " años.");
		System.out.print("Las notas de " + primero.getNombre() + " son:");
		System.out.println();
		for (int i = 0; i < primero.getNota().length; i++) {
			System.out.println("La evaluacion " + (i + 1) + " tiene la nota " + primero.getNota()[i]);
		}
		System.out.println("El segundo alumno se llama " + segundo.getNombre() + " y tiene "
				+ segundo.getEdad() + " años");
		System.out.print("Las notas de " + segundo.getNombre() + " son:");
		System.out.println();
		for (int i = 0; i < segundo.getNota().length; i++) {
			System.out.println("La evaluacion " + (i + 1) + " tiene la nota " + segundo.getNota()[i]);
		}
	}
	
	public static void introdurcirNotas2(Alumno alum) {
		int[] notas = new int[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Las notas de " + alum.getNombre());
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce la nota de la evaluacion" + (i+1));
			notas[i] = sc.nextInt();
		}
		alum.setNota(notas);
	}
	
	public static void introducirNotas(Alumno alum) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Las notas de " + alum.getNombre());
		for (int i = 0; i < alum.getNota().length; i++) {
			System.out.println("Introduce la nota de la evaluacion" + (i+1));
			alum.getNota()[i] = sc.nextInt(); // nos retorna el array y al indice le introducimos el valor
		}
	}
	
	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Ana", 18);
		Alumno a2 = new Alumno("Jon", 21);
		
		mostrarAlumnos(a1, a2);
		introducirNotas(a1);
		introducirNotas(a2);
		mostrarAlumnos(a1, a2);

	}

}
