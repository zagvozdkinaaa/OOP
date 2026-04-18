package lab3.t1;

public class Plane extends Transport implements Flyable, Refuelable{
    private int passengers;

    public Plane(String model, int maxSpeed, int passengers) {
        super(model, maxSpeed);
        this.passengers = passengers;
    }
    @Override
    public void move() {
        System.out.println("Plane is moving");
    }
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
    @Override
    public void refuel() {
        System.out.println("Plane is refueling");
    }
}
