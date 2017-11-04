package game.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Game {

	private int _numOfPlayers;
	private ArrayList<Player> _playerList;
	private Stack<Card> _deck;
	public static int SIZE = 4;
	public static int TOTAL_CARDS = 52;
	private Card[] _activeCards = new Card[SIZE]; // Cards that are in the middle, active for players to take
	
	public Game(int numOfPlayers) {
		_activeCards = null;
		_numOfPlayers = numOfPlayers;
		_deck = new Stack<Card>();
		initializeDeck();
		initializePlayers(numOfPlayers);
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

	public void setActiveCards(Card[] activeCards) {
		_activeCards = activeCards;
	}	


	public int getNumOfSets() {
		if(_numOfPlayers == 2) return 6;
		else if(_numOfPlayers == 3) return 4;
		else return 3;
	}


	// Initialize Player Cards
	// Creates sets for player's hand
	public void initializePlayerCards(Player p) {
		// ArrayList<Card[]> sets = new ArrayList<Card[]>() ;
		// int size = TOTAL_CARDS - SIZE; // 48
		// int pcards= size/2; // 24
		// for(int j= 0;j<4;j++){
		// 	for(int i = 0;i<pcards;i++){
		// 		sets.get(0)[j]= _deck.get(i);
		// 	}
		// }
		int numOfSets = getNumOfSets();
		ArrayList<Card[]> hand = new ArrayList<Card[]>();
		if(!_deck.empty()) {
			for(int i = 0; i < numOfSets; ++i) {
				Card[] set = new Card[4];
				for(int j = 0; j < 4; ++j) {
					set[j] = _deck.pop();
				}
				hand.set(i, set);
			}
		}
		p.setHand(hand);	
	}

	public void initializePlayers(int numOfPlayers){
		for(int i = 0; i < numOfPlayers; ++i) {
			Player p = new Player(this);
			initializePlayerCards(p);
			_playerList.add(p);
		}
	}

	public ArrayList<Player> getPlayerList() {
		return _playerList;
	}

}
