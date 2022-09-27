package classes.desafio;

public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public double Comer(Comida comida) {
		if (comida != null) {
			return this.peso += comida.peso;
		} else
			return this.peso;
	}
}
