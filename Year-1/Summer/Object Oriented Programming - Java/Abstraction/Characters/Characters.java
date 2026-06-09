abstract class Character {

    abstract void attack();
    abstract void shielding();

    void move() {
        System.out.println("Characer Moves");
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
}

public class Characters {
    public static void main(String[] args) {

        Character mage = new Mage();
        Character tank = new Tank();

        mage.move();
        tank.move();

        System.out.println();

        mage.attack();
        mage.shielding();
        tank.attack();
        tank.shielding();
        
    }
}