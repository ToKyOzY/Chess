public class Move {
    private Square startSquare;
    private Square endSquare;
    private Piece pieceMoved;

    public Move(Square start, Square end, Piece piece) {
        this.startSquare = start;
        this.endSquare = end;
        this.pieceMoved = piece;
    }

    public Square getStartSquare() {
        return startSquare;
    }

    public Square getEndSquare() {
        return endSquare;
    }
// Getter metotları
}
