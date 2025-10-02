interface PaymentGateway {
    void pay(double amount);
}

class CreditCardPayment24 implements PaymentGateway {
    @Override public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + (int)amount);
    }
}

class PayPalPayment implements PaymentGateway {
    @Override public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + (int)amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment24();
        PaymentGateway p2 = new PayPalPayment();
        p1.pay(2500);
        p2.pay(1500);
    }
}
