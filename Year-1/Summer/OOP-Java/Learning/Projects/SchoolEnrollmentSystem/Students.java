abstract class Student {
    private String name;
    private int age;
    private String id;
    private static int counter = 122;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = "25101" + counter++;
    }

    public abstract String getCourse();

    // 
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nAge: " + age +
               "\nId: " + id +
               "\nCourse: " + getCourse();
    }
}

abstract class DCIT extends Student {
    DCIT(String name, int age) {
        super(name, age);
    }
}

class ComputerScience extends DCIT {
    ComputerScience(String name, int age) {
        super(name, age);
    }

    @Override
    public String getCourse() {
        return "Computer Science";
    }
}

abstract class FLY extends Student {
    FLY(String name, int age) {
        super(name, age);
    }
}

class Tourism extends FLY {
    Tourism(String name, int age) {
        super(name, age);
    }

    @Override
    public String getCourse() {
        return "Tourism";
    }
}

abstract class MEDL extends Student {
    MEDL(String name, int age) {
        super(name, age);
    }
}

class Nursing extends MEDL {
    Nursing(String name, int age) {
        super(name, age);
    }

    @Override
    public String getCourse() {
        return "Nursing";
    }
}