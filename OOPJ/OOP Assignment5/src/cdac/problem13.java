package cdac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class problem13 {
    public static void main(String[] args) {
        Map<String, Integer> reg = new LinkedHashMap<>();
        reg.put("Amit", 101);
        reg.put("Rohan", 102);
        reg.put("Priya", 103);
        System.out.print("Registration Order: ");
        System.out.println(reg.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(Collectors.joining(", ")));
    }
}
