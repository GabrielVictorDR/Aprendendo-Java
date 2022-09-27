package teste.umpramuitos;

import Infra.DAO;
import modelo.basico.Produtos;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();

		Pedido pedido = new Pedido();
		Produtos produto = new Produtos("Gelareira", 2789.99);
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();

	}
}
