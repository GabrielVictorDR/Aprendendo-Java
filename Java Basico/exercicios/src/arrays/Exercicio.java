package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		//Sintaxe de um array
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
	
		
		System.out.println("Array Aluno A " + Arrays.toString(notasAlunoA));

		double total = 0;
		int range = notasAlunoA.length;
		
		for(int i = 0; i < range; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.printf("Média do Aluno A: %.1f\n", total / range); 
		
		double[] notasAlunoB = {7.4, 7.8, 4.5};
		
		double totalAlunoB = 0; 
		
		for(int i = 0; i < notasAlunoB.length; i ++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.printf("Média do Aluno B: %.1f", totalAlunoB / notasAlunoB.length); 
	}
	
}
