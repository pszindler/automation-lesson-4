import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static ArrayList<Car> generateAllNeededData() {
        Producer bmwX1 = new Producer("BMW", "X1");
        Producer audi80 = new Producer("AUDI", "80");
        Producer opelAstra = new Producer("OPEL", "Astra");
        Producer fordFusion = new Producer("FORD", "Fusion");
        Producer bwX5 = new Producer("BMW", "X5");

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country nederland = new Country("Nederland", 'N');
        Country china = new Country("China", 'C');
        Country korea = new Country("Korea", 'K');
        Country france = new Country("France", 'F');
        Country czech = new Country("Czech", 'H');
        Country slovakia = new Country("Slovakia", 'S');
        Country ukraine = new Country("Ukraine", 'U');

        List<Country> countryListEurope = new ArrayList<>();
        countryListEurope.add(poland);
        countryListEurope.add(germany);
        countryListEurope.add(nederland);

        List<Country> countryListAsia = new ArrayList<>();
        countryListAsia.add(china);
        countryListAsia.add(korea);

        List<Country> countryListBus = new ArrayList<>();
        countryListBus.add(china);
        countryListBus.add(korea);

        List<Country> countryListBusiness = new ArrayList<>();
        countryListBusiness.add(france);
        countryListBusiness.add(czech);

        List<Country> countryListHeavy = new ArrayList<>();
        countryListHeavy.add(slovakia);
        countryListHeavy.add(ukraine);

        Dimension tc310 = new Dimension(80, 155, 310);
        Dimension tc550 = new Dimension(75, 155, 550);
        Dimension tc160 = new Dimension(75, 165, 160);
        Dimension tc340 = new Dimension(62, 125, 340);
        Dimension tc220 = new Dimension(72, 115, 220);
        Dimension tc245 = new Dimension(72, 115, 245);
        Dimension tc305 = new Dimension(75, 125, 305);
        Dimension tc315 = new Dimension(70, 145, 315);
        Dimension tc320 = new Dimension(60, 155, 320);
        Dimension tc400 = new Dimension(60, 155, 400);
        Dimension tc800 = new Dimension(100, 242, 800);
        Dimension tc1000 = new Dimension(124, 250, 1000);

        ArrayList<Dimension> trunkCapacityUnder245 = new ArrayList<>();
        trunkCapacityUnder245.add(tc245);
        trunkCapacityUnder245.add(tc220);
        trunkCapacityUnder245.add(tc160);

        ArrayList<Dimension> trunkCapacityBigSize = new ArrayList<>();
        trunkCapacityBigSize.add(tc550);
        trunkCapacityBigSize.add(tc400);
        trunkCapacityBigSize.add(tc340);

        ArrayList<Dimension> trunkCapacityNormalSize = new ArrayList<>();
        trunkCapacityNormalSize.add(tc310);
        trunkCapacityNormalSize.add(tc305);

        ArrayList<Dimension> trunkCapacityOtherSize = new ArrayList<>();
        trunkCapacityOtherSize.add(tc315);
        trunkCapacityOtherSize.add(tc320);

        ArrayList<Dimension> trunkCapacityVeryBigSize = new ArrayList<>();
        trunkCapacityVeryBigSize.add(tc800);
        trunkCapacityVeryBigSize.add(tc1000);

        Market cargo = new Market("cargo", countryListEurope);
        Market taxi = new Market("taxi", countryListAsia);
        Market bus = new Market("bus", countryListBus);
        Market business = new Market("business", countryListBusiness);
        Market heavy = new Market("heavy", countryListHeavy);

        Car bmwX1_no1 = new Car(bmwX1, true, cargo, Segment.PREMIUM, trunkCapacityOtherSize);
        Car bmwX1_no2 = new Car(bmwX1, false, taxi, Segment.MEDIUM, trunkCapacityNormalSize);
        Car bmwX1_no3 = new Car(bmwX1, true, bus, Segment.PREMIUM, trunkCapacityBigSize);
        Car bmwX1_no4 = new Car(bmwX1, false, cargo, Segment.MEDIUM, trunkCapacityOtherSize);
        Car bmwX1_no5 = new Car(bmwX1, true, heavy, Segment.STANDARD, trunkCapacityNormalSize);
        Car audi80_no1 = new Car(audi80, false, business, Segment.PREMIUM, trunkCapacityUnder245);
        Car audi80_no2 = new Car(audi80, true, cargo, Segment.STANDARD, trunkCapacityOtherSize);
        Car audi80_no3 = new Car(audi80, false, taxi, Segment.MEDIUM, trunkCapacityNormalSize);
        Car opelAstra_no1 = new Car(opelAstra, true, business, Segment.PREMIUM, trunkCapacityUnder245);
        Car opelAstra_no2 = new Car(opelAstra, false, cargo, Segment.MEDIUM, trunkCapacityOtherSize);
        Car opelAstra_no3 = new Car(opelAstra, true, heavy, Segment.STANDARD, trunkCapacityVeryBigSize);
        Car fordFusion_no1 = new Car(fordFusion, false, cargo, Segment.PREMIUM, trunkCapacityBigSize);
        Car fordFusion_no2 = new Car(fordFusion, true, taxi, Segment.STANDARD, trunkCapacityNormalSize);
        Car bmwX5_no1 = new Car(bwX5, false, heavy, Segment.PREMIUM, trunkCapacityVeryBigSize);
        Car bmwX5_no2 = new Car(bwX5, true, business, Segment.STANDARD, trunkCapacityNormalSize);

        ArrayList<Car> allCars = new ArrayList<>();
        allCars.add(bmwX1_no1);
        allCars.add(bmwX1_no2);
        allCars.add(bmwX1_no3);
        allCars.add(bmwX1_no4);
        allCars.add(bmwX1_no5);
        allCars.add(audi80_no1);
        allCars.add(audi80_no2);
        allCars.add(audi80_no3);
        allCars.add(opelAstra_no1);
        allCars.add(opelAstra_no2);
        allCars.add(opelAstra_no3);
        allCars.add(fordFusion_no1);
        allCars.add(fordFusion_no2);
        allCars.add(bmwX5_no1);
        allCars.add(bmwX5_no2);

        return allCars;
    }
}
