package cdac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class problem29 {
    static class Student {
        String name, grade;
        Student(String n,String g){name=n;grade=g;}
        public String toString(){ return name + ":" + grade; }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Amit","A"), new Student("Priya","B"));
        System.out.println("Student Records: " + students.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
