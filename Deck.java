import java.util.ArrayList;

public class Deck {
    private static ArrayList<Card_b> deck = new ArrayList<Card_b>();

    private Deck() {

    }

    public static Card_b getRandomCard() {
        int random_index = 2 + (int)(Math.random() * (deck.size() - 1));
        return deck.get(random_index);
    }
}
