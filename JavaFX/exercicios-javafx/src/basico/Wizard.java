package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	@Override
	public void start(Stage primaryStage) throws Exception {

		janela = primaryStage;

		criarPasso1();
		criarPasso2();
		criarPasso3();

		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();

	}

	private void criarPasso1() {

		Button proxPasso = new Button("Ir para Passo 2 ->");
		proxPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 2");
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proxPasso);

		passo1 = new Scene(box, 400, 400);

	}

	private void criarPasso2() {

		Button passoAnt = new Button("<- Ir para Passo 1");
		passoAnt.setOnAction(e -> {
			janela.setScene(passo1);
			janela.setTitle("Wizard");
		});

		Button proxPasso = new Button("Ir para Passo 3 ->");
		proxPasso.setOnAction(e -> {
			janela.setScene(passo3);
			janela.setTitle("Wizard :: Passo 3");
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnt);
		box.getChildren().add(proxPasso);

		passo2 = new Scene(box, 400, 400);

	}

	private void criarPasso3() {

		Button passoAnt = new Button("<- Ir para Passo 2");
		passoAnt.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 2");
		});

		Button proxPasso = new Button("Finalizar");
		proxPasso.setOnAction(e -> {
			System.exit(0);
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnt);
		box.getChildren().add(proxPasso);

		passo3 = new Scene(box, 400, 400);

	}

	public static void main(String[] args) {
		launch(args);
	}

}
