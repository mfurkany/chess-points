import Board.*;

import java.util.ArrayList;

public class Game {

    public Board board;

    public Game(){
        board = new Board();
        Square[][] squares= board.getSquares();
        board.printBoard();
        findThreatenedSquares(squares);
        printPoints(squares);
    }

    private void findThreatenedSquares(Square[][] squares) {

        ArrayList<Square> allPossibleSquares;
        for (int i = 0; i < 8; i++) {   //rows
            for (int j = 0; j < 8; j++) {   //columns
                if (squares[i][j].getPiece() != null) {   //if current square is not null
                    allPossibleSquares = squares[i][j].getPiece().getPossibleSquares(squares, i, j);   //all possible next squares of current piece
                    if (allPossibleSquares != null) {   //only bishop and knight's moves are defined
                        updateThreatenedPieces(squares, allPossibleSquares);
                    }
                }
            }
        }
    }

    private void updateThreatenedPieces(Square[][] squares, ArrayList<Square> possibleSquares){

        for (Square s : possibleSquares) {   //iterate through possible next squares
            if (squares[s.getX()][s.getY()].getPiece() != null) {   //if an opponent piece is present on the square
                squares[s.getX()][s.getY()].getPiece().setIsOnThreat(true);   //set threatened piece OnThreat
                squares[s.getX()][s.getY()].getPiece().setPoint();   //update threatened piece's point
            }
        }
    }

    public void printPoints(Square[][] squares){
        float blackPoints = 0, whitePoints = 0;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                if (squares[i][j].getPiece() != null) {
                    if (!squares[i][j].getPiece().getIsWhite()) {
                        blackPoints += squares[i][j].getPiece().getPoint();
                    } else {
                        whitePoints += squares[i][j].getPiece().getPoint(); }
                }
            }
        }
        System.out.println("black: " + blackPoints + " - white: " + whitePoints);
    }

    public static void main(String[] args){
        Game game = new Game();
    }
}
