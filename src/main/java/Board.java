public class Board {

        private Piece[][] squares = new Piece[8][8];
        private Player currentPlayer = Player.WHITE; // Beyaz oyuncuyla başla
        private boolean gameOver = false;

        public void initializeBoard() {
            // Taşları yerleştirme işlemi
        }

        public boolean isValidMove(Move move) {
            // Hamle geçerli mi kontrolü
            return false;
        }

        public void makeMove(Move move) {
            // Taşları hareket ettirme işlemi
            // Şah mat kontrolü
            // Oyun sonu kontrolü
            // Oyuncu sırasını değiştirme
        }

        public boolean isGameOver() {
            return gameOver;
        }

        public Player getWinner() {
            // Kazananı belirleme
            return null;
        }

        public Player getCurrentPlayer() {
            return currentPlayer;
        }

        public void switchCurrentPlayer() {
            currentPlayer = (currentPlayer == Player.WHITE) ? Player.BLACK : Player.WHITE;
        }

        public void printBoard() {
            // Tahtayı yazdırma
        }

    public Piece getPieceAtSquare(Square square) {
        // Karedeki taşı getir
        return null;
    }
    }

