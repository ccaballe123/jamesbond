package game.frontend;

import game.backend.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayBoard extends JFrame {

	private JFrame board;

	private JPanel p1;
	private JPanel p2;
	private JPanel midCards;

	public DisplayBoard(){
		super("James Bond Card Game");
		gui();
		
	}

	 public void gui(){
		board = new JFrame();
		board.setExtendedState(JFrame.MAXIMIZED_BOTH);
		board.setUndecorated(true);
		board.setVisible(true);
	}

}