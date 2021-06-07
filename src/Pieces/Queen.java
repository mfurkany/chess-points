package Pieces;

import Board.Square;
import java.util.ArrayList;

public class Queen extends Piece {

    final int QUEEN_POINT = 9;

    public Queen(boolean white) {
        super(white);
    }

    @Override
    public void setPoint(){
        if(this.getIsOnThreat())
            this.point = (float)QUEEN_POINT / 2;
        else
            this.point = QUEEN_POINT;
    }

    @Override
    public ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y) {
        return null;
    }

}
