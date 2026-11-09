import java.util.*;


public class BattleEngine {
    private ArrayList<Card> hand;

    public BattleEngine(){
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void drawHand(Deck deck, int numberOfCards) {
        
        for (int i = 0; i < numberOfCards; i++) {
            hand.add(deck.drawRandomCard());
        }
    }

    public void executeTurn(Player player, Enemy boss) {

        int bossStartingHP = boss.getHp();

        System.out.println("----- Boss Battle Begins -----");
        System.out.println("Player | HP: " + player.getHp() + " | Mana: " + player.getMana());
        while (!hand.isEmpty()) {
            // Players
            if (player.getHp() <= 0 || boss.isDead()) {
                break;
            }

            Card card = hand.remove(0);
            card.printDetails();
            card.play(player, boss);
        }

            System.out.println("---- BATTLE FINISHED! ----");
            System.out.println("Player Final Status -> HP: " + player.getHp() + "/" + player.getMaxHp() + " | Mana: " + player.getMana() + "/" + player.getMaxMana());
            System.out.println("Boss Final Status -> HP: " + boss.getHp());
            System.out.println("Total Damage Dealt: " + (bossStartingHP - boss.getHp()));
        
    }
}