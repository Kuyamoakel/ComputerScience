class Enemy {
    public String name;
    public int hp;

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

        hp -= amount;
    }

    public boolean isDead() {

        if (hp <= 0) {
            return true;
        }
        return false;
    }
}
