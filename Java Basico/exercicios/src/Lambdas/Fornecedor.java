package Lambdas;

import java.util.Arrays;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<Object> umaLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gih");
				
		System.out.println(umaLista.get());
	}
}
