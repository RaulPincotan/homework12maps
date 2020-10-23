package extramilemainversion;


import java.util.*;

public class CarShop {
    public List<Car> cars = new ArrayList<>();


    public CarShop(Collection<Car> cars) {
        if (this.cars != null) {
            this.cars.addAll(cars);
        }
    }


    public Map<String, Integer> mapCarNameToNumberOfCars(String carName) {
        Map<String, Integer> result = new HashMap<>();
        int total = 0;
        for (Car car : cars) {
            if (car.getName().equalsIgnoreCase(carName)) {
                total++;
                result.put(car.getName(), total);
            }
        }
        return result;
    }


    public Map<String, List<Integer>> mapCarToKM() {
        Map<String, List<Integer>> result = new HashMap<>();

        for (Car car : cars) {
            List<Integer> kmList = result.get(car.getName());
            if (kmList == null) {
                kmList = new ArrayList<>();
                result.put(car.getName(), kmList);
            }
            kmList.add(car.getKm());

        }
        return result;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Map<KmRange, List<Car>> mapKmRangeToCars() {
        Map<KmRange, List<Car>> result = new HashMap<>();


        for (Car car : cars) {

            List<Car> listOfRange = result.get(car.getKmRange());
            if (listOfRange == null) {
                listOfRange = new ArrayList<>();
                result.put(car.getKmRange(), listOfRange);
            }
            listOfRange.add(car);

        }
        return result;
    }

    public Map<PriceRange, List<Car>> mapPriceRangeToCars() {
        Map<PriceRange, List<Car>> result = new HashMap<>();

        for (Car car : cars) {
            List<Car> listOfRange = result.get(car.getPriceRange());

            if (listOfRange == null) {
                listOfRange = new ArrayList<>();
                result.put(car.getPriceRange(), listOfRange);
            }
            listOfRange.add(car);
        }
        return result;
    }
}
