package hw.tiktaktoe.poharskyi;

import java.util.Scanner;

public class Player {
    private final String playerName;
    private PlayerType playerType;

    public Player(String playerName, PlayerType playerType) {
        this.playerName = playerName;
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerType=" + playerType +
                '}';
    }




    static boolean isNotValidSymbol(char inputSymbol) {
        for (PlayerType i : PlayerType.values()) {
            if (i.name().charAt(0) == inputSymbol) {
                return false;
            }
        }
        return true;
    }


    //    public void setPlayers(){
//
//    }
//    Player player01 = new Player(userNameP01, typeP01);
//    Player player02 = new Player(userNameP02, typeP02);
}



//    private void setPlayersNames(String playerName) {
//        System.out.println("What is your nickname Player 1?:");
//        String player01Name = Input.nextLine();
//        do {
//            System.out.println("Player01 X or O?:");
//
//        }
//    }
//}
//}
