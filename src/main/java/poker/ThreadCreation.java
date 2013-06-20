package poker;

import cards.CardPot;

public class ThreadCreation implements Runnable {

    Player player;
    CardPot playedCards;
    Thread thread;
    int numberPlayers;
    int idPlayer;
    GuiGame guiGame = new GuiGame();

    public ThreadCreation (Player t, CardPot c,int n,int m)  {

        player= t;
        playedCards =c;
        numberPlayers =n;
        idPlayer = m;
        thread = new Thread(this);
        thread.start();

    }

    public void run() {

        Object result= null;
        try {
            result = player.chooseCard();
            guiGame.printEstimation(idPlayer, result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        playedCards.addCard(result);
        if(playedCards.getSize()== numberPlayers){

            synchronized (playedCards) {
                playedCards.notify();
            }
        }


    }
}
