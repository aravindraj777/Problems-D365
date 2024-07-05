package Streams.flatMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{

    int id;
    String name;
    char grade;

    Student(int id,String name,char grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
public class FlatMapDemoThree {


    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(1,"Annekathrin",'A'));
        studentList1.add(new Student(2,"Dhiraj",'B'));
        studentList1.add(new Student(3,"Abi",'V'));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(4,"Aswin",'B'));
        studentList2.add(new Student(5,"Arun",'N'));
        studentList2.add(new Student(6,"Aby",'F'));

        List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);

        for (List<Student> s : studentList){
            for (Student student : s){
                System.out.println(student.name);
            }
        }


//        using stream

        List<String> studentNames = studentList.stream().flatMap(s-> s.stream()).map(name->name.name).collect(Collectors.toList());
        System.out.println(studentNames);
    }
}
