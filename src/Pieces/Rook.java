package Pieces;

import Board.Square;
import java.util.ArrayList;

public class Rook extends Piece {

    final int ROOK_POINT = 5;

    public Rook(boolean white) {
        super(white);
    }

    @Override
    public void setPoint(){
        if(this.getIsOnThreat())
            this.point = (float)ROOK_POINT / 2;
        else
            this.point = ROOK_POINT;
    }

    @Override
    public ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y) {
        return null;
    }
}
