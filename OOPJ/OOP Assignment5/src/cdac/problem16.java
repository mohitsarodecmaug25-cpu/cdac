package cdac;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class problem16 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new LinkedHashMap<>();
        grades.put("Amit", 85); grades.put("Priya", 52); grades.put("Rohan", 78);
        // Remove below 60
        grades.entrySet().removeIf(e -> e.getValue() < 60);
        System.out.print("Honor Roll: ");
        System.out.println(grades.entrySet().stream().map(e -> e.getKey()+":"+e.getValue()).collect(Collectors.joining(", ")));
    }
}
