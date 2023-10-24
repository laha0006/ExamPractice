public enum Suit {
    SPADES(4),
    HEARATS(3),
    DIAMONDS(2),
    CLUBS(1);

    private int value;
    Suit(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}
