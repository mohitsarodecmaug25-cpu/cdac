public class Test {
    public static void main(String[] args) {
        System.out.println(method());
    }

    static int method() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}