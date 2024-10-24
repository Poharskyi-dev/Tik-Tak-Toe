package hw.tiktaktoe.poharskyi;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // create array
        String[][] board = new String[5][5]; // FOR SCAN

        // empty cell fill
        for (int rowInd = 0; rowInd < board.length; rowInd++) {
            for (int colInd = 0; colInd < board[rowInd].length; colInd++) {
                board[rowInd][colInd] = " ";
            }
        }

        // temp for test
        board[0][0] = "00";
        board[0][1] = "01";
        board[0][2] = "02";
        board[1][0] = "10";
        board[1][1] = "11";
        board[1][2] = "12";
        board[2][0] = "20";
        board[2][1] = "21";
        board[2][2] = "22";

        // MESH CREATING
        // row loop
        for (int rowInd = 0; rowInd < board.length; rowInd++) {
            // 1st row inside line
            // if not last - draw!
            for (int colInd = 0; colInd < board[rowInd].length; colInd++) {
                if (colInd < board[colInd].length - 1) {
                    System.out.print("    #");
                }
            }
            // new line after draw
            System.out.println();
            // 2nd row inside line
            // if not last - draw!
            for (int colInd = 0; colInd < board[rowInd].length; colInd++) {
                if (colInd < board[colInd].length - 1) {
                    System.out.print("    #");
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
// ◜◝
// ◟◞

// \/
// /\


//    #     #
//  X #     #
//###############
//    #     #
//    #     #
//###############
//    #     #
//    #     #






