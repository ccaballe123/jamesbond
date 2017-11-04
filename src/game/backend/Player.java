package game.backend;

import game.backend.*;
import java.util.Collections;
import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card[]> _hand;
	private Game _game;

	public Player(Game game) {
		_game = game;
		_hand = null;
	}

	public int getIndex(Card[] set, Card card) {
		for(int i = 0; i < _game.SIZE; ++i) {
			if(set[i].equals(card)) {
				return i;
			}
		}
		return -1;
	}

	public setSet(int index, Card[] set) {
		_hand.get(i) = set;
	}

	public void getCard(Card in, Card out, Card[] set) {
		Card[] activeCards = _game.getActiveCards();
		activeCards[getIndex(set, in)] = out;
		set[getIndex(set, out)] = in;
		// _game.updateActiveCards(activeCards);
	}



}