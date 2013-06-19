package cards;

import java.util.ArrayList;

public class PlayedCards {

    public ArrayList<Object> movesPlayed = new ArrayList<Object>();

    public void addCard(Object o) {

        movesPlayed.add(o);
    }

    public ArrayList<Object> returnCard() {
        return movesPlayed;
    }

    public int getSize(){
        return movesPlayed.size();
    }

    public void emptyArray(){
        movesPlayed.clear();
    }
}
