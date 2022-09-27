package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Produto p1 = new Produto("Lapis", 1.99, 0.12, 30);
		Produto p2 = new Produto("Notebook", 4899.99, 0.45, 0);
		Produto p3 = new Produto("Impressora", 1200.99, 0.31, 0);
		Produto p4 = new Produto("Monitor", 950.99, 0.12, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		// Filter, filter, map
		
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite!" + p.nome + " por R$ " + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
		
		
	}
}
