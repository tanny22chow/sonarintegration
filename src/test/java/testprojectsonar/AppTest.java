package testprojectsonar;

import io.testproject.sdk.drivers.GenericDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public GenericDriver d;

    //    @BeforeClass
//    public void setup() throws Exception{
//        d=new GenericDriver("","","");
//    }
    @Test
    public void checkCap() {
        Assert.assertEquals(new App().capitalize("tan"), "TAN");
    }

}
