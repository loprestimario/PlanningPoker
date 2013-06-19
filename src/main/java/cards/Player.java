package cards;

import java.util.ArrayList;
import java.util.Random;


public class Player {

    private Cards c= new Cards();

    public Object chooseCard() throws InterruptedException {

        int item = new Random().nextInt(8);
        ArrayList list =c.returnCard();
        return list.get(item);
    }
}
