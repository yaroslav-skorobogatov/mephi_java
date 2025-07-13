package pckg.lesson8.generics;

import pckg.lesson8.generics.car.Bolid;
import pckg.lesson8.generics.car.Car;
import pckg.lesson8.generics.car.Taxi;

public class Main {
    public static void main(String[] args) {
        TaxiDriver<Taxi> taxiDriver = new TaxiDriver<>("taxi_dr_name");
        taxiDriver.setCar(new Taxi());

        Racer<Bolid> racer = new Racer<>("racer_name");
        racer.setCar(new Bolid());
        //<> - diamond

//        TaxiDriver<Bolid> taxiDriver1 = new TaxiDriver<>("taxi_dr_name"); // уже ограничили параметр класса, тпоэтому ошибка
//        taxiDriver1.setCar(new Taxi());

        //wildcard
        Racer<? extends Car> racer2 = new Racer<>("racer_name"); // все что ниже этого класса, тоесть наследники
        //Racer<? super Car> racer2 = new Racer<>("racer_name");// все что выше этого класса, тоесть родители
        //Racer<?> racer2 = new Racer<>("racer_name"); // все

        printHorsepower(taxiDriver);
        printHorsepower(racer);

        // String[] Object[] // ковариантность- String[] явлется подтипом  Object[]
        //
        // A - подтип B
        //CustomArray<A> CustomArray<B> // иновариантность - CustomArray<A> не является подтипом CustomArray<B>
    }

    public static <T extends Car> void printHorsepower(CarHolder<T> carHolder) {
        System.out.println(carHolder.getCar().getHorsepower());
    }

}
