package finalPrjct;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class GameFrame extends JFrame {
	
	GamePanel panel;
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("** Pong Game **");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		panel.setBackground(Color.darkGray);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //it's going to appear in the middle of the screen 
	}

}
