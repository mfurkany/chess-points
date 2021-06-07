package Pieces;

import Board.Square;
import java.util.ArrayList;

public class King extends Piece {

    final int KING_POINT = 100;

    public King(boolean white) {
        super(white);
    }

    @Override
    public void setPoint(){
        if(this.getIsOnThreat())
            this.point = (float)KING_POINT / 2;
        else
            this.point = KING_POINT;
    }

    @Override
    public ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y) {
        return null;
    }
}
