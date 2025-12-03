import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        System.out.println("Square root = " + (i - 1));
    }
}
