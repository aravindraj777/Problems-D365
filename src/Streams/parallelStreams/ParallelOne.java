package Streams.parallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class  Student {

    int score;
    String name;

    Student(int score , String name){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}
public class ParallelOne {


    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(20,"Arvind"),
                new Student( 30,"David"),
                new Student(40,"Bob"),
                new Student(49,"John")
        );

//        normal stream

       studentList.stream()
               .filter(student -> student.getScore() >= 30)
               .limit(2)
                 .forEach(student -> System.out.println(student.getName() + " "+ student.getScore()));



//       parallelStream

        studentList.parallelStream()
                .filter(student -> student.getScore() >= 30)
                .limit(3)
                .forEach(student -> System.out.println(student.getName()));



//        CAN CONVERT THE EXISTING STREAM TO PARALLEL USING PARALLEL METHOD
        studentList.stream().parallel()
                .filter(student -> student.getScore() >= 30)
                .limit(2)
                .forEach(student -> System.out.println(student.getName() + " "+ student.getScore()));


    }


}
