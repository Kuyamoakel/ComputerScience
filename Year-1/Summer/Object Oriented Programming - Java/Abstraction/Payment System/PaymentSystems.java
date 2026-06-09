abstract class Payment {

    abstract void processPayment();

    void printReceipt() {
        System.out.println("Receipt Printed.");
    }
}

// concrete method

class Gcash extends Payment {

    @Override
    public void processPayment() {
        System.out.println("Processing Gcash Payment...");
    }
}

class CreditCard extends Payment {
    
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
    }
}

class MayaPayment extends Payment {

    @Override
    public void processPayment() {
        System.out.println("Processing Maya Payment...");
    }
}

class Cash extends Payment {

    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment...");
    }
}

public class PaymentSystems {
    public static void main(String[] args) {

        Payment[] payments = {
            new Gcash(),
            new CreditCard(),
            new MayaPayment(),
            new Cash()
        };

        for (Payment payment : payments) {
            payment.processPayment();
            payment.printReceipt();
            System.out.println();
        }

    }
}