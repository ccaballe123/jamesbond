package game.frontend;

import game.backend.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayBoard extends JFrame {

	private JFrame board;
	private JFrame infoPanel;

	private JPanel p1;
	private JPanel p2;
	private JPanel midCards;

	public DisplayBoard(){
		super("James Bond Card Game");
		gui();
		
	}

	public void gui(){
		infoPanel = new JFrame();
		infoPanel.setBackground(Color.YELLOW);
		infoPanel.setPreferredSize(new Dimension(500, 500));
		infoPanel.setLocationRelativeTo(null);
    	infoPanel.setVisible(true);
		infoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		board = new JFrame();
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


	}

}