package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarAlterarPessoa {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();

		// "LOGIN" DA PESSOA
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Código pessoal: ");
		int codigo = entrada.nextInt();

		// PREPARAR O STATEMENT E PASSAR QUAL PARAMETRO ELE DEVE SUBSTITUIR NA STRING
		// SQL
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);

		// RESULTSET EXECUTA A QUERY E TRÁS OS RESULTADOS;
		ResultSet result = stmt.executeQuery();

		// SE HOUVER AO MENOS UM REGISTRO
		if (result.next()) {

			// ARMAZENA OS RESULTADOS EM UM OBJETO PESSOA;
			Pessoa p = new Pessoa(result.getInt("codigo"), result.getString("nome"));

			// MOSTRA QUEM ESTÁ "LOGADO" E FECHA O PRIMEIRO STATEMENT PARA PORDER SOBRESCREVE-LO DEPOIS
			System.out.println("\n------- Boas Vindas, " + p.getNome() + " (" + p.getCodigo() + "). -------\n");
			entrada.nextLine();
			stmt.close();

			System.out.print("Você quer alterar o Código (Digite 1) ou Nome (Digite 2)? : ");
			int opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				stmt.close();
				
				System.out.print("\nSubstituir Codigo por? : ");
				int novoCodigo = entrada.nextInt();
				
				String update1 = "UPDATE pessoas SET codigo = ? WHERE codigo = ?";
				stmt = conexao.prepareStatement(update1);
				stmt.setInt(1, novoCodigo);
				stmt.setInt(2, p.getCodigo());

				break;
				
			case 2:
				entrada.nextLine();
				stmt.close();
				
				System.out.print("\nSubstituir Nome por? : ");
				String novoNome = entrada.nextLine();
				
				String update2 = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
				stmt = conexao.prepareStatement(update2);
				stmt.setString(1, novoNome);
				stmt.setInt(2, p.getCodigo());

				break;
				
			default:
				System.out.println("Número Inválido...");
				break;
			}

			// SE FOR EXECUTADO
			if (!stmt.execute()) {

				stmt.close();

				String selectAll = "SELECT * FROM pessoas";
				stmt = conexao.prepareStatement(selectAll);
				// SOBRESCREVER RESULT
				
				result = stmt.executeQuery(selectAll);
				System.out.println("\nAtualização concluida!");
				System.out.println("______________________\n");
				// EXIBIR A LISTA COMPLETA:
				while (result.next()) {
					Pessoa pessoas = new Pessoa(result.getInt("codigo"), result.getString("nome"));
					System.out.println(pessoas.getCodigo() + ": " + pessoas.getNome());
				}
				System.out.println("______________________");
				stmt.close();

			} else {
				System.out.println("Falha ao atualizar");
			}

		} else {
			System.out.println("Pessoa não encontrada.");
		}

		entrada.close();
		conexao.close();

	}
}
