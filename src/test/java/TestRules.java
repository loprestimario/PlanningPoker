import junit.framework.Assert;
import org.junit.Test;
import poker.Estimator;

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
        Estimator rules = new Estimator();
        ArrayList list= new ArrayList();
        list.add(1);
        list.add(5);
        list.add(5);

        Assert.assertEquals((int) (rules.makeAverage(list)), 4);
    }

    @Test
    public void testMakeAverageEmptyList()  {
        Estimator rules = new Estimator();
        ArrayList list= new ArrayList();

        Assert.assertEquals((int) (rules.makeAverage(list)), 0);
    }
    @Test
    public void testContainsQuestionMarkTrue()  {
        Estimator rules = new Estimator();
        ArrayList list= new ArrayList();
        list.add(1);
        list.add("?");
        list.add(5);

        Assert.assertTrue((rules.containsQuestionMark(list)));
    }
    @Test
    public void testContainsQuestionMarkEmptyList()  {
        Estimator rules = new Estimator();
        ArrayList list= new ArrayList();

        Assert.assertFalse((rules.containsQuestionMark(list)));
    }


    @Test
    public void testContainsQuestionMarkFalse()  {
        Estimator rules = new Estimator();
        ArrayList list= new ArrayList();
        list.add(1);
        list.add("3");
        list.add(5);

        Assert.assertFalse((rules.containsQuestionMark(list)));
    }
}
