package poker;

import cards.CardPot;

import java.io.IOException;

public class Engine implements Runnable {

    CardPot playedCards = new CardPot();
    GuiGame guiGame = new GuiGame();
    int numberPlayer;
    Thread thread;
    Estimator rules= new Estimator();

    public Engine() throws IOException {
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
            rules.estimate(playedCards.getCards());
            playedCards.emptyArray();
            new Timer();
        }
    }
}
