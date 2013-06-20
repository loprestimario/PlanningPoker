package poker;

import cards.Cards;

import java.util.ArrayList;
import java.util.Random;


public class Player {

    private Cards c= new Cards();

    public Object chooseCard() throws InterruptedException {

        int item = new Random().nextInt(8);
        ArrayList list =c.getCards();
        return list.get(item);
    }
}
