package lab3.t5;

public class Chocolate implements Comparable<Chocolate> {
    double weight;
    String name;
    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }

    @Override
    public int compareTo(Chocolate o) {
        return Double.compare(this.weight, o.weight);
    }
}
