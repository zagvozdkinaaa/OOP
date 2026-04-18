package lab3.t1;

public class Car extends Transport implements Refuelable {
    int year;

    public Car(String model, int maxSpeed, int year) {
        super(model, maxSpeed);
        this.year = year;
    }

    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }

    @Override
    public void refuel() {
        System.out.println("Filling the car tank with gasoline");
    }
}
