package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int quantidadeDeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[][] Turma = new double[quantidadeDeAlunos][quantidadeDeNotas];
		
		double total = 0;
		
		for(int alunos = 0; alunos < Turma.length; alunos++) {
			for(int notas = 0; notas < Turma[alunos].length; notas++) {
				System.out.printf("Informe a nota %d do aluno %d: ", notas+1, alunos+1);
				Turma[alunos][notas] = entrada.nextDouble();
				total += Turma[alunos][notas];
			}
		}
		
		double media = total / (quantidadeDeAlunos * quantidadeDeNotas);
		System.out.printf("------\nA média da turma é: %.1f", media);
		
		entrada.close();
	}
}
