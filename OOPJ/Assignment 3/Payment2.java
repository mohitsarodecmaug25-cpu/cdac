abstract class Payment2 {
    abstract void pay();
}

class CreditCardPayment2 extends Payment2 {
    private String cardNumber; private double amount;
    public CreditCardPayment2(String cardNumber, double amount) { this.cardNumber = cardNumber; this.amount = amount; }
    @Override void pay() { System.out.println("Payment via Credit Card " + cardNumber + " -> Rs. " + (int)amount + " Paid"); }
}

class UPIPayment2 extends Payment2 {
    private String upiId; private double amount;
    public UPIPayment2(String upiId, double amount) { this.upiId = upiId; this.amount = amount; }
    @Override void pay() { System.out.println("Payment via UPI " + upiId + " -> Rs. " + (int)amount + " Paid"); }
}

public class Assignment18_PaymentProcess {
    public static void main(String[] args) {
        Payment2 p;
        p = new CreditCardPayment2("1234567890123456", 5000);
        p.pay();
        p = new UPIPayment2("rahul@upi", 2000);
        p.pay();
    }
}
