package poo4;

public class GestionAlumno {
	public static void mostrarAlumnos(Alumno primero, Alumno segundo) {
		System.out.println("El primer alumno se llama " + primero.getNombre() + " y tiene "
				+ primero.getEdad() + " años");
		System.out.println("El segundo alumno se llama " + segundo.getNombre() + " y tiene "
				+ segundo.getEdad() + " años");
	}
	public static void main(String[] args) {
		Alumno a1 = new Alumno("Ana", 18);
		Alumno a2 = new Alumno("Jon", 21);
		
		mostrarAlumnos(a1, a2);

	}

}
