package cdac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class problem17 {
    public static void main(String[] args) {
        String[] grades = {"A","B","A","C","B","A"};
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String g : grades) freq.put(g, freq.getOrDefault(g,0)+1);
        System.out.print("Grade Distribution: ");
        System.out.println(freq.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining(", ")));
    }
}
