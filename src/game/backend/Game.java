package src.game;

import game.backend.*;
import java.util.Collections;

public class Game {

	private ArrayList<Player> _playerList;
	private ArrayList<Card> _deck;
	public static int SIZE = 4;
	public static int TOTAL_CARDS = 48;
	private Card[] _activeCards = new Card[SIZE]; // Cards that are in the middle, active for players to take

	public Game() {
		_playerList = null;
		_activeCards = null;
		_deck = null;
	}
	
	public Game(ArrayList<Player> players) {
		_playerList = players;
		_activeCards = null;
		_deck = new ArrayList<Card>();
	}

	public void initializeDeck() {
		for(int i = 0; i < TOTAL_CARDS; ++i) {
			_deck.add(new Card(i));
		}
		Collections.shuffle(_deck);
	}

	public void initializeActiveCards() {
		Card[] result = new Card[SIZE];
		for(int i = 0; i < SIZE; ++i) {
			result[i] = _deck.get(i);
		}
		_activeCards = result;
	}

	public Card[] getActiveCards() {
		return _activeCards;
	}

	public void updateActiveCards(Card in, Card out) {

	}	

}
