package collections.map;

import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {

//        To make the map as descending order while creation
        Map<Integer,Integer> map = new java.util.TreeMap<>((one,two)-> two - one);
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);

        map.forEach((k,v)-> System.out.println(k+"-"+v));

        System.out.println("=====================");
//        Default way of ascending order
        Map<Integer,Integer> map1 = new java.util.TreeMap<>();
        map1.put(1,10);
        map1.put(2,20);
        map1.put(3,30);
        map1.put(4,40);
        map1.put(5,50);

        map1.forEach((k,v)-> System.out.println(k+"-"+v));
    }
}
