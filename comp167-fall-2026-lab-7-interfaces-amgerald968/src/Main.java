import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Instantiate a new deck of cards
        Deck myDeck = new Deck();

        // Shuffle the cards
        myDeck.shuffle();
        JOptionPane.showMessageDialog(null, myDeck.toString(), "Shuffled Deck", JOptionPane.INFORMATION_MESSAGE);

        // Sort the cards using Comparable (Color then Value)
        myDeck.sort();
        JOptionPane.showMessageDialog(null, myDeck.toString(), "Sorted Deck (Color, Value)", JOptionPane.INFORMATION_MESSAGE);

        // Sort the cards using Comparator (Value only)
        myDeck.valueSort();
        JOptionPane.showMessageDialog(null, myDeck.toString(), "Sorted Deck (Value Only)", JOptionPane.INFORMATION_MESSAGE);
    }
}