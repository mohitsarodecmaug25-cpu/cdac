package project;

public class OnlineShopping {
    public static void main(String[] args) {
        System.out.println("=== Online Shopping System ===");

        // Example product prices
        double[] prices = {299.99, 499.99, 199.99};

        // Example quantities for each product
        int[] quantities = {3, 2, 1};  // means: 3 of first, 2 of second, 1 of third

        try {
            double total = 0;

            for (int i = 0; i < prices.length; i++) {
                total += prices[i] * quantities[i];
            }

            System.out.println("Order placed successfully!");
            System.out.println("Total Price: " + total);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid quantities or non-existent products!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Calculation issue with order price!");
        }
    }
}
