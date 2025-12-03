package cdac;

import java.util.SortedSet;
import java.util.TreeSet;

public class problem7 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Rohan"); names.add("Amit"); names.add("Priya");
        System.out.println("Students: " + String.join(", ", names));
    }
}
