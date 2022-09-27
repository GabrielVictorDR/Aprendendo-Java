package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarBanco {

	public static void main(String[] args) throws SQLException{
		
		final String url = "";
		final String usuario = "";
		final String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco Criado Com sucesso!");
		conexao.close();
	}
}
