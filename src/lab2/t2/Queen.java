package lab2.t2;

public class Queen extends Piece {
    public Queen (Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.x == b.x && a.y == b.y)) {
            return false;
        }
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return (a.x == b.x || a.y == b.y) || Math.abs(dx) == Math.abs(dy);
    }

    @Override
    public String getPos() {
        return "Queen at" + a.toString();
    }
}