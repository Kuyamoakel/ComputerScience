class SavingsAccount extends BankAccount {

    private static final double MINIMUM_BALANCE = 500;

    public SavingsAccount(double balance) {
        super(validateBalance(balance));
    }

    // invariants for minimumBalance
    public static double validateBalance(double balance) {

        if (balance < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("ERROR: Don't meet the Required Minimum Balance of " + MINIMUM_BALANCE);
        }

        return balance;
    }

    @Override 
    public void withdraw(double amount) {
        
        double balanceChecking = super.getBalance() - amount;
        
        if (balanceChecking < MINIMUM_BALANCE) {
            System.out.println("Amount of Withdraw  Drop below the minimum Balance!");
            return;
        }

        super.withdraw(amount);

    }

}