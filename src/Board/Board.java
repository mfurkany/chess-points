package Board;

import Pieces.*;
import java.io.*;
import java.util.Scanner;

public class Board {

    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        try {
            buildBoardFromTxt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Square[][] getSquares() {
        return squares;
    }

    public void buildBoardFromTxt() throws Exception {
        File file = new File(System.getProperty("user.dir") + "\\ExampleBoards\\board1.txt");
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 8; i++) {   //rows
            for (int j = 0; j < 8; j++) {   //columns
                String pieceCode = scanner.next();  //pieceCode examples : xx-ks-vs-pb-as
                if (!pieceCode.equals("xx")) {  //if piece is not null
                    switch (pieceCode.charAt(0)) {
                        case ('p'):
                            if (pieceCode.charAt(1) == 'b') {   //if white
                                squares[i][j] = new Square(i, j, new Pawn(true));
                            } else {
                                squares[i][j] = new Square(i, j, new Pawn(false));
                            }
                            break;
                        case ('a'):
                            if (pieceCode.charAt(1) == 'b') {
                                squares[i][j] = new Square(i, j, new Knight(true));
                            } else {
                                squares[i][j] = new Square(i, j, new Knight(false));
                            }
                            break;
                        case ('f'):
                            if (pieceCode.charAt(1) == 'b') {
                                squares[i][j] = new Square(i, j, new Bishop(true));
                            } else {
                                squares[i][j] = new Square(i, j, new Bishop(false));
                            }
                            break;
                        case ('k'):
                            if (pieceCode.charAt(1) == 'b') {
                                squares[i][j] = new Square(i, j, new Rook(true));
                            } else {
                                squares[i][j] = new Square(i, j, new Rook(false));
                            }
                            break;
                        case ('v'):
                            if (pieceCode.charAt(1) == 'b') {
                                squares[i][j] = new Square(i, j, new Queen(true));
                            } else {
                                squares[i][j] = new Square(i, j, new Queen(false));
                            }
                            break;
                        case ('s'):
                            if (pieceCode.charAt(1) == 'b') {
                                squares[i][j] = new Square(i, j, new King(true));
                            } else {
                                squares[i][j] = new Square(i, j, new King(false));
                            }
                            break;
                    }
                }
                else {
                    squares[i][j] = new Square(i, j, null);
                }
            }
        }
    }

    public void printBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(squares[i][j].getPiece() != null)
                    System.out.print(squares[i][j].getPiece() + "-" + squares[i][j].getPiece().getIsWhite() + " ");
                else
                    System.out.print(squares[i][j].getPiece() + " ");
            }
            System.out.println();
        }
    }

}
