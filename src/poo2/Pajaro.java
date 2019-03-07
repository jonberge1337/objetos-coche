package poo2;

public class Pajaro {
	//*** atributos o propiedades ****
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad
	private String nombre;

	//*** métodos de la clase ****
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setedad(int e){
		edad = e;
	}
	public int getEdad() {
		return edad;
	}
	public void printedad(){
		System.out.println(edad);
	}
	public void setcolor(char c){
		color=c;
	}
	public char getcolor() {
		return color;
	}
	public void printcolor(){
		switch(color){
		//Los pájaros son verdes, amarillos, grises, negros o blancos
		//No existen pájaros de otros colores
		case 'v': System.out.println("verde");break;
		case 'a': System.out.println("amarillo");break;
		case 'g': System.out.println("gris");break;
		case 'n': System.out.println("negro");break;
		case 'b': System.out.println("blanco");break;
		default: System.out.println("color no establecido");
		}
	}

}




