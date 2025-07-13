package pckg.lesson8.generics;

import pckg.lesson8.generics.car.Taxi;

public class TaxiDriver<T extends Taxi> extends CarHolder<T> {


    public TaxiDriver(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        System.out.println("driving taxi");
    }
}
