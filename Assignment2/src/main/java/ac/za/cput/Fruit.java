package ac.za.cput;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Fruit {



    public List createApplesList(List x){

         List apple = new ArrayList();

        apple.add("green");
        apple.add("yellow");
        apple.add("red");


        return apple;

    }

    public Set createAppleSet(Set x) {
        Set set = new HashSet();

        set.add("small apple");
        set.add("big apple");
        set.add("huge apple");
        return set;
    }

    public Map createAppleMap(Map x){
            Map mapA = new HashMap();

            mapA.put("key1", "yesterday's apple");
            mapA.put("key2", "today's apple");
            mapA.put("key3", "tomorrow's apple");
            return mapA;

    }

}





