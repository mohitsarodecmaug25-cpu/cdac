public class LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 100, c = 7;
        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }
}
