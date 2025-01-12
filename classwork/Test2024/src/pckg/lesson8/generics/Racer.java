package pckg.lesson8.generics;

import pckg.lesson8.generics.car.RaceCar;
import pckg.lesson8.generics.car.Taxi;

public class Racer<T extends RaceCar> extends CarHolder<T> {


    public Racer(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        System.out.println("driving race car");
    }
}
