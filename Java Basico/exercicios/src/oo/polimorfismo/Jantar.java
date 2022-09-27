package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(65.65);

		Arroz ingrediente1 = new Arroz(0.25);
		Feijao ingrediente2 = new Feijao(0.1);

		System.out.printf("Não comeu nada: %.3f KG\n", convidado.getPeso());

		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);

		System.out.printf("Comeu Arroz e Feijao: %.3f KG\n", convidado.getPeso());

		Sorvete sobremesa = new Sorvete(0.2);

		convidado.comer(sobremesa);

		System.out.printf("Comeu Sorvete: %.3f KG\n", convidado.getPeso());
	}
}
