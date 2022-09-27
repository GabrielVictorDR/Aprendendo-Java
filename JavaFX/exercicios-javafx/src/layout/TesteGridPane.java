package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane{
	
	public TesteGridPane() {
	
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		
		setGridLinesVisible(true);		
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());
		
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 2, 2, 2, 2);
		add(c4, 3, 3, 2, 2);
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		
		return rc;
	}
}
