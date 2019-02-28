import java.util.*;
import java.util.*;
public class Hand {
  private Card c1;
  private Card c2;

  ArrayList<Card> cards = new ArrayList<Card>(2);

  public Hand(Card card1, Card card2) {
    c1 = card1;
    c2 = card2;
    cards.add(c1);
    cards.add(c2);
  }

  public boolean isPocketPair() {
    if (c1.getNumber() == c2.getNumber()) {
      return true;
    }
    else
      return false;
  }

  public boolean isSameSuit() {
    if (c1.getSuit().equals(c2.getSuit())) {
      return true;
    }
    else
      return false;
  }

  public ArrayList<Card> getHand() {
    return cards;
  }


}
