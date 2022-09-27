package modelo.basico;

import java.util.List;

import Infra.DAO;

public class BuscarProduto {

	public static void main(String[] args) {
		
		DAO<Produtos> dao = new DAO<>(Produtos.class);
		List<Produtos> produtos = dao.obterTodos();
		
		for (Produtos produto: produtos) {
			System.out.println("ID: " + produto.getId() + " , Nome: " + produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.println("Valor Total R$: " + precoTotal);
	}
}
