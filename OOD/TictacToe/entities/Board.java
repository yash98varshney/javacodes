package OOD.TictacToe.entities;

public class Board {
    private Integer size;   // size of the board
    private final Piece[][] board;   // Board is of type Piece because all the entries on the board are of type Piece we put Piece on the board

    public Board(){
        this.size=3;
        this.board=new Piece[size][size];
    }

    public Integer getSize() {
        return size;
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean addPieceOnBoard(Piece piece , Integer row,Integer col){    // We have deligate the functionaliy of checking and putting piece on the board to Board itself
        if(board[row][col] !=null){
            return false;
        }
        board[row][col]=piece;
        return true;
    }

    

}
