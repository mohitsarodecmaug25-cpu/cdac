package cdac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class problem26 {
    static class Employee {
        String name; int salary;
        Employee(String name, int salary) { this.name = name; this.salary = salary; }
        public String toString() { return name + ":" + salary; }
    }
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Amit", 50000));
        emps.add(new Employee("Priya", 60000));
        System.out.println("Employee List: " + emps.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
