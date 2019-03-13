package poo4;

import java.util.Scanner;

public class GestionAlumnoArray {

	public static void mostrarAlumnos(Alumno[] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("El alumno " + alumnos[i].getNombre() + " tiene " + alumnos[i].getEdad() + 
					" años y tiene las siguientes notas:");
			
			for (int j = 0; j < alumnos[i].getNota().length; j++) {
				System.out.println("Evaluacion " + (j + 1) + ": " + alumnos[i].getNota()[j]);
			}
		}
	}
	
	public static void rellenarAlumnos(Alumno[] alumnos) {
		String nombre;
		int edad;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a introducir los alumnos: ");
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("Introduce el nombre del alumno " + (i+1) + ":");
			nombre = sc.nextLine();
			
			System.out.println("Introduce la edad del alumno " + nombre + ":");
			edad = sc.nextInt();
			
			alumnos[i] = new Alumno(nombre, edad);
			
			for (int j = 0; j < alumnos[i].getNota().length; j++) {
				System.out.println("Introduce la nota de la evaluacion " + (j+1) + ":");
				alumnos[i].getNota()[j] = sc.nextInt();
			}
			sc.nextLine();
		}
	}
	
	public static void rellenarAlumnos2(Alumno[] alumnos) {
		String nombre;
		int edad;
		int[] notas = new int[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a introducir los alumnos: ");
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("Introduce el nombre del alumno " + (i+1) + ":");
			nombre = sc.nextLine();
			
			System.out.println("Introduce la edad del alumno " + nombre + ":");
			edad = sc.nextInt();
			
			alumnos[i] = new Alumno(nombre, edad);
			
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Introduce la nota de la evaluacion " + (j+1) + ":");
				notas[j] = sc.nextInt();
			}
			sc.nextLine();
			alumnos[i].setNota(notas);
		}
	}
	
	public static void main(String[] args) {
		Alumno[] alumnos = new Alumno[3];
		
		rellenarAlumnos2(alumnos);
		mostrarAlumnos(alumnos);
	}

}
