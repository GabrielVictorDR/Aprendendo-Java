package classes.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ash", 65.4);
		Comida c1 = new Comida("Pizza", 1);
		
		double novoPeso = p1.Comer(c1);
		
		System.out.printf("Olá %s\nPeso Adquirido: %.2f", p1.nome, novoPeso);
	}
}
