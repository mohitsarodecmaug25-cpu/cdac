import java.util.*;

class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId; this.name = name; this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

abstract class CartItem {
    abstract double calculateTotalPrice();
}

class Cart extends CartItem {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product p) { products.add(p); }
    public void applyDiscountToProduct(String productName, double percent) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                double newPrice = p.getPrice() * (1 - percent/100.0);
                p.setPrice(newPrice);
                System.out.println("Applying " + (int)percent + "% discount to " + p.getName());
                break;
            }
        }
    }
    @Override double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) total += p.getPrice();
        return total;
    }
}

interface Discountable { void applyDiscount(double percentage); }

public class Assignment28_ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.applyDiscountToProduct("Laptop", 10); // 10% discount to Laptop
        System.out.println("Total Cart Price = " + (int)cart.calculateTotalPrice());
    }
}
