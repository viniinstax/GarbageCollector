package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	//tratamento de eventos
	
	JButton botao;
	
	public Eventos() {
		super("eventos");
		
		botao = new JButton("Clique Aqui");
		botao.addActionListener(this);
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		botao.setText("Foi Clicado");
	}
	

	public static void main(String[] args) {
		
		new Eventos();
		

	}


	
	

}
