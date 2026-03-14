package lab2.t2;

public class Rook extends Piece {
    public Rook(Position a) {
        super(a);
    }
    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.x == b.x && a.y == b.y)) {
            return false;
        }
        return (this.a.x == b.x || this.a.y == b.y);
    }

    @Override
    public String getPos() {
        return "Rook at" + a.toString();
    }

}
