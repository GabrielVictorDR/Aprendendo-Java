package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	// Converter inserts Strings para Double + replace de vírgula para ponto!
	
	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Digite seu salário 1: ");
		String salario1 = insert.next().replace(",", ".");
		
		System.out.print("Digite seu salário 1: ");
		String salario2 = insert.next().replace(",", ".");
		
		System.out.print("Digite seu salário 1: ");
		String salario3 = insert.next().replace(",", ".");
		
		
		Double media = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3;
		
		System.out.printf("Seus salarios; %s, %s, %s", salario1, salario2, salario3);
		System.out.println("\nCalculando média...");
		System.out.println(media.toString()); 
	
		insert.close();
	
	}
}
