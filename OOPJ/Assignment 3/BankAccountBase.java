class BankAccountBase {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;
    public BankAccountBase(int accNo, String holder, double bal) {
        this.accountNumber = accNo; this.accountHolder = holder; this.balance = bal;
    }
    public void displayBalance() {
        System.out.println(accountHolder + " -> Balance=" + (int)balance);
    }
}

class SavingsAccount2 extends BankAccountBase {
    private double interestRate;
    public SavingsAccount2(int accNo, String holder, double bal, double rate) {
        super(accNo, holder, bal); this.interestRate = rate;
    }
    public double calculateInterest() { return balance * (interestRate / 100.0); }
    public void display() {
        System.out.println(accountHolder + " -> Balance=" + (int)balance + ", Interest=" + (int)calculateInterest());
    }
}

class CurrentAccount2 extends BankAccountBase {
    private double overdraftLimit;
    public CurrentAccount2(int accNo, String holder, double bal, double limit) {
        super(accNo, holder, bal); this.overdraftLimit = limit;
    }
    public void checkOverdraft() {
        System.out.println(accountHolder + " -> Balance=" + (int)balance + ", Overdraft Limit=" + (int)overdraftLimit);
    }
}

public class Assignment19_BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount2 s = new SavingsAccount2(101, "Ramesh", 5000, 5);
        CurrentAccount2 c = new CurrentAccount2(102, "Anita", 2000, 1000);
        s.display();
        c.checkOverdraft();
    }
}
