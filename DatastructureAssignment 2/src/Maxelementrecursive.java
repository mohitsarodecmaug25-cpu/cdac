public class Maxelementrecursive {
    public static int maxrecursive(int[] a, int idx) {
        if (idx == a.length - 1) return a[idx];
        return Math.max(a[idx], maxrecursive(a, idx + 1));
    }
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 3, 19};
        System.out.println("Maximum (Recursive): " + maxrecursive(arr, 0));
    }
}
