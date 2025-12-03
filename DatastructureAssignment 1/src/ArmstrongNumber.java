import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;
        int digits = String.valueOf(num). length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}