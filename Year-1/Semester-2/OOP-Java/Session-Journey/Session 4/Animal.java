    class Animal {
    void animalSound() {
        System.out.println("The animal makes Sound");
    }
}

class Dog extends Animal {
    @Override
    void animalSound() {
        System.out.println("The Dog Sound: Wof Wof!");
    }
}

class Cat extends Animal {
    @Override
    void animalSound() {
        System.out.println("The Cat Sound: Meow Moew");
    }
}

class Bird extends Animal {
    @Override
    void animalSound() {
        System.out.println("The Bird Sound: wit wit!");
    }
}

class Main {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCar = new Cat();
        Animal myBird = new Bird();

        myDog.animalSound();
        myCar.animalSound();
        myBird.animalSound();
    }
}