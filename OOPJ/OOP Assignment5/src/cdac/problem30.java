package cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class problem30 {
    static class Student {
        String name; String grade;
        Student(String n,String g){name=n;grade=g;}
        public String toString(){ return name + ":" + grade; }
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(Arrays.asList(
                new Student("Amit","A"),
                new Student("Priya","C"),
                new Student("Rohan","B")
        ));
        // Remove grade below B (i.e., C, D,...). Here we consider A>B>C, so remove C.
        list.removeIf(s -> s.grade.compareTo("B") > 0); // simple lexicographic; for real use map to numeric
        System.out.println("Qualified Students: " + list.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
