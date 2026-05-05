abstract class Payment {

    //abstract method lahat ng child must have this
    public abstract void pay(double amount);

    //regular method = shared by everyone
    public void receipt() {
        System.out.println("Thank you for your payment");
    }
}

class Cash extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using Cash");
    }
}

class Gcash extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using Gcash");
    }
}

class Credit extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using CreditCard");
    }
}

public class L4_PaymentAbstraction {
    public static void main(String[] args) {
        Cash p1 = new Cash();
        Gcash p2 = new Gcash();
        Credit p3 = new Credit();

        p1.pay(500);
        p1.receipt();

        System.out.println();

        p2.pay(1500);
        p2.receipt();

        System.out.println();

        p3.pay(2000);
        p3.receipt();
    }
}