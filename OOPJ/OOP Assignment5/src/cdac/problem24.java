package cdac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class problem24 {
    public static void main(String[] args) {
        Queue<String> jobs = new LinkedList<>(Arrays.asList("Doc1","Doc2","Doc3"));
        String printing = jobs.poll();
        System.out.println("Printing " + printing + ", Queue: " + String.join(", ", jobs));
    }
}
