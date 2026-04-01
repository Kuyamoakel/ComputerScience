public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    public boolean isPassed() {
        return grade >= 75;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public static void main(String[] args) {
        
        Student student1 = new Student("Akel", 20, 60);
        double grade = student1.getGrade();
        
        student1.displayInfo();

        if (!student1.isPassed()) {
            System.out.println("You Failed! with grade of " + grade);
        } else {
            System.out.println("Congratulation! You Passed! with grade of " + grade);
        }
        
    }
}