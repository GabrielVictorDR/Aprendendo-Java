package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao() {

		try {
			Properties props = getProperties();
			final String url = props.getProperty("banco.url");
			final String usuario = props.getProperty("banco.usuario");
			final String senha = props.getProperty("banco.senha");

			return DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}

	}
	
	private static Properties getProperties() throws IOException{
		Properties props = new Properties();
		String caminho = System.getProperty("user.home") + "/conexao.properties";
		InputStream stream = new FileInputStream(caminho);
		props.load(stream);
		return props;
	}
}
