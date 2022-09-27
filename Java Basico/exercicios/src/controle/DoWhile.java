package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.print("Você: ");
			System.out.println("Para Sair digite: sair");
			texto = entrada.nextLine();
			}while(!texto.equalsIgnoreCase("Sair"));
		
		entrada.close();
		
	}
}
