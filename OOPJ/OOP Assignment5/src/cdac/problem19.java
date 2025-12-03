package cdac;

import java.util.*;

public class problem19 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new LinkedHashMap<>();
        grades.put("Amit", 85); grades.put("Priya", 92);
        System.out.print("Grade Report: ");
        Iterator<Map.Entry<String, Integer>> it = grades.entrySet().iterator();
        List<String> out = new ArrayList<>();
        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            out.add(e.getKey() + ":" + e.getValue());
        }
        System.out.println(String.join(", ", out));
    }

}
