package OOD.TictacToe.Repository;


import OOD.TictacToe.entities.Board;
import OOD.TictacToe.entities.Piece;

public class TicTacToeImpl implements TicTacToeDao{
    
    private final Board board;

    private static TicTacToeImpl ticTacToeDao;

    private TicTacToeImpl(){
        this.board=new Board();
    }

    @Override
    public boolean addPiece(Piece piece, Integer row, Integer col) {
        return board.addPieceOnBoard(piece, row, col);
    }

    @Override
    public Board getBoard() {
        return board;
    }

    public static TicTacToeDao getInstance() {
        if (ticTacToeDao == null) {
            ticTacToeDao = new TicTacToeImpl();
        }
        return ticTacToeDao;
    }

}
