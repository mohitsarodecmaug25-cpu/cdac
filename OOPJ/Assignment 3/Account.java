class Account {
    protected int accountNo;
    protected double balance;
    public Account(int accountNo, double balance) {
        this.accountNo = accountNo; this.balance = balance;
    }
    public void displayBalance() {
        System.out.println(accountNo + ", Balance=" + (int)balance);
    }
}

class SavingAccount extends Account {
    private double interestRate;
    public SavingAccount(int acc, double bal, double rate) {
        super(acc, bal); this.interestRate = rate;
    }
    public double interestAmount() { return balance * (interestRate / 100.0); }
    public void display() {
        System.out.println("Saving -> " + accountNo + ", Balance=" + (int)balance + ", Interest=" + (int)interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(int acc, double bal, double limit) {
        super(acc, bal); this.overdraftLimit = limit;
    }
    public void display() {
        System.out.println("Current -> " + accountNo + ", Balance=" + (int)balance + ", Overdraft=" + (int)overdraftLimit);
    }
}

public class Assignment11_AccountTypes {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(101, 5000, 5);
        CurrentAccount c = new CurrentAccount(102, 10000, 2000);
        s.display();
        c.display();
    }
}
