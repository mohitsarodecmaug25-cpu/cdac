import java.util.*;

public class Duplicates {
    public static List<Integer> findDuplicates(int[] a) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new LinkedHashSet<>();
        for (int v : a) {
            if (!seen.add(v)) dup.add(v);
        }
        return new ArrayList<>(dup);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 1};
        System.out.println("Duplicates: " + findDuplicates(arr));
    }
}
