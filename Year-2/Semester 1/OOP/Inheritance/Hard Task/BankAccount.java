public class BankAccount {
    private double balance;

    public BankAccount(double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("We don't accept negatives balance!");
        }

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {

        if (amount < 0) {
            System.out.println("We don't accept negative balance!");
            return;
        }

        this.balance = amount;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        if (amount < 0) {
            System.out.println("We don't accept negative amount!");
            return;
        }

        this.balance -= amount;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Nothing to deposit!");
            return;
        }

        this.balance += amount;
    }

    public void transfer(BankAccount target, double amount) {

        this.withdraw(amount);
        target.deposit(amount);
    }


}