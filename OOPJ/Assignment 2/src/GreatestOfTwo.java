import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score for Test 1: ");
        int t1 = sc.nextInt();
        System.out.print("Enter score for Test 2: ");
        int t2 = sc.nextInt();

        if (t1 > t2) {
            System.out.println("Test 1 has higher score.");
        } else if (t2 > t1) {
            System.out.println("Test 2 has higher score.");
        } else {
            System.out.println("Both tests have equal score.");
        }
        sc.close();
    }
}
