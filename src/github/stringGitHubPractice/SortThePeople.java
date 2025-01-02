package github.stringGitHubPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortThePeople {

    public static void main(String[] args) {

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        sortPeople(names,heights);
    }

    public static String[] sortPeople(String[] names, int[] heights) {

        List<>
        for(int i = 0 ; i < names.length ; i++){

            for (int j = 0 ; j < heights.length ; j++){

            }
        }
       List<Integer> heightsSorted =  Arrays.stream(heights).boxed().sorted(Comparator.reverseOrder()).toList();
       List<String> names =
        System.out.println(heightsSorted);
        return names;
    };

}
