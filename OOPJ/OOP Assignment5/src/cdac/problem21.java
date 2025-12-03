package cdac;

import java.util.*;

public class problem21 {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        history.push("Type A");
        history.push("Type B");
        history.push("Delete");
        // Undo last action
        history.pop();
        // Current order from bottom to top: Type A, Type B
        List<String> actions = new ArrayList<>(history);
        Collections.reverse(actions); // to display insertion order
        System.out.println("Current actions: " + String.join(", ", actions));
    }

}
