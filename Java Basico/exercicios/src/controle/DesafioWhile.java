
package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		// Minha versão:
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		int divisor = 0;
		double total = 0;

		do {
			System.out.println("Digite a nota (OU -1 P/ Sair): ");
			nota = entrada.nextDouble();

			if (nota > 0 && nota < 10) {
				total += nota;
				divisor++;
			}

		} while (nota != -1);

		double media = total / divisor;
		System.out.println("Média: " + media);
		
		entrada.close();
		
		//CORREÇÃO:
//		int quantidadeDeNotas = 0;
//		double nota = 0;
//		double total = 0;
//
//		while (nota != -1) {
//			System.out.println("Informe a nota: ");
//			nota = entrada.nextDouble();
//
//			if (nota >= 0 && nota <= 10) {
//				total += nota;
//				quantidadeDeNotas++;
//			}
//		}
//
//		double media = total / quantidadeDeNotas;
//		System.out.println("Média = " + media);
//
//		entrada.close();

	}
}
