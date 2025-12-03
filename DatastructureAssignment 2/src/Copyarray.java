import java.util.Arrays;

public class Copyarray {
    public static int[] copy(int[] src) {
        int[] dst = new int[src.length];
        for (int i = 0; i < src.length; i++) dst[i] = src[i];
        return dst;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr = copy(arr);
        System.out.println("Copied: " + Arrays.toString(copyArr));
    }
}
