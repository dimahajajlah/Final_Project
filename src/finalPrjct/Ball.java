package finalPrjct;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle {
	
	int y; //for y Velocity
	int x; //for x Velocity
	Random random;
	//Rectangle ball;

	
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection*2);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection*2);
		
	}
	

	public void setXDirection(int randomXDirection) {
		x = randomXDirection;
	}
	
	public void setYDirection(int randomYDirection) {
		y = randomYDirection;
	}
	public void move() {
		x += x;
		y +=y;
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, height, width);
	}

}
