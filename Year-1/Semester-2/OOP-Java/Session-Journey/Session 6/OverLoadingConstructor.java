public class OverLoadingConstructor {
    String name;
    int age;
    int height;

    // one argument
    OverLoadingConstructor(String name) {
        this.name = name;
    }

    // two argument
    OverLoadingConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Three argument
    OverLoadingConstructor(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class Main1{
    public static void main(String[] args) {
        OverLoadingConstructor obj1 = new OverLoadingConstructor("Akel");
        OverLoadingConstructor obj2 = new OverLoadingConstructor("Akel", 20);
        OverLoadingConstructor obj3 = new OverLoadingConstructor("Akel", 20, 180);

        System.out.println("Constructor with one argument: \n" + "Name: " + obj1.name);
        System.out.println("Constructor with two argument: \n" + "Name: " + obj2.name + "\nAge: " + obj2.age);
        System.out.println("Constructor with two argument: \n" + "Name: " + obj3.name + "\nAge: " + obj3.age + "\nHeight: " + obj3.height);
    }
}