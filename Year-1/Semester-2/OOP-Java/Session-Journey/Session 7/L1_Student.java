import java.util.Scanner;

public class L1_Student {
    private String name;
    private int age;

    //constructor
    public L1_Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        L1_Student student1 = new L1_Student("Akel", 20);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        
        System.out.print("Enter New Age: ");
        int newAge = in.nextInt();
        
        student1.setAge(newAge);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
    }
}