package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		System.out.println("\n\nUsando composição...");
		marcas.stream()
		.map(Utilitarios.mauiscula)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios.grito)
		.forEach(print);
	}
}
