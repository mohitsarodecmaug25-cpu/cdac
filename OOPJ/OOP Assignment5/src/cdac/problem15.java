package cdac;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class problem15 {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Java", 3);inventory.put("Python", 5);
        // Borrow "Java" 1 copy
        inventory.put("Java", inventory.get("Java") - 1);
        System.out.print("Current inventory: ");
        System.out.println(inventory.entrySet().stream().map(e -> e.getKey()+":"+e.getValue()).collect(Collectors.joining(", ")));
    }
}
