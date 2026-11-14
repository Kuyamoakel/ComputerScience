public class DemiCard extends Card {
    private double damage;

    public DemiCard(String name, int manaCost, double damage) {
        super(name, manaCost);
        this.damage = damage;
    }

    @Override 
    public void play(Player player, Enemy boss) {
        double damageCal = boss.getHp() * (damage / 100);
        int finalDamage = (int) Math.floor(damageCal); 

    }


    @Override
    public void printDetails() {
        System.out.println("------------ PURE CARD ------------");
        System.out.println("Card: " + super.getName());
        System.out.println("Mana Cost: " + super.getManaCost());
        System.out.println("Damage: " + damage);
        System.out.println("----------------------------------------");
    }
}