import java.util.Arrays;

public class Reversearray {
    public static int[] reverse(int[] a) {
        int n = a.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = a[n - 1 - i];
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Reversed: " + Arrays.toString(reverse(arr)));
    }
}
