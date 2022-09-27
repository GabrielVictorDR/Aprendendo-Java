package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		 
	
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Digite a Média: ");
		Double media = insert.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		
		if (media <= 7 && media >= 4.5){
			System.out.println("Em Recuperação!");
		}
		
		if (media < 4.5){
			System.out.println("Reprovado.");
		}

		insert.close();
		
		//Aula 64 - Desafio do ; após o if()
		double nota = 1.3;
		
		if (nota >= 9) {
			System.out.println("Quadro de Honra!");
		}
		
	}
}
