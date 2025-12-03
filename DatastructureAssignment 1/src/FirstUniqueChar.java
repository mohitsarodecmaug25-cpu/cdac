import java.util.*;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeated = " + e.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character");
    }
}


