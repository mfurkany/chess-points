package Pieces;

import Board.Square;
import java.util.ArrayList;

public class Knight extends Piece {

    final int KNIGHT_POINT = 3;

    public Knight(boolean white) {
        super(white);
    }

    @Override
    public void setPoint(){
        if(this.getIsOnThreat())
            this.point = (float)KNIGHT_POINT / 2;
        else
            this.point = KNIGHT_POINT;
    }

    @Override
    public ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y) {

        possibleSquares.clear();

        //all possible moves for a knight
        int[] candidateX = {x+1, x+1, x+2, x+2, x-1, x-1, x-2, x-2};
        int[] candidateY = {y-2, y+2, y-1, y+1, y-2, y+2, y-1, y+1};

        for(int i = 0; i < 8; i++)
            if((candidateX[i] >= 0 && candidateX[i] < 8 && candidateY[i] >= 0 && candidateY[i] < 8))   //check if possible move destinations are not outside the board
                if((squares[candidateX[i]][candidateY[i]].getPiece() == null || squares[candidateX[i]][candidateY[i]].getPiece().getIsWhite() != this.getIsWhite()))
                {
                    possibleSquares.add(squares[candidateX[i]][candidateY[i]]);
                }
        return possibleSquares;
    }
}
