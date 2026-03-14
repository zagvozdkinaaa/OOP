package lab2.t1c;

import java.util.Objects;

public class Device {
    private String brand;
    private double price;

    Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device[brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return brand.equals(device.brand) && price == device.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

}
