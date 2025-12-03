package cdac;

import java.util.ArrayList;
import java.util.List;

public class problem1 {
    public static void main(String[] args) {
        List<String> roster = new ArrayList<>();
        roster.add("Amit");
        roster.add("Priya");
        roster.add("Rohan");
        roster.remove("Priya");
        System.out.println("Students: " + String.join(", ", roster));
    }

}
