class Animal {

    void speak() {
        System.out.println("Animal sound");
    }

}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Woof");
    }

}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("Meow");
    }

}

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat()
        };

        for (Animal a : animals) {

            a.speak();

        }

    }

}