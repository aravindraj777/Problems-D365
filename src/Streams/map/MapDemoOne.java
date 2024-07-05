package Streams.map;


import java.util.Arrays;
import java.util.List;

class Employee{

    Integer id;
    String name;
    Double salary;

    Employee(Integer id, String name,Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class MapDemoOne {

    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee(1,"Arvind",10000.0),
                new Employee(2,"Annekathrin",20000.0),
                new Employee(3,"Arun",50000.6),
                new Employee(4,"Adar sh",20002.6)
        );

        List<Double> employeeSalaryList = employees.stream()
                                    .filter(e->e.salary > 20000)
                                    .map(e->e.salary * 2)
                                    .toList();


        System.out.println(employeeSalaryList);
    }
}
