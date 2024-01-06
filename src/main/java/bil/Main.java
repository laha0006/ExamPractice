package bil;

public class Main {
    public static void main(String[] args) {
        Bil bil1 = new Bil(2400);
        Bil bil2 = new Bil(2400);
        Trailer letTrailer = new Trailer(1000);
        Trailer tungTrailer = new Trailer(2000);

        System.out.println(bil1.setTrailer(letTrailer));
        System.out.println(bil1.getTotalVægt());

        System.out.println(bil2.setTrailer(tungTrailer));
        System.out.println(bil2.getTotalVægt());
    }
}
