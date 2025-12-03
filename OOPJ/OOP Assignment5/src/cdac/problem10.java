package cdac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem10 {
    public static void main(String[] args) {
        Integer[] voters = {201, 202, 203, 202};
        Set<Integer> set = new HashSet<>(Arrays.asList(voters));
        System.out.println("Total voters; " + set.size());
    }
}
