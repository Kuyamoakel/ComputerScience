abstract class Animal {
    // Attributes
    private String name;
    private String type;
    private int age;

    Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // abstract method
    abstract void makeSound();
    abstract void move();

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Name: " + name +
               "\nType: " + type +
               "\nAge: " + age;
    }
}

abstract class Mammal extends Animal {
    Mammal(String name, String type, int age) {
        super(name, type, age);
    }

    abstract void giveBirth();
    abstract void feedMilk();
}

class Lion extends Mammal {
    Lion(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " say Rarww!!");
    }

    @Override
    void move() {
        System.out.println(getName() + " is Walking to find food!");
    }

    @Override
    void giveBirth() {
        System.out.println(getName() + " is Giving birth to a baby cub!");
    }

    @Override
    void feedMilk() {
        System.out.println(getName() + " is Feeding her baby cub!");
    }
}

class Elephant extends Mammal {
    Elephant(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " trumpets Loudly!");
    }

    @Override
    void move() {
        System.out.println(getName() + " is roaming around!");
    }

    @Override
    void giveBirth() {
        System.out.println(getName() + " is Giving birth to a baby elephant!");
    }

    @Override
    void feedMilk() {
        System.out.println(getName() + " is Feeding her baby elephant!");
    }

}

abstract class Bird extends Animal {
    Bird(String name, String type, int age) {
        super(name, type, age);
    }

    abstract void fly();
    abstract void layEggs();
}

class Eagle extends Bird {
    Eagle(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    void fly() {
        System.out.println(getName() + " fly to find food!");
    }

    @Override
    void layEggs() {
        System.out.println(getName() + " Lay her eggs!");
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " says kee-eeeee-arrr!");
    }

    @Override
    void move() {
        System.out.println(getName() + " is roaming around!");
    }
}

class Parrot extends Bird {
    Parrot(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    void fly() {
        System.out.println(getName() + " fly to find food!");
    }

    @Override
    void layEggs() {
        System.out.println(getName() + " Lay her eggs!");
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " says pit-pittt!");
    }

    @Override
    void move() {
        System.out.println(getName() + " is walking around!");
    }
}

abstract class Reptile extends Animal {
    Reptile(String name, String type, int age) {
        super(name, type, age);
    }

    abstract void layEggs();
}

class Snake extends Reptile {
    Snake(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    void layEggs() {
        System.out.println(getName() + " is Laying her Eggs!");
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " says hisssss!");
    }

    @Override
    void move() {
        System.out.println(getName() + " is moving around their turf...");
    }
}

class Crocodile extends Reptile {
    Crocodile(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    void layEggs() {
        System.out.println(getName() + " is Laying her Eggs!");
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " says grr!!!");
    }

    @Override
    void move() {
        System.out.println(getName() + " is swimming around!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        
        Animal[] animals = {
            new Lion("Rafael", "Mammal", 5),
            new Elaphant("Nathaniel", "Mammal", 10),
            new Eagle("Chawi", "Bird", 6),
            new Parrot("James", "Bird", 2),
            new Snake("Diamond", "Reptile", 3),
            new Crocodile("Lo-Long", "Reptile", 13)
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.move();
            animal.makeSound();

            if (animal instanceof Mammal) {
                ((Mammal)animal).giveBirth();
                ((Mammal)animal).feedMilk();

            }

            if (animal instanceof Bird) {
                ((Bird)animal).layEggs();
                ((Bird)animal).fly();
            }

            if (animal instanceof Reptile) {
                ((Reptile)animal).layEggs();
            }
            System.out.println();
        }
    }
}