import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Studyhour study = new Studyhour();

        while (true) {
            System.out.print("[1] Insert Work\n[2] Statistic\n[3] Exit\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.print("Topic/Subject: ");
                    String subject = in.nextLine();

                    System.out.print("Category: ");
                    String category = in.nextLine();
                    
                    System.out.print("Hours: ");
                    int hours = in.nextInt();

                    study.insertWork(subject, category, hours);
                }    
                case 2 -> {study.viewWork();}   
                case 3 -> {
                    System.out.println("Thank you for using our tracker");
                    return;
                }
                default -> {System.out.println("Invalid Input");}
            }
        }
    }
}
