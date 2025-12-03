import java.util.*;

public class Ldemo {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After adding: " + list);

        list.set(1, "Go");
        System.out.println("After update: " + list);

        list.remove("C++");
        System.out.println("After removal: " + list);
    }
}