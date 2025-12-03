public class Minelement {
    public static int minElement(int[] a) {
        int mn = a[0];
        for (int v : a) if (v < mn) mn = v;
        return mn;
    }
    public static void main(String[] args) {
        int[] arr = {15, 8, 22, 5, 19};
        System.out.println("Minimum: " + minElement(arr));
    }
}
