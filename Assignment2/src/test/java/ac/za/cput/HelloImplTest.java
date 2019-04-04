package ac.za.cput;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


import static org.junit.Assert.*;

public class HelloImplTest {


    private HelloInterface calc;

    @Before
public void setUp() throws Exception {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    calc = (HelloInterface)ctx.getBean("calc");
}

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHello() throws Exception {
        String result = calc.runHello();
        Assert.assertEquals("Hello", result);    }
}


