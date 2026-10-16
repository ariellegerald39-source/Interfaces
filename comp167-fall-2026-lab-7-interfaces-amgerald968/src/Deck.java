import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    // ArrayList to hold the cards
    private ArrayList<Card> cards;

    // Constructor: creates the 76 Uno cards
    public Deck() {
        cards = new ArrayList<Card>();

        // Adding Red cards
        cards.add(new Card("red", "0"));
        for (int i = 1; i <= 9; i++) {
            cards.add(new Card("red", i + ""));
            cards.add(new Card("red", i + ""));
        }

        // Adding Green cards
        cards.add(new Card("green", "0"));
        for (int i = 1; i <= 9; i++) {
            cards.add(new Card("green", i + ""));
            cards.add(new Card("green", i + ""));
        }

        // Adding Blue cards
        cards.add(new Card("blue", "0"));
        for (int i = 1; i <= 9; i++) {
            cards.add(new Card("blue", i + ""));
            cards.add(new Card("blue", i + ""));
        }

        // Adding Yellow cards
        cards.add(new Card("yellow", "0"));
        for (int i = 1; i <= 9; i++) {
            cards.add(new Card("yellow", i + ""));
            cards.add(new Card("yellow", i + ""));
        }
    }

    // Shuffle method
    public void shuffle() {
        Random rand = new Random();

        // Outer loop executed 7 times
        for (int i = 0; i < 7; i++) {
            // Inner loop executed 76 times (once for every card)
            for (int j = 0; j < cards.size(); j++) {
                int randomNum = rand.nextInt(cards.size());

                // Swap the cards
                Card tempCard = cards.get(j);
                cards.set(j, cards.get(randomNum));
                cards.set(randomNum, tempCard);
            }
        }
    }

    // Sort method using Collections.sort for Comparable
    public void sort() {
        Collections.sort(cards);
    }

    // Value sort method using the ValueComparator
    public void valueSort() {
        ValueComparator myComparator = new ValueComparator();
        Collections.sort(cards, myComparator);
    }

    // toString method with a pipe separator and a newline every 15 cards
    public String toString() {
        String result = "";

        for (int i = 0; i < cards.size(); i++) {
            result = result + cards.get(i).toString();

            // Add a separator if it is not the very last card
            if (i < cards.size() - 1) {
                result = result + " | ";
            }

            // Add a newline after every 15 cards
            if ((i + 1) % 15 == 0) {
                result = result + "\n";
            }
        }

        return result;
    }
}