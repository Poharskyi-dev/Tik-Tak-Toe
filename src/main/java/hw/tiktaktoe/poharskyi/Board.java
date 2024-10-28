package hw.tiktaktoe.poharskyi;

public class Board {

    private final int rowCount;
    private final int colCount;
    private final char[][] board;

    public Board(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;

        this.board = new char[rowCount][colCount];
    }

    public void initBoard(){

        for (int rowInd = 0; rowInd < rowCount; rowInd++) {
            for (int colInd = 0; colInd < colCount; colInd++) {
                board[rowInd][colInd] = ' ';
            }
        }
    }

    public void setX(int rowCount, int colCount){
        board[rowCount - 1][colCount - 1] = 'X';
    }

    public void setO(int rowCount, int colCount){
        board[rowCount - 1][colCount - 1] = 'O';
    }

    private boolean isLastCol(int colInd){
        return colInd == colCount - 1;
    }

    private boolean isLastRow(int rowInd){
        return rowInd == rowCount - 1;
    }

    public void boardDrawing() {
        for (int rowInd = 0; rowInd < board.length; rowInd++) {
            // 1st row inside line
            // if not last - draw!
            for (int colInd = 0; colInd < board[rowInd].length; colInd++) {
                char cell = board[rowInd][colInd];
                switch (cell) {
                    case 'X' -> {
                        if (!isLastCol(colInd)) {
                        System.out.print(" \\/ #");
                    } else {
                            System.out.print(" \\/  ");
                        }
                        }
                    case 'O' -> {
                        if (!isLastCol(colInd)) {
                            System.out.print(" ◜◝#");
                        } else {
                            System.out.print(" ◜◝ ");
                        }
                    }
                    default -> {
                        if (!isLastCol(colInd)) {
                            System.out.print("    #");
                        } else {
                            continue;
                        }
                    }
                }
            }
            // new line after draw
            System.out.println();
            // 2nd row inside line
            // if not last - draw!
            for (int colInd = 0; colInd < board[rowInd].length; colInd++) {
                char cell = board[rowInd][colInd];

                    switch (cell) {
                        case 'X' -> {
                            if (!isLastCol(colInd)) {
                                System.out.print(" /\\ #");
                            } else {
                                System.out.print(" /\\  ");
                            }
                        }
                        case 'O' -> {
                            if (!isLastCol(colInd)) {
                                System.out.print(" ◟◞#");
                            } else {
                                System.out.print(" ◟◞ ");
                            }
                        }
                        default -> {
                            if (!isLastCol(colInd)) {
                                System.out.print("    #");
                            } else {
                                continue;
                            }
                        }
                    }
            }
            // new line after draw
            System.out.println();
            // 3rd row inside line
            // if not last - draw!
            if (rowInd < board[rowInd].length - 1) {
                for (int colInd = 0; colInd < board[rowInd].length; colInd++) {
                    System.out.print("#####");
                }
            }
            // new line after draw
            System.out.println();
        }
    }
}
