package pckg.lesson8.generics;

public abstract class CarHolder<T> {
    private String name;
    private T car;

    public CarHolder(String name) {
        this.name = name;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public T getCar() {
        return car;
    }

    public abstract void driveCar();
}
