class Enemy {
    private String name;
    private int hp;

    public Enemy(String name, int hp) {
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


        hp = Math.max(0, hp - amount);
    }

    public boolean isDead() {

        if (hp <= 0) {
            return true;
        }
        return false;
    }
}
