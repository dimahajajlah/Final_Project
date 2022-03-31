package finalPrjct;

import java.awt.Color;
import java.awt.Font;
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
		g.setColor(Color.white);
		g.setFont(new Font("Consolas",Font.PLAIN,60));
		
		g.drawLine(gameWidth/2, 0, gameWidth/2, gameHeight);
		g.draw3DRect(player2+10, player1, gameWidth+4, gameHeight+25, isEmpty());
		g.drawArc(500, 260, 200, 230, 200, 700);
		g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (gameWidth/2)-85, 90);
		g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (gameWidth/2)+20, 90);
	
	}

}
