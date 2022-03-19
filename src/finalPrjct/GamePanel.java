package finalPrjct;
import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class GamePanel extends JPanel implements Runnable {
	
	static final int gameWidth=1200; //game Width
	//static final int gameHeight= (int)(gameWidth*(0.5555)); //game Height 
	static final int gameHeight= gameWidth * 9 / 16; //game Height 
	static final Dimension ScreenSize = new Dimension(gameWidth,gameHeight); //Screen Size from java.awt.Dimension
	static final int BallDiameter = 20; //Ball Diameter
	static final int PaddleWidth = 35; //Paddle Width
	static final int PaddleHeight = 120; //Paddle Height
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Paddle p3;
	Ball ball;
	Score score;
	
	
	GamePanel(){
		newPaddles();
		newBall();
		score = new Score(gameWidth,gameHeight);
		this.setFocusable(true);
		this.addKeyListener(new ALr()); //AL the inner class
		this.setPreferredSize(ScreenSize);
		//this.paint(graphics);
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public void newBall() {
		//random = new Random();
		//ball = new Ball((gameWidth/2)-(BallDiameter/2),random.nextInt(gameHeight-BallDiameter),BallDiameter,BallDiameter);
	
	}
	public void newPaddles() {
		 paddle1 = new Paddle(0,(gameHeight/2)-(PaddleHeight/2),PaddleWidth,PaddleHeight,1);
		 paddle2 = new Paddle(gameWidth-PaddleWidth,(gameHeight/2)-(PaddleHeight/2),PaddleWidth,PaddleHeight,2);

	}
	public void print(Graphics g) {
		image = createImage(getWidth(),getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image,0,0,this);
		
		
	}
	public void draw(Graphics g) {
		//g.setFont(getFont());
		paddle1.drawPaddle(g);
		paddle2.drawPaddle(g);
		System.out.println(paddle2.id);
		//p3.draw(g);
	}
	public void move() {
		paddle1.move();
		paddle2.move();
	}
	
	public void checkCollision() {
		
	}
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks =60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now-lastTime)/ns;
			lastTime = now;
			if(delta >=1) {
				move();
				checkCollision();
				repaint();
				delta--;
				//System.out.println("TEST");
			}
		}
	}
	
	public class ALr extends KeyAdapter{
		//ALr short for action listener
		public void keyPressed(KeyEvent e) {
			paddle1.keyPressed(e);
			paddle2.keyPressed(e);
		}
		
		public void keyReleased(KeyEvent e) {
			paddle1.keyReleased(e);
			paddle2.keyReleased(e);
		}


	}

}
