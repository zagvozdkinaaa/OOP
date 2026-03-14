package lab2.t2;

public class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValid() {
        return x >= 0 && x <= 7 && y >= 0 && y <= 7;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
