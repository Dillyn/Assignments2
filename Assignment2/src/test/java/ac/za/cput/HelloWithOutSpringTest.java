package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class HelloWithOutSpringTest {
    @Test
    public void testHello() throws Exception {
        HelloImpl hello = new HelloImpl();
        Assert.assertEquals("Hello", hello.runHello());    }
}
