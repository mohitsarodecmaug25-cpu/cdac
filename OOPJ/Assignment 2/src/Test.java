public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }
}