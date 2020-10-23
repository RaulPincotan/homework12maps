package extramilemainversion;

public class Car {
    private final String name;
    private final int age;
    private final int km;
    private double price;
    private final KmRange kmRange;
    private final PriceRange priceRange;


    public Car(String name, int age, int km, double price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;

        if (this.km < 50000) {
            this.kmRange = KmRange.LOW;
        } else if (this.km < 100000) {
            this.kmRange = KmRange.MEDIUM;
        } else {
            this.kmRange = KmRange.HIGH;
        }


        if (this.price < 10000) {
            this.priceRange = PriceRange.CHEAP;
        } else if (this.price < 20000) {
            this.priceRange = PriceRange.MIDDLEBUDGET;
        } else {
            this.priceRange = PriceRange.EXPANSIVE;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public double getPrice() {
        return price;
    }

    public KmRange getKmRange() {
        return kmRange;
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", km=" + km +
                ", price=" + price + ", km range=" + kmRange + ", price range=" + priceRange +
                '}';
    }
}
