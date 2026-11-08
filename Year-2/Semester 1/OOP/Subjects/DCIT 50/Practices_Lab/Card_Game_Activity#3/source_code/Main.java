public class Main {
    public static void main(String[] args) {
        
        Player hero = new Player(50, 5);
        Enemy boss = new Enemy("Badong the Great", 100);

        Deck masterDeck = new Deck();
        BattleEngine engine = new BattleEngine();

        engine.drawHand(masterDeck, 4);
        engine.executeTurn(hero, boss);
    }
}
