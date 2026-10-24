public class MagicCard extends Card {
    private int damage;
    private int healAmount;
    private int manaRestore;

    public MagicCard(String name, int manaCost, int damage, int healAmount, int manaRestore) {
        super(name, manaCost);
        this.damage = damage;
        this.healAmount = healAmount;
        this.manaRestore = manaRestore;
    }

    @Override 
    public void play(Player player, Enemy boss) {

        int manaResult = super.getManaCost() - getManaCost();

        if (manaResult < 0) {
            System.out.println("Nog enough Mana!");
            return;
        }

        if (player.getMana() <= 0 || super.getManaCost() > player.getMana()) {
            System.out.println("Not enough Mana!");
            return;
        }

         System.out.println("Player Cast " + super.getName() + " Dealt "  + damage + " to Badong the Great.");
         player.spendMana(super.getManaCost());
         boss.takeDamage(damage);
         player.heal(healAmount);
         player.restoreMana(manaRestore);

        
    }

    @Override
    public void printDetails() {
        System.out.println("------------ MAGIC CARD ------------");
        System.out.println("Card: " + super.getName());
        System.out.println("Mana Cost: " + super.getManaCost());
        System.out.println("Damage: " + damage);
        System.out.println("Heal Amount: " + healAmount);
        System.out.println("Mana Restored: " + manaRestore);
        System.out.println("----------------------------------------");
    }
}
