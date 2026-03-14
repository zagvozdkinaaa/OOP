package lab2.t2;

public abstract class Piece {
    Position a;
    public Piece(Position a) {
        this.a = a;
    }
    public abstract boolean isLegalMove(Position b);

    public void move(Position b) {
        if (isLegalMove(b)) {
            this.a = b;
        } else  {
            System.out.println("[!] Illegal move");
        }
    }

    public abstract String getPos();
}