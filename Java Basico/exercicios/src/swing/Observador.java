package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");

		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(500, 300);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);

		JButton button = new JButton("-> Clique Aqui <-");
		janela.add(button);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicou!!!");
			}
			
		});
		janela.setVisible(true);

		
	}
}
