import java.util.Scanner;
import java.util.ArrayList;

class Pet {
    private String name;
    private String breed;
    private int age;

    Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nBreed: " + breed +
               "\nAge: " + age;
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
}

class Petshop {
    private ArrayList<Pet> pets = new ArrayList<>();

    void addPet(Pet pet) {
        pets.add(pet);
    }

    void viewPet() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Petshop petshop = new Petshop();
        
        
        while (true) {
            System.out.print("1. Add Pet\n2. View Pet");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = in.nextLine();
                    
                    System.out.print("Breed: ");
                    String breed = in.nextLine();

                    System.out.print("Age: ");
                    int age = in.nextInt();

                    Pet pet = new Pet(name, breed, age);

                    petshop.addPet(pet);
                    
                }
                case 2 -> {
                    petshop.viewPet();
                }
                default -> {break;}
            }
        }
    }
}