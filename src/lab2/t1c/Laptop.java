package lab2.t1c;

import java.util.Objects;

public class Laptop extends Device {
    private String model;
    private int ram;
    private String os;

    public Laptop(String brand, double price, String model, int ram, String os) {
        super(brand, price);
        this.model = model;
        this.ram = ram;
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return model.equals(laptop.model) && ram == laptop.ram && os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, ram, os);
    }

    @Override
    public String toString() {
        return "Laptop[Brand: " + super.getBrand() + ", Price: " + super.getPrice() + ", Model: " + model + ", Ram: " + ram + ", OS: " + os + "]";
    }
}
