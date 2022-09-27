package oo.heranca;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Eu", "De Novo", 21);
		//p1.idade = -129; // alterar
		
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1.toString());
		System.out.println(p1.getNomeCompleto());
	}
}
