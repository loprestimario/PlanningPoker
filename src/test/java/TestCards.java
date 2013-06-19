import junit.framework.Assert;
import org.junit.Test;
import cards.Cards;

import java.util.ArrayList;

class TestCards {

    @Test
    public void testGetCards()  {
        Cards cards = new Cards();
        ArrayList list =cards.returnCard();
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(13);
        list1.add(20);
        list1.add("?");

        Assert.assertEquals(list, list1);
    }
}
