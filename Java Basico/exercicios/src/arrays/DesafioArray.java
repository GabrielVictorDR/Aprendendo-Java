package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		System.out.println("Quantas notas você quer inserir? ");
		Scanner entrada = new Scanner(System.in);
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.printf("Digite a nota [%d]:\n", i + 1);
			double InserirNota = entrada.nextDouble();
			notas[i] = InserirNota;
			
		}

		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			
			total += notas[i];
			
		}

		System.out.println("\nNotas: " + Arrays.toString(notas));
		System.out.printf("\nMédia: %.1f", total / notas.length);
		entrada.close();
		
	}
}
