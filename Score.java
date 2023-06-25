import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle{
	
	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1; 
	int player2;
	
	Score(int GAME_WIDTH, int GAME_HEIGHT) {
		Score.GAME_HEIGHT = GAME_HEIGHT;
		Score.GAME_WIDTH = GAME_WIDTH;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Consolas", Font.PLAIN, 60));
		
		//Pass the two coordinates x1, y1 and x2, y2
		//That will draw the line to connect two points
		//Draw a line in the centre of screen to separate two players
		g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
		
		
		//Draw the score of two players (value, x, y)
		// value of score is displayed by two digits
		g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
		g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);
	}
}
