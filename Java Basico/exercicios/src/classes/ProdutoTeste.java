package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 2356.89);
		Produto p2 = new Produto("Caneta Preta", 12.56);
		Produto.desconto = 0.50;

		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p1.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2 / 2);
		
		System.out.printf("Média do carrinho = R$%.2f." , mediaCarrinho);
	} 
}