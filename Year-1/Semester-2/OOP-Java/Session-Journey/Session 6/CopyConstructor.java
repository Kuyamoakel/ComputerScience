class CopyConstructor {
    String name;
    int age;

    //parameterized constructor
    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy contructor
    CopyConstructor(CopyConstructor obj2) {
        this.name = obj2.name;
        this.age = obj2.age;
    }
}

class Main {
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("Akel", 20);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println("OBJECT 1 Constructor");
        System.out.println("Name: " + obj1.name + "\nAge: " + obj1.age);
        
        System.out.println("OBJECT 2 Constructor");
        System.out.println("Name: " + obj2.name + "\nAge: " + obj2.age);
    }
}
