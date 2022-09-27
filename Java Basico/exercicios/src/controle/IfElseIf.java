package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota; ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Inválida!");
		}else if (nota == 8){
			System.out.println("A Nota válida é Exatamente 8");
		}else {
			System.out.println("Nota válida!");
		}
		
		entrada.close();
	} 
}
