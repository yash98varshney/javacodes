package OOD.TictacToe.Repository;


import OOD.TictacToe.entities.Board;
import OOD.TictacToe.entities.Piece;

public interface TicTacToeDao {
    
    boolean addPiece(Piece piece,Integer row,Integer col);
    Board getBoard();
}
