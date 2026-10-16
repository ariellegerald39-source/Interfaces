import java.util.Comparator;

public class ValueComparator implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        // Compare cards by their value only
        return c1.getValue().compareTo(c2.getValue());
    }
}
