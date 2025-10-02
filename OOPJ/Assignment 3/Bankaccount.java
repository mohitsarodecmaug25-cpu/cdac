class P1_Bankaccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    public double getBalance() { return balance; }
}

class P1_Main {
    public static void main(String[] args) {
        P1_BankAccount acc = new P1_BankAccount();
        acc.deposit(5000);
        acc.withdraw(2000);
        System.out.println("Updated Balance = " + acc.getBalance());
    }
}
