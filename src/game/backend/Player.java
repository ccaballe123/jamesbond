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

	public void setSet(int index, Card[] set) {
		_hand.set(index, set);
	}

	public Card[] getSet(int index) {
		return _hand.get(index);
	}

	public void setHand(ArrayList<Card[]> hand) {
		_hand = hand;
	}

	public ArrayList<Card[]> getHand() {
		return _hand;
	}

	public void getCard(Card in, Card out, Card[] set) {
		Card[] activeCards = _game.getActiveCards();
		activeCards[getIndex(set, in)] = out;
		set[getIndex(set, out)] = in;
		_game.setActiveCards(activeCards);
	}

	public boolean handIsComplete() {
		for(int i = 0; i < _hand.size(); ++i) {
			Card num = _hand.get(i)[0];
			for(int j = 1; j < 4; ++j) {
				if(_hand.get(i)[j] == num) continue;
				else return false;
			}
		}

		return true;
	}

	public void callJamesBond() {
		if(handIsComplete()) {
			// Call game over in game class
		}
	}

}