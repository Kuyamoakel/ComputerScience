import java.util.*;

class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Character> characters = new ArrayList<>();
        Character characterOne;
        Character characterTwo;

        Random rand = new Random();
        
        
        characters.add(new Warrior("Thor", 20, 150));
        characters.add(new Mage("Merlin", 30, 100));
        characters.add(new Archer("Robin", 25, 120));

        while (true) {
            System.out.print("\n1. Show Members\n2. Arena\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("===== PARTY MEMBERS =====");
                    for (Character character : characters) {
                        System.out.println(character);
                    }
                }
                case 2 -> {
                    System.out.println("\n===== ARENA =====");
                    System.out.println("Matching upp....\n");
                    Thread.sleep(1000);
                    do {
                        characterOne = characters.get(rand.nextInt(characters.size()));
                        characterTwo = characters.get(rand.nextInt(characters.size()));                       
                    } while (characterOne == characterTwo);
                    
                    characterTwo.resetHealth();
                    characterOne.resetHealth();
                    System.out.println(characterOne.getName() + " VS " + characterTwo.getName());
                    do {
                        int damageOne = characterOne.getAttack() + rand.nextInt(5);
                        int damageTwo = characterTwo.getAttack() + rand.nextInt(5);
                        if (characterOne.getHealth() <= 0) {
                            System.out.println(characterTwo.getName() + " Wins!");
                            break;
                        }

                        characterOne.attack();
                        characterTwo.takeDamage(damageOne);
                        System.out.println(characterTwo.getName() + " HP: " + characterTwo.getHealth());
                        Thread.sleep(1500);
                        System.out.println();

                        if (characterTwo.getHealth() <= 0) {
                            System.out.println(characterOne.getName() + " Wins!");
                            break;
                        }
                        
                        characterTwo.attack();
                        characterOne.takeDamage(damageTwo);
                        System.out.println(characterOne.getName() + " HP: " + characterOne.getHealth());
                        Thread.sleep(1500);
                        System.out.println();
                        

                   
                    } while (characterOne.getHealth() > 0 && characterTwo.getHealth() > 0);
                }
                default -> { System.out.println("Invalid choice!");}
            }
        }
    }
}