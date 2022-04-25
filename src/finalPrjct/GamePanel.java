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
	static final int PaddleWidth = 25; //Paddle Width
	static final int PaddleHeight = 110; //Paddle Height
	Thread gameThread;
	Image image;
	Graphics gg; //graphics
	Random random;
	Paddle paddle1;
	Paddle paddle2;

	Ball ball;
	Score score;
	//static Ball b = new Ball(250, 200);

	
	public GamePanel(){
		newPaddles();
		newBall();
		score = new Score(gameWidth,gameHeight);

		this.setFocusable(true);
		this.addKeyListener(new ALr()); //AL the inner class
		this.setPreferredSize(ScreenSize);
		gameThread = new Thread(gameThread);
		gameThread.start();

		
	}
	
	public void newBall() {
		random = new Random();
		ball = new Ball((gameWidth/2)-(BallDiameter/2),random.nextInt(gameHeight-BallDiameter),BallDiameter,BallDiameter);
	
	}
	public void newPaddles() {
		 paddle1 = new Paddle(7,(gameHeight/2)-(PaddleHeight/2),PaddleWidth,PaddleHeight,1);
		 paddle2 = new Paddle(gameWidth-PaddleWidth,(gameHeight/2)-(PaddleHeight/2),PaddleWidth,PaddleHeight,2);
		 //paddle2 = new Paddle(gameWidth-PaddleWidth,(gameHeight/2)-(PaddleHeight/2),PaddleWidth,PaddleHeight,2);

			
	}
	public void print(Graphics g) {
		image = createImage(getWidth(),getHeight());
		gg = image.getGraphics();
		draw(gg);
		g.drawImage(image,0,0,this);
		
		
	}
	public void draw(Graphics g) {

		g.drawString("", gameWidth, gameHeight);
		
		ball.draw(g);
		paddle1.drawPaddle(g);
		paddle2.drawPaddle(g);
		score.draw(g);
		
		Toolkit.getDefaultToolkit().sync();
	}
	public void move() {
		paddle1.move();
		paddle2.move();
		ball.move();
	}
	
	public void checkCollision() {
				if(ball.y <=0) {
					ball.setYDirection(-ball.y);
				}
				if(ball.y >= gameHeight-BallDiameter) {
					ball.setYDirection(-ball.y);
				}
				//bounce ball off paddles
				if(ball.intersects(paddle1)) {
					ball.x = Math.abs(ball.x);
					ball.x++; //optional for more difficulty
					if(ball.y>0)
						ball.y++; //optional for more difficulty
					else
						ball.y--;
					ball.setXDirection(ball.x);
					ball.setYDirection(ball.y);
				}
				if(ball.intersects(paddle2)) {
					ball.x = Math.abs(ball.x);
					ball.x++; //optional for more difficulty
					if(ball.y>0)
						ball.y++; //optional for more difficulty
					else
						ball.y--;
					ball.setXDirection(-ball.x);
					ball.setYDirection(ball.y);
				}
				//stops paddles at window edges
				if(paddle1.y<=0)
					paddle1.y=0;
				if(paddle1.y >= (gameHeight-PaddleHeight))
					paddle1.y = gameHeight-PaddleHeight;
				if(paddle2.y<=0)
					paddle2.y=0;
				if(paddle2.y >= (gameHeight-PaddleHeight))
					paddle2.y = gameHeight-PaddleHeight;
				//give a player 1 point and creates new paddles & ball
				if(ball.x <=0) {
					score.player2++;
					newPaddles();
					newBall();
					System.out.println("Player 2: "+score.player2);
				}
				if(ball.x >= gameWidth-BallDiameter) {
					score.player1++;
					newPaddles();
					newBall();
					System.out.println("Player 1: "+score.player1);
				}
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
