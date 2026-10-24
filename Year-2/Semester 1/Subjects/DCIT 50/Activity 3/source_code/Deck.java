import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cardPool;
    private Random randomGenerator;
    
    public Deck() {
        this.cardPool = new ArrayList<>();
        this.randomGenerator = new Random();

        cardPool.add(new PhysicalCard("Quick Attack", 1, 10));
        cardPool.add(new PhysicalCard("Shuriken Toss", 2, 20));
        cardPool.add(new PhysicalCard("Double Edge", 3, 35));
        cardPool.add(new PhysicalCard("Dragon Tail", 1, 12));
        cardPool.add(new PhysicalCard("Primal Roar", 2, 15));

        cardPool.add(new MagicCard("Lucent Beam", 2, 5, 0, 0));
        cardPool.add(new MagicCard("Mana Drain", 0, 3, 0, 3));
        cardPool.add(new MagicCard("Shallow Grave", 5, 0, 30, 0));
        cardPool.add(new MagicCard("Finger of Death", 10, 25, 0, 0));
        cardPool.add(new MagicCard("Mystic Snake", 2, 15, 15, 0));
        
        cardPool.add(new PureCard("Wild Axes", 5, 15, 0));
        cardPool.add(new PureCard("Consume", 5, 45, 25));
        cardPool.add(new PureCard("Purifying Flames", 3, 50, 35));

    }

    public Card drawRandomCard() {
        int size = randomGenerator.nextInt(cardPool.size());
        return cardPool.get(size);
    }

    public void addCard(Card card) {
        cardPool.add(card);
    }
}



