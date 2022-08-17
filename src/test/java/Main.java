import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = Generator.generateAllNeededData();
        Car.printAllCarData(Car.FindCarWithTrunkOverX(cars, 1500, "BMW"));
    }
}
