package Pieces;

import Board.Square;
import java.util.ArrayList;

public class Pawn extends Piece {

    final int PAWN_POINT = 1;

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public void setPoint(){
        if(this.getIsOnThreat())
            this.point = (float)PAWN_POINT / 2;
        else
            this.point = PAWN_POINT;
    }

    @Override
    public ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y) {
        return null;
    }

}
