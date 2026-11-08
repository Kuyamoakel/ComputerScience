class Enemy {
    private String name;
    private int hp;

    public Enemy(String name, int hp) {

        if (hp < 0) {
            throw new IllegalArgumentException("Enemy hp must not be negative");
        }
        this.name = name;
        this.hp = hp;
    }

    // getters

    public String getName(){
        return name;
    }

    public int getHp() {
        return hp;
    }

    // methods
    public void takeDamage(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Take Damage cannot be negatie");
        }


        hp = Math.max(0, hp - amount);
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
