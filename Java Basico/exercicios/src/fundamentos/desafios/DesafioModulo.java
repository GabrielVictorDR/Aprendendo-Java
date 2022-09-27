package fundamentos.desafios;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Double num1;
		Double num2;
		String operador;

		// Definir as entradas;
		System.out.println("Digite o Primeiro número: ");
		num1 = entrada.nextDouble();

		System.out.println("Escolha o Operador (+ - / *): ");
		operador = entrada.next();

		System.out.println("Digite o Segundo número: ");
		num2 = entrada.nextDouble();

		// Calculos

		Double result = operador.equals("+") ? num1 + num2 : 0;
		result = operador.equals("-") ? num1 - num2 : result;
		result = operador.equals("/") ? num1 / num2 : result;
		result = operador.equals("*") ? num1 * num2 : result;

		System.out.printf("\n%.2f %s %.2f = %.2f", num1, operador, num2, result);

		entrada.close();

	}
}
