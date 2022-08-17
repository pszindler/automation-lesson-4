import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Car {
    private final Producer producer;
    private final boolean isAutomaticGear;
    private final Market market;
    private final String segment;
    private final ArrayList<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, Segment segment, ArrayList<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = String.valueOf(segment);
        this.dimensions = dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return "Car Market: " + getMarket().countryList()
                .stream()
                .map(country -> country.countryName() + " - " + country.countrySign())
                .collect(Collectors.joining(", ", "(", ")"));
    }

    public static void printAllCarData(List<Car> cars) {
        if (cars.isEmpty()) {
            System.out.println("No data");
        }
        for (Object car : cars) {
            System.out.println(car);
        }
    }

    public static List<Car> FindCarWithTrunkOverX(ArrayList<Car> allCars, int trunkCapacity, String carManufacturer) {
        Predicate<Car> isProducerX = p -> p.getProducer().getModel().equals(carManufacturer);
        Predicate<Car> isTrunkCapacityOverX = d -> d.getDimensions()
                .stream()
                .anyMatch(t -> t.getTrunkCapacity() > trunkCapacity);
        return allCars.stream()
                .filter(isProducerX)
                .filter(Car::isAutomaticGear)
                .filter(isTrunkCapacityOverX)
                .collect(Collectors.toList());
    }
}
