package lab2.t2;

public class Pawn extends Piece {
    private Color color;

    public Pawn(Position a,  Color color) {
        super(a);
        this.color = color;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.x == b.x && a.y == b.y)) {
            return false;
        }
        int dx = b.x - a.x;
        int dy = b.y - a.y;

        int direction = (color == Color.WHITE) ? 1 : -1;
        int startRow = (color == Color.WHITE) ? 1 : 6;

        if (dx == 0 && dy == direction) {
            return true;
        }
        if (dx == 0 && a.y == startRow && dy == 2 * direction) {
            return true;
        }
        return false;
    }

    @Override
    public String getPos() {
        return "Pawn at" + a.toString();
    }
}
