import java.util.ArrayList;

public class BattleEngine {
    private ArrayList<Card> hand;

    public BattleEngine(){
        this.hand = new ArrayList<>();
    }

    public void drawHand(Deck deck, int numberOfCards) {
        
        for (int i = 0; i < numberOfCards; i++) {
            hand.add(deck.drawRandomCard());
        }
    }

    public void excuteTurn(Player player, Enemy boss) {

        System.out.println("----- Boss Battle Begins -----");
        System.out.println("Player | HP: " + player.getHp() + " | Mana: " + player.getMana());
        for (Card card : hand) {
            if (player.getMana() == 0) {
                System.out.println("Your Mana Turns 0");
                break;
            }
            if (player.getHp() <= 0 ) {
                break;
            }

            if (boss.getHp() <= 0) {
                break;
            }
            card.printDetails();
            card.play(player, boss);
        }

            System.out.println("---- BATTLE FINISHED! ----");
            System.out.println("Player Final Status -> HP: " + player.getHp() + " | Mana: " + player.getMana());
            System.out.println("Boss Final Status -> HP: " + boss.getHp());

        
    }
}