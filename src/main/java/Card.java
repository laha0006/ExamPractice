public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean beats(Card card) {
        if (getValue() == card.getValue()) {
            return getSuitValue() > card.getSuitValue();
        }
        return this.value > card.getValue();
    }

    public int getValue() {
        return value;
    }

    public int getSuitValue() {
        return suit.getValue();
    }
}
