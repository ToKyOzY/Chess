public class Move {
    private Square startSquare;
    private Square endSquare;

    public Move(Square start, Square end) {
        this.startSquare = start;
        this.endSquare = end;
    }

    public Square getStartSquare() {
        return startSquare;
    }

    public Square getEndSquare() {
        return endSquare;
    }
// Getter metotları
}
