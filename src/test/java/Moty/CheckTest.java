package Moty;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {
    @Test
    public void getCode() throws Exception {
        Check test = new Check();

        test.setCode(50);

        int c = test.code;

        Assert.assertEquals(50,c);
    }

}
