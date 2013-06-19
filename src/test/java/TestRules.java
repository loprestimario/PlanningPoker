import junit.framework.Assert;
import org.junit.Test;
import poker.Rules;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 17/06/13
 * Time: 23.52
 * To change this template use File | Settings | File Templates.
 */
public class TestRules {

    @Test
    public void testMakeAverage()  {
        Rules rules = new Rules();
        ArrayList list= new ArrayList();
        list.add(1);
        list.add(5);
        list.add(5);

        Assert.assertEquals((int) (rules.makeAverage(list)), 4);
    }
    @Test
    public void testContainsQuestionMarkTrue()  {
        Rules rules = new Rules();
        ArrayList list= new ArrayList();
        list.add(1);
        list.add("?");
        list.add(5);

        Assert.assertEquals((rules.containsQuestionMark(list)), true);
    }

    @Test
    public void testContainsQuestionMarkFalse()  {
        Rules rules = new Rules();
        ArrayList list= new ArrayList();
        list.add(1);
        list.add("3");
        list.add(5);

        Assert.assertEquals((rules.containsQuestionMark(list)), false);
    }
}
