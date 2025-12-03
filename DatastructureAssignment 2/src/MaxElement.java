public class MaxElement {

    // Iterative method
    public static int maxIterative(int[] a) {
        int mx = a[0];  // assume first element is max
        for (int v : a) {
            if (v > mx) mx = v;
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 3, 19};
        System.out.println("Maximum (Iterative): " + maxIterative(arr)); // Output: 47
    }
}
