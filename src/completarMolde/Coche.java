package completarMolde;

class Coche {

	private int velocidad;

	Coche(){

		velocidad=0;
	}
	int getVelocidad() {
		return velocidad;
	}

	void acelera (int v) {
		velocidad += v;
	}

	void frena (int z) {
		velocidad -= z;
	}


}
