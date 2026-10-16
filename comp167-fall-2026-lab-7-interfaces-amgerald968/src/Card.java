public class Card implements Comparable<Card> {
    private String color;
    private String value;

    // Default constructor
    public Card() {
        color = "";
        value = "";
    }

    // Parameterized constructor
    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    // Accessors
    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    // Mutators
    public void setColor(String color) {
        this.color = color;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // toString method using comma separation
    @Override
    public String toString() {
        return color + ", " + value;
    }

    // Comparable implementation: sorts by color first, then value
    @Override
    public int compareTo(Card otherCard) {
        int colorResult = this.color.compareTo(otherCard.color);

        if (colorResult != 0) {
            return colorResult;
        } else {
            return this.value.compareTo(otherCard.value);
        }
    }
}