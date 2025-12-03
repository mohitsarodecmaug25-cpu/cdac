import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.println("Set: " + set);
        System.out.println("Contains Python? " + set.contains("Python"));
        set.remove("Java");
        System.out.println("After removal: " + set);
    }
}
