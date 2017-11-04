package game.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Game {

	private ArrayList<Player> _playerList;
	private Stack<Card> _deck;
	public static int SIZE = 4;
	public static int TOTAL_CARDS = 52;
	private Card[] _activeCards = new Card[SIZE]; // Cards that are in the middle, active for players to take

	public Game() {
		_playerList = null;
		_activeCards = null;
		_deck = null;
	}
	
	public Game(ArrayList<Player> players) {
		_playerList = players;
		_activeCards = null;
		_deck = new Stack<Card>();
	}

	public void initializeDeck() {
		for(int i=0;i<13;i++){
			for(int j=0;j<4;j++){
				_deck.push(new Card(i,j));
			}
		}
		if(_deck.size()!= TOTAL_CARDS)
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
	public void initializePlayer(){
		ArrayList<Card[]> sets = new ArrayList<Card[]>() ;
		int size = TOTAL_CARDS - SIZE;
		int pcards= size/2;
		for(int j= 0;j<4;j++){
			for(int i = 0;i<pcards;i++){
				sets.get(0)[j]= _deck.get(i);
			}
		}
			
		}
}
