package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.5, 7.0));
		
		BiFunction<Double, Double, String> media2 = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(media2.apply(6.5, 7.5));
	}
}
