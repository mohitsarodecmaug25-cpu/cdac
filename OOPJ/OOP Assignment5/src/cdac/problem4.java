package cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem4 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("Milk", "Eggs", "Bread"));
        items.remove ("Milk");
        System.out.println("Items to buy: " + String.join(", ", items));
    }

}
