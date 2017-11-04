package game.frontend;

import game.backend.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayBoard {

	private JFrame board;

	private JPanel p1;
	private JPanel p2;
	private JPanel midCards;

	public DisplayBoard(){
		
	}

	private void gui(){
		board = new JFrame();
		board.setExtendedState(JFrame.MAXIMIZED_BOTH);
		board.setUndecorated(true);
		board.setVisible(true);
	}

}