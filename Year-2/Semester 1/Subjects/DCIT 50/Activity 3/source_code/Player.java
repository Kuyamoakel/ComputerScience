class Player {
    private int hp;
    private int mana;

    public Player(int hp, int mana) {
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

        hp -= amount;

    }

    public void heal(int amount) {

        hp += amount;
    }

    public void spendMana(int amount) {

        mana -= amount;
    }

    public void restoreMana(int amount) {
        
        mana += amount;
    }
}