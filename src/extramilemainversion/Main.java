package extramilemainversion;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(new Car("Audi", 2012, 120000, 5900),
                new Car("Audi", 2017, 45000, 19900),
                new Car("Ford", 2009, 190000, 4500),
                new Car("Audi", 2010, 154000, 5900),
                new Car("VW", 2014, 90000, 8900),
                new Car("Mercedes", 2018, 19000, 29000),
                new Car("Mercedes", 2005, 219000, 6000),
                new Car("BMW", 2012, 240000, 12000),
                new Car("Lexus", 2013, 139000, 14000),
                new Car("VW", 2005, 290000, 2900)
        ));

        System.out.println(carShop.mapCarNameToNumberOfCars("Audi"));
        System.out.println(carShop.mapCarNameToNumberOfCars("VW"));
        System.out.println(carShop.mapCarNameToNumberOfCars("Ford"));

        System.out.println(carShop.getCars());
        System.out.println();

        System.out.println(carShop.mapCarToKM());
        System.out.println();

        for (KmRange range : carShop.mapKmRangeToCars().keySet()) {
            System.out.println(range + "->" + carShop.mapKmRangeToCars().get(range));
        }

        System.out.println();

        for (PriceRange range : carShop.mapPriceRangeToCars().keySet()) {
            System.out.println(range + "->" + carShop.mapPriceRangeToCars().get(range));
        }
    }
}
