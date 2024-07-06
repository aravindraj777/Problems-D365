package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemoOne {


    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Arvind");
        map.put(21,"Aby");
        map.put(33,"Arun");
        map.put(11,"Amal");

        map.forEach((k,v)-> System.out.println(k + " -" + v));
    }
}
