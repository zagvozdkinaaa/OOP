package lab2.t2;

public class Bishop extends Piece {
    public Bishop(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.x == b.x && a.y == b.y)) {
            return false;
        }
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return Math.abs(dx) == Math.abs(dy);
    }

    @Override
    public String getPos() {
        return "Bishop at" + a.toString();
    }
}
