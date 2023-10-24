import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Keyword keyword = new Keyword("Keyword", "A word or concept of great significance");
//        Keyword someRelatedWord = new Keyword("Related", "Trust me.");
//        Keyword someRelatedWord2 = new Keyword("Related2", "Trust me.2");
//        keyword.addSeeAlsoKeyword(someRelatedWord);
//        keyword.addSeeAlsoKeyword(someRelatedWord2);
//        System.out.println(keyword);
//        System.out.println(keyword.matches("key"));
//        Card aceOfSpades = new Card(Suit.SPADES,13);
//        Card aceOfHearts = new Card(Suit.HEARATS,13);
//        System.out.println(aceOfHearts.beats(aceOfSpades));
        Bil bilen = new Bil(1200);
        Trailer trailer = new Trailer(1200);
        Trailer tungTrailer = new Trailer(2500);
        System.out.println(bilen.getTrailer());
        System.out.println(bilen.setTrailer(trailer));
        System.out.println(bilen.setTrailer(tungTrailer));
        System.out.println(bilen.totalVægt());

    }
}
