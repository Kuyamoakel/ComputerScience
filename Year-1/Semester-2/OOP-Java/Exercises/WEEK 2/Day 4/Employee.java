class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displayInfo() {
        System.out.println("Position: Manager");
        super.displayInfo();
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displayInfo() {
        System.out.println("Position: Developer");
        super.displayInfo();
    }

}

class Main {
    public static void main(String[] args) {

        Employee manager = new Manager("Akel", 30000);
        Employee developer = new Developer("Kurt", 250000);

        manager.displayInfo();
        developer.displayInfo();
    }
}