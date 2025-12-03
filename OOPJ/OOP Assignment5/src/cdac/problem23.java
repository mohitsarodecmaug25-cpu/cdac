package cdac;

import java.util.*;

public class problem23 {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        history.push("Google");
        history.push("YouTube");
        history.push("GFG");
        // Back 1 page
        history.pop();
        // Show from bottom to top (older -> newer)
        List<String> lst = new ArrayList<>(history);
        Collections.reverse(lst);
        System.out.println("Current history: " + String.join(", ", lst));
    }
}
