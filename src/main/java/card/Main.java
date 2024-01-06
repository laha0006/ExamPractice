package card;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Suit.SPADES, 13);
        Card card2 = new Card(Suit.DIAMONDS, 13);
        Card card3 = new Card(Suit.CLUBS, 12);
        Card card4 = new Card(Suit.SPADES, 8);


        System.out.println(card1.beats(card2));
        System.out.println(card2.beats(card1));
        System.out.println(card3.beats(card4));
        System.out.println(card4.beats(card3));
    }
}
