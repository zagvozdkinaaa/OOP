package lab2.t2;

public class King extends Piece {
    public King(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.x == b.x && a.y == b.y)) {
            return false;
        }
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return dx <= 1 && dy <= 1;
    }

    @Override
    public String getPos() {
        return "King at" + a.toString();
    }
}
