import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String[] arr = {"dog", "cat", "elephant", "bee"};
        Arrays.sort(arr);
        for (String s : arr) System.out.print(s + " ");
        // Output: bee cat dog elephant
    }
}
