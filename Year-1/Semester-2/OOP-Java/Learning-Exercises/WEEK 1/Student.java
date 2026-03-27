public class Student {
    String name;
    int age, grade;

    // constructor.
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayStundent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        
        Student student1 = new Student("Akel", 20, 90);
        Student student2 = new Student("Kurt", 28, 92);
        Student student3 = new Student("Aira", 24, 93);
        student1.displayStundent();
        student2.displayStundent();
        student3.displayStundent();
        
    }
}
