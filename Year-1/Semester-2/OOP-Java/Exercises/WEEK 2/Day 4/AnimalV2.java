import java.util.Scanner;

abstract class Animal {
    public abstract void animalSound();

    public void eating() {
        System.out.println("Animal is Eating...");
    }

    public void popping() {
        System.out.println("Animal is Popping...");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The Dog Sound: Wof wof wof!");
    }
}

class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The Cat Sound: Meow meow meow");
    }
}

class AnimalDoingTheThing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Animal dog = new Dog();
        Animal cat = new Cat();

        while (true) {
            System.out.print("\nChoice Which Animal\n[1] Dog\n[2] Cat\n[3] Exit\nChoices: ");
            int animals = in.nextInt();
            in.nextLine();
    
            switch (animals) {
                case 1:
                    dog.animalSound();
                    System.out.print("Give Food (y/n): ");
                    String food = in.nextLine();
    
                    if (food.equalsIgnoreCase("y")) {
                        dog.eating();
                        dog.popping();
                    } else {
                        System.out.println("Okay Animal is Hungry!");
                    }
                    break;
                case 2:
                    cat.animalSound();
                    System.out.print("Give Food (y/n): ");
                    String food1 = in.nextLine();
    
                    if (food1.equalsIgnoreCase("y")) {
                        cat.eating();
                        cat.popping();
                    } else {
                        System.out.println("Okay Animal is Hungry!");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            } 
        }
    }
}