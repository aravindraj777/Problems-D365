package Streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemoTwo {


    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jony","Kitty");


        List<List<String>> playersInWorldCup = new ArrayList<>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);


        for (List<String> team : playersInWorldCup){
            for (String name: team){
                System.out.println(name);
            }
        }


        System.out.println("==================");
//        Using stream AND flatmap

        List<String> names = playersInWorldCup.stream()
                .flatMap(pList->pList.stream()).toList();
        System.out.println(names);

    }


}
