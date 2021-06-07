package Pieces;

import Board.*;
import java.util.ArrayList;

public abstract class Piece {

    private boolean isWhite;
    private boolean isOnThreat;
    protected float point;  //accessible from child classes
    public ArrayList<Square> possibleSquares = new ArrayList<>();

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
        this.isOnThreat = false;
        this.setPoint();
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean getIsWhite(){
        return this.isWhite;
    }

    public void setIsOnThreat(boolean OnThreat){
        this.isOnThreat = OnThreat;
    }

    public boolean getIsOnThreat(){
        return this.isOnThreat;
    }

    public void setPoint(){
        this.point = point;
    }

    public float getPoint() {
        return this.point;
    }

    public abstract ArrayList<Square> getPossibleSquares(Square[][] squares, int x, int y);

}
