package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	public void acelerar() {
		velocidadeAtual += 15;
	}

	public void ligarTurbo() {
		ligarTurbo = true;
	}

	public void desligarTurbo() {
		ligarTurbo = false;
	}

	public void ligarAr() {
		ligarAr = true;
	}

	public void desligarAr() {
		ligarAr = false;
	}

	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}
