package finalPrjct;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class GameFrame extends JFrame {
	
	GamePanel panell;
	GameFrame(){
		panell = new GamePanel();
		this.add(panell);

		//this.add(panell);
		//panell.setBackground(Color.red);
		this.setTitle("** Pong Game **");
		panell.setBackground(Color.darkGray);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); //it's going to appear in the middle of the screen 
		panell.draw(getGraphics());

		//panell.paddle1;
		//System.out.println(panell.paddle1);
		
	}

}
