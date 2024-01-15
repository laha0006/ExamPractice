package beer;

public class Main {
    public static void main(String[] args) {
        Beer beer1 = new Beer("Best1",5,100);
        Beer beer2 = new Beer("Best2",5,300);
        Beer beer3 = new Beer("Best3",5,200);
        Beer beer4 = new Beer("Best3",5,200);

        beer1.setAlchoholPercentage(0);
        beer1.setAlchoholPercentage(101);
        Beer[] beers = {beer1,beer2,beer3,beer4};
        double totalPrice = 0;
        for (Beer beer : beers) {
            totalPrice += beer.getPrice();
        }
        double avgPrice = totalPrice / beers.length;
        System.out.println(avgPrice);
    }
}
