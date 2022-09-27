package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Lanna";
		c1.itens.add( new Item("Caneta", 20, 7.45) );
		c1.itens.add( new Item("Borracha", 12, 3.45) );
		c1.itens.add( new Item("Caderno", 3, 18.45) );
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
	}
}
