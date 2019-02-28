import java.util.*;

public class Card {
  private int number;
  private String suit;

  public Card(int n, String s) {
    number = n;
    suit = s;
  }

  public int getNumber() {
    return number;
  }

  public String getSuit() {
    return suit;
  }

  public void setNumber(int n) {
    number = n;
  }

  public void setSuit(String s) {
    suit = s;
  }

  public boolean equals(Card c) {
    return number == c.getNumber() && suit.equals(c.getSuit());
  }

  public String toString() {

    return formatNum(number) + suit;
  }


    public String formatNum(int num) {
      if(num == 11) {
        return "J ";
      }
      else if(num == 12) {
        return "Q ";
      }
      else if(num == 13) {
        return "K ";
      }
      else if(num == 1) {
        return "A ";
      }
      else if(num == 10) {
        return "10";
      }
      else {
        return num + " ";
      }

    }
}
