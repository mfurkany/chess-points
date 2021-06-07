# About
Calculate black and white's points from state of the chessboard.

## Point Calculation Algorithm
  * Check if a piece is under threat from opponent's piece or pieces.
  * If a piece is not under threat, it gets the full point shown in the table.
  * If a piece is under threat, it gets the half the point shown in the table.

| Piece | Abbrevation | Point |
| --- | --- | --- |
| Pawn | p | 1 |
| Knight | a | 3 |
| Bishop | f | 3 |
| Rook | k | 5 |
| Queen | v | 9 |
| King | s | 100 |

### Example

    8             ♜               ♚
    7     ♟  ♖               ♝    
    6  ♟                      ♙  ♟
    5             ♗  
    4             ♞   ♙
    3     ♙      ♔
    2  ♙              ♘  ♛  
    1                              ♖
       a   b   c   d   e   f   g   h 
       
White's = (1 * 0.5) + (3 * 1) + (2 * 5) + (1 * 1.5) + (1 * 3) + (1 * 100) = 118  
Black's = (1 * 0.5) + (2 * 1) + (1 * 5) + (1 * 1.5) + (1 * 3) + (1 * 9) + (1 * 100) = 121  

## Compile and Run Project From Command Line
1. `cd` into the project's root directory.
2. Run `javac -d classes src/Board/*.java src/Pieces/*.java src/Game.java` command.
3. Run `java -cp classes Game` command.

## Input Format
* Input format is .txt files as shown below
```
xx xx xx ks xx xx xx ss
xx ps kb xx xx xx fs xx
ps xx xx xx xx xx pb ps
xx xx xx fb xx xx xx xx
xx xx xx as pb xx xx xx
xx pb xx sb xx xx xx xx
pb xx xx xx ab vs xx xx
xx xx xx xx xx xx xx kb
```
* First letter shows the piece's type and second letter shows piece's color.


