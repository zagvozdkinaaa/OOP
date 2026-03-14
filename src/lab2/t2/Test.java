package lab2.t2;

public class Test {
    public static void main(String[] args) {
        Position kingPos = new Position(0,3);
        Position queenPos = new Position(0,4);
        Position rookPos = new Position(0,0);
        Position knightPos = new Position(0,1);
        Position bishopPos = new Position(0,2);
        Position pawnPos = new Position(1,1);

        Bishop bishop = new Bishop(bishopPos);
        Knight knight = new Knight(knightPos);
        Rook rook = new Rook(rookPos);
        Queen queen = new Queen(queenPos);
        King king = new King(kingPos);
        Pawn pawn = new Pawn(pawnPos, Color.WHITE);


        System.out.println(bishop.getPos());
        System.out.println(rook.getPos());
        System.out.println(knight.getPos());
        System.out.println(pawn.getPos());
        System.out.println(king.getPos());
        System.out.println(pawn.getPos());
        System.out.println(queen.getPos());

        Position newPos = new Position(2,2);
        System.out.println(knight.isLegalMove(newPos));
        knight.move(newPos);
        System.out.println(knight.getPos());
    }
}
