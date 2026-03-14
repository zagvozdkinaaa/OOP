package lab2.t2;

public class Knight extends Piece {
    public Knight(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.x == b.x && a.y == b.y)) {
            return false;
        }
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }

    @Override
    public String getPos() {
        return "Knight at" + a.toString();
    }
}
