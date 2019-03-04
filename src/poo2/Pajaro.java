package poo2;

public class Pajaro {
	//*** atributos o propiedades ****
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad

	//*** métodos de la clase ****
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
	public String getcolor() {
		if(color == 'v') {
			return "verde";
		}else if(color == 'a'){
			return "amarillo";
		}else if(color == 'g') {
			return "gris";
		}else if(color == 'n') {
			return "negro";
		}else if(color == 'b') {
			return "blanco";
		}else {
			return "color no establecido";
		}
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




