package cdac;

import java.util.HashMap;
import java.util.Map;

public class problem14 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Rohan", 78);
        // Update
        grades.put("Rohan", 88);
        System.out.println("Updated Grade: Rohan:" + grades.get("Rohan"));
    }
}
