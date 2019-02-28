import java.util.*;

public class Field {

  private Card c1;
  private Card c2;
  private Card c3;
  private Card c4;
  private Card c5;

  ArrayList<Card> cards = new ArrayList<Card>();

  public Field(Card card1, Card card2, Card card3) {
    c1 = card1;
    c2 = card2;
    c3 = card3;
    cards.add(c1);
    cards.add(c2);
    cards.add(c3);
  }

  public void flipFourth(Card card4) {
    c4 = card4;
    cards.add(c4);
  }

  public void flipFifth(Card card5) {
    c5 = card5;
    cards.add(c5);
  }

  public ArrayList<Card> getCurrentField() {
    return cards;
  }
}
