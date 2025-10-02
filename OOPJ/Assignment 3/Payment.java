abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private double amount;
    public CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber; this.amount = amount;
    }
    @Override void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " -> Rs. " + (int)amount + " Paid");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    private double amount;
    public UPIPayment(String upiId, double amount) {
        this.upiId = upiId; this.amount = amount;
    }
    @Override void pay() {
        System.out.println("Payment via UPI " + upiId + " -> Rs. " + (int)amount + " Paid");
    }
}

public class Assignment12_PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("1234567890123456", 5000);
        Payment p2 = new UPIPayment("rahul@upi", 2000);
        p1.pay();
        p2.pay();
    }
}
