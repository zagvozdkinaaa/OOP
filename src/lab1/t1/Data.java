package lab1.t1;

public class Data {
    private double max;
    private double sum;
    private int count;

    public Data() {
        this.max = Double.MAX_VALUE;
        this.sum = 0;
        this.count = 0;
    }

    public void add(double value) {
        if (count ==0 || value > max) {
            max = value;
        }
        sum += value;
        count++;
    }
    public double getAvg() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    public double getMax() {
        if (count == 0) {
            return 0;
        }
        return max;
    }
}
