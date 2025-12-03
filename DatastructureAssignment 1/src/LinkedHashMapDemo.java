import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> login = new LinkedHashMap<>();

        login.put("user1", "pass1");
        login.put("user2", "pass2");
        login.put("user3", "pass3");

        System.out.println("Login details: " + login);

        login.remove("user2");
        login.put("user2", "newpass"); // re-added at end
        System.out.println("After changes: " + login);
    }
}
