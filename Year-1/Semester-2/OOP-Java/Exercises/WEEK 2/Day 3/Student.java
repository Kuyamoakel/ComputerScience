import javax.swing.text.StyledEditorKit;

public class Student {

    // Here is the Private Fields
    private String name;
    private int age;
    private double grade;

    // making out constructor para ma initialize the fields;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //getters for fields

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    //setters for fields

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age cannot be in that range");
        }
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be in range of 0 - 100");
        }
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Akel", 20, 92);
        student1.displayInfo();

        student1.setAge(17);
        student1.setAge(18);
        student1.getAge();
        student1.setGrade(101);
        System.out.println(student1.getAge());
        System.out.println(student1.getGrade());

    }
}