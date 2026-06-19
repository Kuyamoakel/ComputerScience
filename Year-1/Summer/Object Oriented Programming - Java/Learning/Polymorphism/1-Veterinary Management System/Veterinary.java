abstract class Pet {
    private String name;
    private String breed;
    private int age;

    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // abstract methods
    abstract void sound();
    abstract void playing();
    abstract void specialAbility();

    public void eating() {
        System.out.println(name + " is eating...");
    }

    public void sleeping() {
        System.out.println(name + " is sleeping...");
    }
    
    // getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // setter

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Checking Pet: " + name + "\n";
    }
}

class Dog extends Pet {
    
    Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void playing() {
        System.out.println(getName() + " is fetching a ball");
    }

    @Override
    void sound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    void specialAbility() {
        System.out.println("\n" + getBreed() + " Special Ability: " + "\n" + getName() + " is guarding the house.");
    }
}

class Cat extends Pet {

    Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void playing() {
        System.out.println(getName() + " is chasing a lase pointer.");
    }

    @Override
    void sound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    void specialAbility() {
        System.out.println("\n" + getBreed() + " Special Ability: " + "\n" + getName() + " is scratching the furniture.");
    }
}

class Bird extends Pet {

    Bird(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void playing() {
        System.out.println(getName() + " is flying around.");
    }

    @Override
    void sound() {
        System.out.println("Tweet! Tweet!");
    }

    @Override
    void specialAbility() {
        System.out.println("\n" + getBreed() + " Special Ability: " + "\n" + getName() + " is singing.");
    }
}

class Veterinian {
    void checkUp(Pet pet) {
        System.out.println("\nVeterinarian is checking " + pet.getName());

        pet.sound();
        pet.playing();

    }


}

class WorkingDog extends Dog {

    WorkingDog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void playing() {
        System.out.println(getName() + " is fetching a ball.");
    }

    @Override
    void sound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    void specialAbility() {
        System.out.println("\n" + getBreed() + " Special Ability: " + "\n" + getName() + " is rescuing people.");
    }

    void ability() {
        System.out.println("\n" + getName() + " is guarding the house.");
    }
}

public class Veterinary {
    public static void main(String[] args) {
        
        Pet[] pets = {
            new Dog("Buddy", "Dog", 10),
            new Cat("Whiskers", "Cat", 5),
            new Bird("Tweety", "Bird", 3),
        };

        System.out.println("===== PET MANAGEMENT SYSTEM =====");
        for (Pet pet : pets) {
            System.out.println(pet);
            pet.eating();
            pet.sleeping();
            pet.playing();
            pet.sound();
            pet.specialAbility();
            System.out.println("\n--------------------------------");
            System.out.println();
        }



        System.out.println("===== VETERINARY CHECKUP =====");
        Veterinian vet = new Veterinian();
        for (Pet pet : pets) {
            vet.checkUp(pet);
        }


        
        System.out.println("\n===== WORKING DOG TEST =====");
        Dog workingDog = new WorkingDog("Rex", "Dog", 3);
        workingDog.eating();
        workingDog.sleeping();
        workingDog.playing();
        workingDog.sound();
        workingDog.specialAbility();
        if (workingDog instanceof WorkingDog) {
            ((WorkingDog)workingDog).ability();
        }
    }
}