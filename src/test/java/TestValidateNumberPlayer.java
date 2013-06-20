import junit.framework.Assert;
import org.junit.Test;
import poker.ValidateNumberPlayer;

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 17/06/13
 * Time: 23.36
 * To change this template use File | Settings | File Templates.
 */
public class TestValidateNumberPlayer {

    @Test
    public void testValidateNumberPlayerTrue()  {

        ValidateNumberPlayer validateNumberPlayer= new ValidateNumberPlayer();
        boolean validate = validateNumberPlayer.validate(5);
        Assert.assertEquals(validate, true);
    }

    @Test
    public void testValidateNumberPlayerFalse()  {

        ValidateNumberPlayer validateNumberPlayer= new ValidateNumberPlayer();
        boolean validate = validateNumberPlayer.validate(52);
        Assert.assertEquals(validate, false);
    }


}
