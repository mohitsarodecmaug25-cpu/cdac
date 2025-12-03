public class Sumiterative {
    public static int sumIterative(int[] a) {
        int sum = 0;
        for (int v : a) sum += v;
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Sum (Iterative): " + sumIterative(arr));
    }
}
