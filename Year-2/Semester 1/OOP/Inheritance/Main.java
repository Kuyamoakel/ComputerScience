public class Main {
        public static void main(String[] args) {

            Bankaccount account = null;

            account = new Bankaccount(100);
            System.out.println(account.getBalance());
            account.withdraw(150);
            account.deposit(0);
            account.deposit(-500);

            System.out.println(account.getBalance());

            try {
                account = new Bankaccount(-1);
                account.getBalance();
            } catch (IllegalArgumentException e) {
                System.out.println("We do not accept negative values");
            }


            
        }
    }