package poker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuiGame {

     public int readInput() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Insert the number of player:");
        int playerNumber = Integer.parseInt(br.readLine());
        ValidateNumberPlayer v= new ValidateNumberPlayer();

         while (v.validate(playerNumber)==false){
            System.out.print("Choose a number of player between 3 and 7");
            System.out.print("\nInsert again the number of player:");
            playerNumber = Integer.parseInt(br.readLine());
            v= new ValidateNumberPlayer();
        }
        return playerNumber;
    }

    void printEstimation(int numberPlayer, Object cardChoose){

        System.out.println("Player number " + numberPlayer + "  has chosen:  " + cardChoose);
    }
}
