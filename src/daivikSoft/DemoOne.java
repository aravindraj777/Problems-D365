package daivikSoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class DemoOne {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Java");

        boolean equals = s1 == s2;
        System.out.println(equals);

        boolean another = s1.equals(s2);
        System.out.println(another);

        String collect = s1.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining("|"));


        System.out.println(collect);
//        J|A|V|A

//        StringBuilder stringBuilder = new StringBuilder(s1);
//        s1 = "J|A|V|A";
//        System.out.println(s1);

//        char[] ch = s1.toCharArray();
//        for (int i = 0 ; i< ch.length-1 ;i++){
//           ch[i] = ch[i] +;
//        }
//        System.out.println(Arrays.toString(ch));

        String s3 = String.join("|", s1.split(""));
        System.out.println(s3);

        String sentence = "word1 word2    word3 word1 word2 ";
//        int length = sentence.split(" ").length;
//        System.out.println(length);

//        Arrays.stream(sentence)
//                int count=0;
//        for (int i = 0; i < sentence.length(); i++) {
//            int i1 = sentence.indexOf(" ");
//            String substring = sentence.substring(0, i1);
//
//            System.out.println(substring);
//        }
//
        }

//        long wordCount = Arrays.stream(sentence.trim().split("\\s+"))
//                .count();
//        System.out.println(wordCount);
    }





//}
