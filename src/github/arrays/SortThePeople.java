package github.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortThePeople {

    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        List<String> sortedNames = IntStream.range(0,names.length)
                .boxed()
                .sorted((i,j)-> Integer.compare(heights[j],heights[i]))
                .flatMap(i -> Arrays.stream(new String[]{names[i]}))
                .toList();

        String[] sortedNamesArray = sortedNames.toArray(new String[0]);
        System.out.println(Arrays.toString(sortedNamesArray));

    }
}
