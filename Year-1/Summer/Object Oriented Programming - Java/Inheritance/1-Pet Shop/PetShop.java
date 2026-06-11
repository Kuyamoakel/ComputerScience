abstract class Pet {
    // Attributes
    private String name;
    private String breed;
    private int age;

    Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    abstract void play();
    abstract void sound();

    // Concreate Methods

    void eating() {
        System.out.println(name + " is Eating...");
    }

    void sleeping() {
        System.out.println(name + " is Sleeping...");
    }

    void popping() {
        System.out.println(name + " is Popping...");
    }


    // Getters

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // Only name can be changed
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet Name: " + name +
               "\nBreed: " + breed +
               "\nAge: " + age;
    }
}


abstract class Dog extends Pet {
    Dog(String name, String breed, int age) {
        super(name, breed, age);
    }
}

class Pitbull extends Dog {
    Pitbull(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void play() {
        System.out.println(getName() + " is bitting his Toy!");
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Work!");
    }
}

class GoldenRetriever extends Dog {
    GoldenRetriever(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void play() {
        System.out.println(getName() + " is playing with other Dogs!");
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Work!");
    }
}

abstract class Cat extends Pet {
    Cat(String name, String breed, int age) {
        super(name, breed, age);
    }
}

class Himalayan extends Cat {
    Himalayan(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void play() {
        System.out.println(getName() + " is a chasing a Yarn!");
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Meow!");
    }
}

class Persian extends Cat {
    Persian(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void play() {
        System.out.println(getName() + " is Playing with other Cat");
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Meow!");
    }
}


public class PetShop {
    public static void main(String[] args) {

        Pet[] pets = {
            new Pitbull("James", "Pitbull", 2),
            new GoldenRetriever("Andrew", "GoldenRetriever", 3),
            new Himalayan("Moon", "Himalayan", 2),
            new Persian("Persing", "Persian", 4)
        };

        for (Pet pet : pets) {
            System.out.println(pet);
            pet.play();
            pet.sleeping();
            pet.eating();
            pet.popping();
            System.out.println();
        }
    }
}