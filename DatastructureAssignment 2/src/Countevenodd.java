public class Countevenodd {
    public static void countEvenOdd(int[] a) {
        int even = 0, odd = 0;
        for (int v : a) {
            if (v % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        countEvenOdd(arr);
    }
}
