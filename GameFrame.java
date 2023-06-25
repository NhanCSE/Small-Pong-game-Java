import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	
	GamePanel panel;
	
	GameFrame() {
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game by Nhaan");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//to window will adjust and fit size of gamePanel when adding to gameFrame automatically 
		this.pack();
		this.setVisible(true);
		
		//to appear in the middle of screen
		this.setLocationRelativeTo(null);
		
	}
	
}
