package beer;

public class Beer {
    private String name;
    private int alchoholPercentage;
    private double price;

    public Beer(String name, int alchoholPercentage,double price) {
        this.name = name;
        this.alchoholPercentage = alchoholPercentage;
        this.price = price;
    }

    public void setAlchoholPercentage(int alchoholPercentage) {
        if(alchoholPercentage < 0 || alchoholPercentage > 100) {
            throw new IllegalArgumentException("Number must be between 0 and 100");
        }
        this.alchoholPercentage = alchoholPercentage;
    }

    public void setPrice(double price) {
        if (price < 0 ) {
            throw new IllegalArgumentException("number must be positive.");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
