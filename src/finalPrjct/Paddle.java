package finalPrjct;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


public class Paddle extends Rectangle {
	
	int id; //id for player : 1 or 2, id.1 paddle1 , id.2 paddle2
	int yV; //for y Velocity

	
	Paddle(int x, int y, int PaddleWidth, int PaddleHeight, int id){
		super(x,y,PaddleWidth,PaddleHeight);
		this.id=id;
	}
	
	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
	public void setY(int yDirection) {
		
	}
	
	public void setX(int xDirection) {
		
	}
	
	public void move() {
		
	}
	public void draw(Graphics g) {
		
		if(id==1) {
			g.setColor(Color.blue);
		}else {
			g.setColor(Color.yellow);
		}
		g.fillRect(x, y, width, height);
	}
}
