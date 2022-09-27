package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com");
		boolean senhaValida = campoSenha.getText().equals("1234");
		
		if(emailValido && senhaValida) {
			System.out.println("Entrou");
		} else {
			System.out.println("Falhou");
		}
		
	}
	
	
}
