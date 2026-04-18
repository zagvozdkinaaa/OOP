package lab3.t1;

public abstract class Transport {
    private String model;
    private int maxSpeed;

    public Transport(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void startEngine() {
        System.out.println("Engine started");
    }

    public abstract void move();
}
