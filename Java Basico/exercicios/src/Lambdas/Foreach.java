package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gih");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
	}
	
	static void meuImprimir(String nome) {
		System.out.printf("Meu nome é: %s. \n", nome);
	}
	
}
