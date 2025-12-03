package cdac;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class problem18 {
    public static void main(String[] args) {
        List<String> morning = Arrays.asList("Amit","Priya");
        List<String> evening = Arrays.asList("Rohan","Priya");
        Set<String> combined = new LinkedHashSet<>();
        combined.addAll(morning);
        combined.addAll(evening);
        System.out.println("Combined batches: " + String.join(", ", combined));
    }
}
