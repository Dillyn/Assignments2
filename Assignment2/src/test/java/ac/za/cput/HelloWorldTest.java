package ac.za.cput;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class HelloWorldTest {

    private HelloInterface hw;

    @Before
    public void setUp2() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hw = (HelloInterface)ctx.getBean("HelloWorld");
    }

    @After
    public void tearDown2() throws Exception {
    }

    @Test
    public void testHello2() throws Exception {
        String result = hw.runHello();
        Assert.assertEquals("Hello World", result);    }

}