package OOP;

public class BankAccountCustomer {
    public static void main(String[] args) {
        BankAccount newCustomer = new BankAccount("Andy", 1000);
        newCustomer.announceBalance();
        newCustomer.withdraw(500);
        System.out.println("After withdraw");
        System.out.println(newCustomer.getOwner());
        newCustomer.announceBalance();
        newCustomer.deposit(3400);
        System.out.println("New balance");
        newCustomer.announceBalance();
    }
}
