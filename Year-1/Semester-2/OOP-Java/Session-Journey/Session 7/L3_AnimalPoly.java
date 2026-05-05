package hey;
class Animal {
    public void sound() {
        System.out.println("Animal Sounds");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Wof WOf");
    }
}

class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("pit pit!");
    }
}

public class L3_AnimalPoly {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        Animal d1 = new Dog();
        Animal b1 = new Bird();

        c1.sound();
        d1.sound();
        b1.sound();
    }
}