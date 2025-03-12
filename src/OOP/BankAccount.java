package OOP;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double deposit(double amt) {
        if (amt > 0) {
            this.balance = this.balance + amt;
        }
        return 0;

    }
    public double withdraw(double amt) {
        if (amt <= this.balance) {
            this.balance = this.balance - amt;
            return amt;
        }
        return 0;
    }
    public void announceBalance() {
        System.out.println("Balance is: " + this.balance);
    }
}
