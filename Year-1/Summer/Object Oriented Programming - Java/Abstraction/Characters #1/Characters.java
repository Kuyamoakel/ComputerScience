abstract class Character {

    abstract void attack();
    abstract void shielding();
    abstract int getHealth();
    abstract String getClassname();


    // Concreate Method
    void move() {
        System.out.println("Characer Moves...");
    }

    void rest() {
        System.out.println("Character Rest...");
    }
}

// concreate method

class Mage extends Character {

    @Override
    void attack() {
        System.out.println("Mage casts a fireball!");
    }

    @Override
    void shielding() {
        System.out.println("Mage is Proctecting herself!");
    }

    @Override
    public int getHealth() {
        return 85;
    }

    @Override
    public String getClassname() {
        return "Mage";
    }
    
}

class Tank extends Character {
    
    @Override
    void attack() {
        System.out.println("Tank slams his Shield!");
    }
    
    @Override
    void shielding() {
        System.out.println("Tank raise his Shield!");
    }

    @Override
    public int getHealth() {
        return 150;
    }

    @Override
    public String getClassname() {
        return "Tank";
    }
}

class Archer extends Character {
    
    @Override
    void attack() {
        System.out.println("Archer attacking the tower!");
    }
    
    @Override
    void shielding() {
        System.out.println("Archer goes to back of the Tank!");
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public String getClassname() {
        return "Archer";
    }
}

public class Characters {
    public static void main(String[] args) {

        Character[] heros = {
            new Mage(),
            new Tank(),
            new Archer()
        };

        for (Character character : heros) {
            System.out.println("Character: " + character.getClassname());
            System.out.println("Health: " + character.getHealth());
            character.move();
            character.attack();
            character.shielding();
            character.rest();
            System.out.println();
        }
        
    }
}