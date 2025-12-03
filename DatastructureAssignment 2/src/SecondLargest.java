public class SecondLargest {
    public static Integer secondLargest(int[] a) {
        Integer largest = null, second = null;
        for (int v : a) {
            if (largest == null || v > largest) {
                second = largest;
                largest = v;
            } else if (v != largest && (second == null || v > second)) {
                second = v;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second Largest: " + secondLargest(arr));
    }
}
