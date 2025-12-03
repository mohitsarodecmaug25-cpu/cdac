public class Average {
    public static double average(int[] a) {
        int sum = 0;
        for (int v : a) sum += v;
        return (double) sum / a.length;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Average: " + average(arr));
    }
}
