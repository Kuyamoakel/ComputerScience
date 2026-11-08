class Player {
    private int hp;
    private int mana;

    public Player(int hp, int mana) {

        if (hp < 0 || mana < 0) {
            throw new IllegalArgumentException("Hp or Mana cannot be negative");
        }
        this.hp = hp;
        this.mana = mana;
    }

    // getters

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    // methods
    public void takeDamage(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Take Damage cannot be negative");
        }

        hp = Math.max(0, hp - amount);

    }

    public void heal(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Heal cannot be negative");
        }

        hp = Math.max(100, hp + amount);
    }

    public void spendMana(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Spend Mana cannot be negative");
        }

        mana = Math.max(0, mana - amount);
    }

    public void restoreMana(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Restore Mana cannot be negative");
        }
        
        mana += amount;
    }
}