package cards;

import java.util.ArrayList;

public class CardPot {

    public ArrayList movesPlayed = new ArrayList<Object>();

    public void addCard(Object o) {

        movesPlayed.add(o);
    }

    public ArrayList getCards() {
        return movesPlayed;
    }

    public int getSize(){
        return movesPlayed.size();
    }

    public void emptyArray(){
        movesPlayed.clear();
    }
}
