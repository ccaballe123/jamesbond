package game.frontend;

import game.backend.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SupressWarnings("serial")
public class DisplayBoard extends JFrame {

	private JFrame board;
	private JFrame infoPanel;

	private JPanel p1;
	private JPanel p2;
	private JPanel midCards;

	public DisplayBoard(){
		gui();
		
	}

	public void gui(){
		board = new JFrame("James Bond Card Game");
		board.setExtendedState(JFrame.MAXIMIZED_BOTH);
		board.setUndecorated(true);
		board.setVisible(true);
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p2 = new JPanel();
		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);
		board.add(p1, BorderLayout.NORTH);
		board.add(p2, BorderLayout.SOUTH);
		
		infoPanel = new JFrame();
		infoPanel.setBackground(Color.YELLOW);
		infoPanel.setPreferredSize(new Dimension(700, 700));
    	infoPanel.setVisible(true);
		infoPanel.pack();
		infoPanel.setLocationRelativeTo(null);



	}

}