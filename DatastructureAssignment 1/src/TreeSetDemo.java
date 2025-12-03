import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("apple");
        ts.add("Banana");
        ts.add("apple");
        System.out.println("TreeSet: " + ts);
    }
}
