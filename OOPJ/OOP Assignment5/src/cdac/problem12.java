package cdac;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class problem12 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Amit", 90);
        map.put("Rohan", 85);
        map.put("Priya", 95);
        System.out.print("Attendance Report: ");
        System.out.println(map.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(Collectors.joining(", ")));
    }
}
