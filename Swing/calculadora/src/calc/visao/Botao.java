package calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color color) {
		setText(texto);
		setFont(new Font("courier", Font.PLAIN, 25));
		setOpaque(true);
		setBackground(color);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(new Color(46, 49, 50)));
	}
}
