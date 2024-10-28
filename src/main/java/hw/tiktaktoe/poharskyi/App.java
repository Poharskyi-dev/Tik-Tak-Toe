package hw.tiktaktoe.poharskyi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Grid size input
        System.out.print("Please enter row quantity of the grid: ");
        int rowCount = input.nextInt();
        input.nextLine();
        System.out.println();
        System.out.print("Please enter columns quantity of the grid: ");
        int colCount = input.nextInt();
        input.nextLine();
        System.out.println();

        // Player names input
        System.out.print("Please enter Player 1 name: ");
        String playerName01 = input.nextLine();
        System.out.println();

        // Type char var init
        char playerType01;
        char playerType02;

        // Name and Type questions for P1
        do {
            System.out.print("Please enter Player 1 symbol (X or Y): ");
            playerType01 = input.nextLine().toUpperCase().charAt(0);
        } while (Player.isNotValidSymbol(playerType01));

        if (playerType01 == 'X') {
            playerType02 = 'O';

        } else {
            playerType02 = 'X';
        }

        // Name and Type questions for P2
        System.out.print("Please enter Player 2 name: ");
        String playerName02 = input.nextLine();
        System.out.println();

        // Char to enum
        PlayerType playerType01Enum = PlayerType.valueOf(String.valueOf(playerType01));
        PlayerType playerType02Enum = PlayerType.valueOf(String.valueOf(playerType02));

        // Player objects creating
        Player player01 = new Player(playerName01, playerType01Enum);
        Player player02 = new Player(playerName02, playerType02Enum);

        // Objects inspection
        System.out.println(player01.toString());
        System.out.println(player02.toString());
        input.close();

        // Board drawing
        Board board = new Board(rowCount, colCount);

        board.initBoard();

        board.setO(1, 1);
        board.setX(2, 2);

        board.boardDrawing();


    }






}