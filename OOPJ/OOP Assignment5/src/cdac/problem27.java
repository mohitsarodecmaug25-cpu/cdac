package cdac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem27 {
    static class Emp {
        String name; int salary;
        Emp(String n, int s) { name = n; salary = s; }
        public String toString() { return name + ":" + salary; }
    }
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp("Amit",50000));
        list.add(new Emp("Priya",60000));
        list.add(new Emp("Rohan",45000));
        list.sort(Comparator.comparingInt(e -> e.salary));
        System.out.println("Sorted by salary: " + list.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

}
