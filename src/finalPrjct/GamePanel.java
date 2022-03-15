package finalPrjct;
import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class GamePanel extends JPanel implements Runnable {
	
	static final int gameWidth=1000; //game Width
	static final int gameHeight= (int)(gameWidth*(0.5555)); //game Height 
	static final Dimension ScreenSize = new Dimension(gameWidth,gameHeight); //Screen Size from java.awt.Dimension
	static final int BallDiameter = 20; //Ball Diameter
	static final int PaddleWidth = 25; //Paddle Width
	static final int PaddleHeight = 100; //Paddle Height
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Ball ball;
	Score score;
	
	
	GamePanel(){
		newPaddles();
		newBall();
		score = new Score(gameWidth,gameHeight);
		this.setFocusable(true);
		this.addKeyListener(new AL()); //AL the inner class
		this.setPreferredSize(ScreenSize);
		
		gameThread = new Thread((Runnable) this);
		gameThread.start();
	}
	
	public void newBall() {
		
	}
	public void newPaddles() {
		
	}
	public void print(Graphics g) {
		image = createImage(getWidth(),getHeight());
		
	}
	public void draw(Graphics g) {
		
	}
	public void checkCollision() {
		
	}
	public void run() {
		
	}
	
	public class AL extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			
		}
		
		public void keyReleased(KeyEvent e) {
			
			
		}


	}

}
