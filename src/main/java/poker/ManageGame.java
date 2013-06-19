package poker;

import cards.PlayedCards;
import cards.Player;

import java.io.IOException;

public class ManageGame implements Runnable {

    PlayedCards playedCards = new PlayedCards();
    GuiGame guiGame = new GuiGame();
    int numberPlayer;
    Thread thread;
    Rules rules= new Rules();

    ManageGame() throws IOException {
        numberPlayer = guiGame.readInput();
        thread = new Thread(this, "Thread manage");
        thread.start();
    }

    public void run(){

        while (true){
            System.out.println("New Game:");
            for(int i=1;i<=numberPlayer;i++){
                Player player= new Player();
                new ThreadCreation(player, playedCards,numberPlayer,i);
            }
            synchronized (playedCards) {
                try {
                    playedCards.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            rules.estimate(playedCards.returnCard());
            playedCards.emptyArray();
            new Timer();
        }
    }
}
