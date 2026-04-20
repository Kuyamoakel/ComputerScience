class ParameterizedConstructor {
    String name;
    int age;

    ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){

        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor("Akel", 20);
        ParameterizedConstructor obj2 = new ParameterizedConstructor("Pogi", 22);

        obj1.display();
        obj2.display();
    }
}
