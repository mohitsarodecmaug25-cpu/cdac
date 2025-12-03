package cdac;

import java.util.ArrayDeque;
import java.util.Deque;

public class problem5 {
    public static void main(String[] args) {
        Deque<String> recent = new ArrayDeque<>();
        String[] searches = {"Java", "Python", "C++", "DSA", "OOP", "Spring"};
        for (String s : searches) {
            recent.addLast(s);
            if (recent.size() > 5) recent.removeFirst();
        }
        System.out.println("Recent searches: " + String.join(", ", recent));


    }
}
