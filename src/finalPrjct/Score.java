package finalPrjct;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Score extends Rectangle {
	
	static int gameWidth; //game Width
	static int gameHeight; //game Height
	int player1;
	int player2;
	
	Score(int gameWidth, int gameHeight){
		Score.gameWidth = gameWidth;
		Score.gameHeight = gameHeight;
	}
	
	public void draw(Graphics g) {
		
	}

}
