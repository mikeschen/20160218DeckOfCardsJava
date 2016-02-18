import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Deck {
  public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
  public static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

  private ArrayList<Card> mCards;

  public Deck() {
    mCards = new ArrayList<Card>();
    for (String suit : SUITS) {
      for (String value : VALUES) {
        Card newCard = new Card(suit, value);
        mCards.add(newCard);
      }
    }
    Collections.shuffle(mCards);
  }

  public ArrayList<Card> getCards(){
    return mCards;
  }

}
