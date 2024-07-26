package stringOperations;

import java.util.HashMap;

public class FrequencyOfElements {


    public static void main(String[] args) {

        String str = "aabcdeff";
        HashMap<String,Integer> checkMap = new HashMap<>();

        char[] ch = str.toCharArray();
        int count = 0;

        for (char c : ch){
            String charAsString = Character.toString(c);
            if (!checkMap.containsKey(charAsString)){
                checkMap.put(charAsString,count+1);
            }
            else {
                checkMap.put(charAsString,checkMap.get(charAsString)+1);
            }
        }

        System.out.println(checkMap);

    }
}
