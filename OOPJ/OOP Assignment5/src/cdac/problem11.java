package cdac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class problem11 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new LinkedHashMap<>();
        grades.put("Amit", 85);
        grades.put("Priya", 92);
        grades.put("Rohan", 78);
        System.out.print("Grade Report: ");
        System.out.println(grades.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(Collectors.joining(", ")));

    }

}
