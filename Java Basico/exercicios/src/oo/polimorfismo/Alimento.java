package oo.polimorfismo;

public class Alimento {
	
	private double peso;

	public Alimento(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;			
		}
	}
}
