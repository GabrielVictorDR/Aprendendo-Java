package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btnA = new Button("botão A");
		Button btnB = new Button("botão B");
		Button btnC = new Button("botão C");
		
		btnC.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(btnA);
		box.getChildren().add(btnB);
		box.getChildren().add(btnC);
		
		Scene cena = new Scene(box, 300, 100);
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
