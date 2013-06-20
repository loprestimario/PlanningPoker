import junit.framework.Assert;
import org.junit.Test;
import poker.Player;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 18/06/13
 * Time: 0.05
 * To change this template use File | Settings | File Templates.
 */
public class TestPlayer {

    @Test
    public void testContainsCards() throws InterruptedException {
        Player player = new Player();

        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("5");
        list1.add("8");
        list1.add("13");
        list1.add("20");
        list1.add("?");
        Object card= player.chooseCard();
        Assert.assertTrue(list1.contains(card));
    }

    @Test
    public void testContainsCardsEmptyList() throws InterruptedException {
        Player player = new Player();

        ArrayList list1 = new ArrayList();
        Object card= player.chooseCard();
        Assert.assertFalse(list1.contains(card));
    }
}
