

public class Student {
    private String name;
    private int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName(String name) {
        return name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo () {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Akel", 20);
        
        student1.displayInfo();
        student1.setAge(20);
        student1.setName("Kurt");
        
        student1.displayInfo();
    }
}