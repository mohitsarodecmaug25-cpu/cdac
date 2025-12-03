import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> books = new HashMap<>();
        books.put(101, "Java");
        books.put(102, "Python");
        books.put(102, "C++");
        System.out.println("Books: " + books);
        books.remove(102);
        System.out.println("After removal: " + books);
    }
}
