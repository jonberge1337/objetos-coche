package poo4;

public class Alumno{
	private String nombre;
	private int edad;
	private int[] nota;

	Alumno(String n, int e){
		nombre=n;
		edad=e;
		nota=new int[3];
	}
	
	public void setNota(int[] nota) {
		this.nota = nota;
	}
	
	public int[] getNota() {
		return this.nota;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
}