abstract class Character {
    private String name;
    private int attack;
    private int health;
    private int maxHeath;

    Character(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.maxHeath = health;
    }

    abstract void attack();
    abstract void specialSkills();

    void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    void resetHealth() {
        health = maxHeath;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    // seeters
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nClass: " + getClass().getSimpleName() +
               "\nName: " + name +
               "\nHP: " + health +
               "\nAttack: " + attack;
    }
}

class Warrior extends Character {
    Warrior(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    void attack() {
        System.out.println(getName() + " swings a sword!");
    }

    @Override
    void specialSkills() {
        System.out.println(getName() + " uses Shield Bash!");
    }
}

class Mage extends Character {
    Mage(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    void attack() {
        System.out.println(getName() + " casts a Magic Missile!");
    }

    @Override
    void specialSkills() {
        System.out.println(getName() + " casts Fireball!");
    }

    void ultimateSpell() {
        System.out.println(getName() + " unleashes Meteor Storm!");
    }
}

class Archer extends Character {
    Archer(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    void attack() {
        System.out.println(getName() + " shoots an arrow!");
    }

    @Override
    void specialSkills() {
        System.out.println(getName() + " uses rain of Arrows!");
    }
}