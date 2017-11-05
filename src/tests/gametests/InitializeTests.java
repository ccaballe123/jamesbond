package tests.gametests;

import game.backend.Game;
import game.backend.Player;
import game.backend.Card;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class InitializeTests {
	
	private Game _game;
	private ArrayList<Player> _playerList;
	
	public InitializeTests() {
		_game = new Game(2);
		_playerList = _game.getPlayerList();
	}
	
	@Test
	public void PlayerInit() {
		InitializeTests it = new InitializeTests();
		ArrayList<Card[]> playerHand = _playerList.get(0).getHand();
		assertTrue("", _playerList.size() == 2);
	}
	
	@Test
	public void PlayerCards() {
		InitializeTests it = new InitializeTests();
		Player p = _playerList.get(0);
		ArrayList<Card[]> playerHand = p.getHand();
		assertTrue("", p.getHand().size() == 6);
		assertTrue("", p.getHand().size() * p.getHand().get(0).length == 24);
	}
	
	
	
}