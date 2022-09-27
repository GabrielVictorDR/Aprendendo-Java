package modelo.basico;

import Infra.DAO;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produtos produto = new Produtos("Notebook", 2987.65);
		
		DAO<Produtos> dao = new DAO<>(Produtos.class);
		dao.incluirAtomiog(produto);
		
		System.out.println("Produto " + produto.getId() +  " Incluido.");
	}
}
