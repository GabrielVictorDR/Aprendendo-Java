package oo.heranca;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	//Getter and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	//Fim geters and setters
	
	public String toString() {
		return "Olá eu sou " + nome + " e tenho " + idade;
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}

}



