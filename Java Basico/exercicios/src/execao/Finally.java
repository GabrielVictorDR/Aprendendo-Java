package execao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.print("Digite: ");
			System.out.println(7 / entrada.nextInt());
			
		} catch (Exception e) {
			
			System.out.println("Houve um erro: " + e.getMessage());
			
		} finally {
			
			System.out.println("Finally...");
			
			//entrada.close();
		}
		
		try {
			System.out.print("Digite novamente: ");
			System.out.println(7 / entrada.nextInt());
			
		} finally {
			
			System.out.println("Finally #2");
			
			entrada.close();
		}

		System.out.println("Fim!");
	}
}
