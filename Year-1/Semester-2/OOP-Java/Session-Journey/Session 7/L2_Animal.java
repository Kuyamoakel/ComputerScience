import hey.Animal;
import hey.Dog;

class Animal {
    private String name;
    private String breed;
    private int age;

    //constructor
    public Animal (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }
    
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void introduction() {
        System.out.println(name + " Is a " + breed + " Dog and " + age + " Years Old");
    }

    public void eat() {
        System.out.println(name + " is Eating...");
    }
}

class Dog extends Animal {
    
    //constructor
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void barking() {
        System.out.println(getName() + " is Barking..");
    }
}
public class L2_Animal {
    public static void main(String[] args) {
        Dog d = new Dog("Akel", "Pitbull", 5);
        d.introduction();
        d.eat();
        d.barking();

    }
}