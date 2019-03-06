package poo4;

public class Alumno{
	private String nombre;
	private int edad;

	Alumno(String n,int e){
		nombre=n;
		edad=e;  
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