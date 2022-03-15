package finalPrjct;

import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GamePanel panel;
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setBackground(Color.darkGray);
		this.setTitle("** Pong Game **");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); //it's going to appear in the middle of the screen 
	}

}
