public class Main {
    public static void main(String[] args) {
        
        Player hero = new Player(50, 5);
        Enemy boss = new Enemy("Badong the Great", 100);

        BattleEngine engine = new BattleEngine();
        Deck masterDeck = new Deck(engine);

        engine.drawHand(masterDeck, 4);
        engine.executeTurn(hero, boss);
    }
}
