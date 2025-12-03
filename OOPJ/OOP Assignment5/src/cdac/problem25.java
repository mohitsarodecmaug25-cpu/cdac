package cdac;

import java.util.ArrayDeque;
import java.util.Deque;

public class problem25 {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        String[] cmds = {"ls","pwd","cd ..","mkdir"};
        int limit = 3;
        for (String c : cmds) {
            history.addLast(c);
            if (history.size() > limit) history.removeFirst();
        }
        System.out.println("Recent Commands: " + String.join(", ", history));
    }
}
