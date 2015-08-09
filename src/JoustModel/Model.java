package JoustModel;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import JoustData.Card;

public class Model {

	public static List<Integer> convertDeck(List<Card> deck){
		List<Integer> fullDeck = new ArrayList();
		for(Card card : deck) {
			if(card != null){
			for(int i = 0; i < card.getCount(); i++){ 
				fullDeck.add(card.getCost()); 
			}}
		}
		return fullDeck;
	}
	
	public static double compare(List<Card> indeck1, List<Card> indeck2){
		
		double wins = 0.0;
		List<Integer> deck1 = convertDeck(indeck1);
		List<Integer> deck2 = convertDeck(indeck2);
		int totals = deck1.size() * deck2.size();
		for(Iterator<Integer> deckIter1 = deck1.iterator(); deckIter1.hasNext();){
			Integer card1 = deckIter1.next();
			for(Iterator<Integer> deckIter2 = deck2.iterator(); deckIter2.hasNext();){
				Integer card2 = deckIter2.next();
				
				if (card1 > card2){wins++;}
			}
		}
		return wins/totals;
	}
	
//	public static void main(String[] args){
//		List<Card> deck1 = new ArrayList();
//		List<Card> deck2 = new ArrayList();
//		deck1.add(new Card("A",1,2));
//		deck1.add(new Card("A",2,2));
//		deck1.add(new Card("A",2,2));
//		deck1.add(new Card("A",10,1));
//		deck1.add(new Card("A",3,2));
//		
//		deck2.add(new Card("A",1,2));
//		deck2.add(new Card("A",2,2));
//		deck2.add(new Card("A",3,2));
//		deck2.add(new Card("A",5,2));
//		
//		double winperc = compare(deck1, deck2);
//		DecimalFormat f = new DecimalFormat("##.00");
//		System.out.println(f.format(winperc*100));
//		
//	}
}
