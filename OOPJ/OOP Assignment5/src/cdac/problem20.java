package cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class problem20 {
    public static void main(String[] args) {
        List<Integer> rolls = new ArrayList<>(Arrays.asList(101,102,103,104));
        rolls.removeIf(r -> r % 2 != 0);
        System.out.println("Even Roll Numbers: " + rolls.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
