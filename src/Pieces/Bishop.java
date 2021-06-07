package Pieces;

import Board.Square;
import java.util.ArrayList;

public class Bishop extends Piece {

    final int BISHOP_POINT = 3;

    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public void setPoint(){
        if(this.getIsOnThreat())
            this.point = (float)BISHOP_POINT / 2;
        else
            this.point = BISHOP_POINT;
    }

    @Override
    public ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y) {

        possibleSquares.clear();
        int candidateX = x+1, candidateY = y-1;   //candidate coordinates for possible south-west move
        while(candidateX < 8 && candidateY >= 0)   //while coordinates are valid
        {
            if(squares[candidateX][candidateY].getPiece()==null)   //if square is empty
            {
                possibleSquares.add(squares[candidateX][candidateY]);   //add candidate square to possible squares list
            }
            else if(squares[candidateX][candidateY].getPiece().getIsWhite()==this.getIsWhite())   //if candidate square contains a same color piece
                break;
            else   //if opposite color piece is  present
            {
                possibleSquares.add(squares[candidateX][candidateY]);
                break;
            }
            candidateX++;
            candidateY--;
        }

        candidateX = x+1; candidateY = y+1;   ////candidate coordinates for possible south-east move
        while(candidateX < 8 && candidateY < 8)
        {
            if(squares[candidateX][candidateY].getPiece()==null)
                possibleSquares.add(squares[candidateX][candidateY]);
            else if(squares[candidateX][candidateY].getPiece().getIsWhite()==this.getIsWhite())
                break;
            else
            {
                possibleSquares.add(squares[candidateX][candidateY]);
                break;
            }
            candidateX++;
            candidateY++;
        }

        candidateX = x-1; candidateY = y+1;   //candidate coordinates for possible north-east move
        while(candidateX >= 0 && candidateY < 8)
        {
            if(squares[candidateX][candidateY].getPiece()==null)
                possibleSquares.add(squares[candidateX][candidateY]);
            else if(squares[candidateX][candidateY].getPiece().getIsWhite()==this.getIsWhite())
                break;
            else
            {
                possibleSquares.add(squares[candidateX][candidateY]);
                break;
            }
            candidateX--;
            candidateY++;
        }

        candidateX = x-1; candidateY = y-1;   //candidate coordinates for possible north-west move
        while(candidateX >= 0 && candidateY >= 0)
        {
            if(squares[candidateX][candidateY].getPiece()==null)
                possibleSquares.add(squares[candidateX][candidateY]);
            else if(squares[candidateX][candidateY].getPiece().getIsWhite()==this.getIsWhite())
                break;
            else
            {
                possibleSquares.add(squares[candidateX][candidateY]);
                break;
            }
            candidateX--;
            candidateY--;
        }

        return possibleSquares;
    }
}
