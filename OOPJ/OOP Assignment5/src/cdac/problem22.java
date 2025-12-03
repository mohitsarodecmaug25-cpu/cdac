package cdac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class problem22 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>(Arrays.asList("Amit", "Priya", "Rohan"));
        String serving = q.poll();
        System.out.println("Serving: " + serving + ", Queue: " + String.join(", ", q));
    }
}
