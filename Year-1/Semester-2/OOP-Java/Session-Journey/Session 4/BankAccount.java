class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Invalid Withdraw Amount");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }       

    @Override
    public void withdraw(double amount) {
        double fee = 2.0;
        if (amount + fee <= getBalance()) {
            balance -= (amount + fee);
            System.out.println("Withdraw Amount: " + amount + " With Fee " + fee);
        } else {
            System.out.println("insufficient balance");
        }

    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(double Balance) {
        super(Balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    } 
}


class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(5000);
        BankAccount acc2 = new CheckingAccount(5000);

        System.out.println("Savings Account");
        acc1.checkBalance();
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.checkBalance();

        System.out.println("Checking Account");
        acc2.checkBalance();
        acc2.deposit(500);
        acc2.withdraw(400);
        acc2.checkBalance();
    }
}