package cdac;

import java.util.*;
import java.util.stream.Collectors;

public class problem28 {
    public static void main(String[] args) {
        Map<String, List<String>> dept = new LinkedHashMap<>();
        dept.put("IT", new ArrayList<>(Arrays.asList("Amit","Rohan")));
        dept.put("HR", new ArrayList<>(Arrays.asList("Priya")));
        System.out.println("Department Structure: " +
                dept.entrySet().stream().map(e -> e.getKey() + ": " + String.join(", ", e.getValue())).collect(Collectors.joining("; ")));
    }
}
