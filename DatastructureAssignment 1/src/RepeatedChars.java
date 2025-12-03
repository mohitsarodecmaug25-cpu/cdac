import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RepeatedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 1)
                System.out.println(e.getKey() + " repeated " + e.getValue() + " times");
        }
    }
}
