/*Poker game AI strategies:
- How many players?
- Bluff accomodation (Random ?)
- How do the cards rank? If card rank higher, less bluff, more chance


if(currentBet == 0) {
	player2.check();
	//in what situations would the AI want to bluff? (Or raise)
*/
//♥ ♦ ♠ ♣
//Regular numbers =/= 10 have to include space (i.e. "9 ")
import java.util.*;

public class test {
  public static void main(String[] args) {

    //Game initialized with two people (player and AI)
    /*ArrayList<Card> deck = initializeDeck();
    for(int i = 0; i < deck.size(); i++) {
      System.out.print(deck.get(i).toString() +", ");
    }
    System.out.println();
    Collections.shuffle(deck); //shuffles deck and stores shuffled deck into deck
    for(int i = 0; i < deck.size(); i++) {
      //System.out.print(deck.get(i).toString() +", ");
    }
    System.out.println();
    displayCards(deck);*/
    deal2();




    //main cards
  }

  public static ArrayList<Card> initializeDeck() { //♥ ♦ ♠ ♣
    ArrayList<Card> deck = new ArrayList<Card>();
    String suit = "";
    int num = 0;
    for(int i = 1; i < 5; i++) {
      for(int j = 1; j < 14; j++) {
        if(i == 1) {
          suit = "♥";
        }
        else if (i == 2) {
          suit = "♦";
        }
        else if (i == 3) {
          suit = "♠";
        }
        else if (i == 4) {
          suit = "♣";
        }
        deck.add(new Card(j, suit));
      }
    }
    return deck;
  }

  public static String formatNum(int num) {
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
    return num + " ";
  }

  public static void deal2() {
    Scanner scan = new Scanner(System.in);
    ArrayList<Card> deck = initializeDeck();

    Collections.shuffle(deck);  //shuffle
    Card p1c1 = deck.remove(0); //first card to player 1
    Card p2c1 = deck.remove(0); //second card to player 2
    Card p1c2 = deck.remove(0); //third card to player 1
    Card p2c2 = deck.remove(0); //fourth card to player 2
    Hand player1 = new Hand(p1c1, p1c2);
    Hand player2 = new Hand(p2c1, p2c2); //AI hand, should never be shown

    deck.remove(0); //burn top card

    Card c1 = deck.remove(0);
    Card c2 = deck.remove(0);
    Card c3 = deck.remove(0);
    Field f = new Field(c1, c2, c3);
    System.out.println("Playing field : Current Bet = 0");
    System.out.println("Check (c) / Raise (r (amount)) / Fold (f)?");
    displayCards(f.getCurrentField());
    System.out.println("Your hand: ");
    displayCards(player1.getHand());

    String in = scan.nextLine();

    deck.remove(0); //burn top card again

    Card c4 = deck.remove(0);
    f.flipFourth(c4);

    System.out.println("Playing field : Current Bet = 0");
    System.out.println("Check (c) / Raise (r (amount)) / Fold (f)?");
    displayCards(f.getCurrentField());
    System.out.println("Your hand: ");
    displayCards(player1.getHand());

    String in2 = scan.nextLine();

    deck.remove(0); //burn top card again

    Card c5 = deck.remove(0);
    f.flipFifth(c5);

    System.out.println("Playing field : Current Bet = 0");
    System.out.println("Check (c) / Raise (r (amount)) / Fold (f)?");
    displayCards(f.getCurrentField());
    System.out.println("Your money: $268m | Your hand: ");
    displayCards(player1.getHand());




  }

  public static void displayCards (ArrayList<Card> cards) {
    String l1 = "";
    String l2 = "";
    String l3 = "";
    String l4 = "";
    String l5 = "";
    for(int i = 0; i < cards.size(); i++) {
      Card c = cards.get(i);
      String num = formatNum(c.getNumber());
      String suit = c.getSuit();
      l1 += " _____   ";
      l2 += "|     |  ";
      l3 += "| " + (num) + (suit) + " |  ";
      l4 += "|     |  ";
      l5 += " ▔▔▔  ";
      if(i % 2 == 1) {
        l5 += " ";
      }
    }

    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
    System.out.println(l4);
    System.out.println(l5);


  }
}



//System.out.println("How many players would you like to play against? (1-5)");
//int players = scan.nextInt();

//player hand
/*
System.out.println(" _____     _____ ");
System.out.println("|     |   |     |");
System.out.println("│ 10♣ |   | 9 ♥ |");
System.out.println("│     |   |     |");
System.out.println(" ▔▔▔    ▔▔▔ ");
System.out.println(" _____     _____     _____  ");
System.out.println("|     |   |     |   |     |");
System.out.println("| " + (num) + (suit) + " |   " +  "| " + (num) + (suit) + " |   | " + (num) + (suit) + " |   "); //♥ ♦ ♠
System.out.println("|     |   |     |   |     |");
System.out.println(" ▔▔▔    ▔▔▔     ▔▔▔");*/
