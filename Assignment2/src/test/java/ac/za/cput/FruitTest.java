package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class FruitTest {

    @Test
    public void createApplesList() {
        Fruit fruit = new Fruit();
        List x = new ArrayList<>();
        List z = new ArrayList();

        z.add(0,"green");
        z.add(1,"yellow");
        z.add(2,"red");

        Assert.assertEquals(z , fruit.createApplesList(x));


    }

    @Test
    public void createApplesSet() {
        Fruit fruit = new Fruit();
        Set x = new HashSet();
        Set z = new HashSet();

        z.add("small apple");
        z.add("big apple");
        z.add("huge apple");

        Assert.assertEquals(z , fruit.createAppleSet(x));


    }

    @Test
    public void createApplesMap() {
        Fruit fruit = new Fruit();
        Map x = new HashMap();
        Map z = new HashMap();
        Map y = fruit.createAppleMap(x);


        z.put("key1", "yesterday's apple");
        z.put("key2", "today's apple");
        z.put("key3", "tomorrow's apple");

        Assert.assertEquals("yesterday's apple" , y.get("key1"));


    }

    @Test
    public void createAppleColl(){
        Collection<Fruit> fruit = new HashSet<Fruit>();


        Collection x = new HashSet<Fruit>();
        Collection z = new HashSet<Fruit>();

        z.add("1");
        z.add("2");
        z.add("3");

        Assert.assertEquals(z.containsAll(z) , fruit.containsAll(x));

    }

}