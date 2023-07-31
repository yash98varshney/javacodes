package OOD.TictacToe.entities;

public class Piece {
    
    private PieceType pieceType;

    public Piece(PieceType peiceType){
        this.pieceType=pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    @Override
    public String toString(){
        return "Piece{"+"peiceType="+ pieceType + '}';
    }

    
}
