public abstract class Card {
    private String name;
    private int manaCost;

    public Card(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    // setter
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    // methods
    public abstract void play(Player player, Enemy boss);

    public abstract void printDetails();


}
