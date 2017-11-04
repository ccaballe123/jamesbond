package game.backend;

public class Card{
	
//  0 spades
//	1 hearts
//	2 diamonds
//	3 clubs
	
	private final int _suite;
	private final int _num;
	
	public Card(int number, int cardSuite){
		if(number>13||number<0){
			 throw new IllegalArgumentException("Illegal playing card number");
		}
		if(cardSuite>4||cardSuite<0){
			 throw new IllegalArgumentException("Illegal playing card suite");

		}
		_suite = cardSuite;
		_num = number;
	}
	
	public int getSuite(){
		return _suite;
	}

	public String getSuitetoString(){
		
       String suiteString = "";
        switch (_suite) {
        case 0: suiteString ="Spade";
        	break;
        case 1: suiteString ="Heart";
        	break;
        case 2: suiteString ="Diamond";
        	break;
        case 3: suiteString ="Club";
        
        }
        return suiteString;
		
	}
	
	public int getNumber(){
		return _num;
	}
	
}
