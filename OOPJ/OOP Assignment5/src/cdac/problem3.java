package cdac;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class problem3 {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Study Java");
        tasks.add("Complete Assignment");
        tasks.add("Exercise");
        tasks.remove("Exercise");
        System.out.println("Remaining tasks: " + String.join(", ", tasks));


    }
}
