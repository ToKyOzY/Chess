import java.util.Scanner;

public class ChessGame {


    public static void main(String[] args) {
        Board board = new Board();
        board.initializeBoard();

        Scanner scanner = new Scanner(System.in);

        // Oyun döngüsü
        while (!board.isGameOver()) {
            board.printBoard();

            // Sıra hangi oyuncuda ise onun hamlesi alınır
            Player currentPlayer = board.getCurrentPlayer();
            System.out.println("Sıra " + currentPlayer.getName() + " (" + currentPlayer.getColor() + ") oyuncusunda.");

            Move move = null;
            boolean validMove = false;

            while (!validMove) {
                move = getPlayerMove(scanner, board);
                validMove = board.isValidMove(move);

                if (!validMove) {
                    System.out.println("Geçersiz hamle. Tekrar deneyin.");
                }
            }

            board.makeMove(move);
        }

        // Oyun bittiğinde sonucu görüntüle
        board.printBoard();
        System.out.println("Oyun bitti. Kazanan: " + board.getWinner().getName());

        scanner.close();
    }

    public static Move getPlayerMove(Scanner scanner, Board board) {
        System.out.print("Başlangıç karesi (örn: a2): ");
        String startInput = scanner.next();

        System.out.print("Bitiş karesi (örn: a4): ");
        String endInput = scanner.next();

        Square startSquare = new Square(startInput);
        Square endSquare = new Square(endInput);

        return new Move(startSquare, endSquare, board.getPieceAtSquare(startSquare));
    }
}
