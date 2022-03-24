import java.util.Arrays;
import java.util.Objects;

public class Card_c {
    private final String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    private int rank;
    private String suit;

    private static int maxDiamond = 2;
    private static int maxClub = 2;
    private static int maxHeart = 2;
    private static int maxSpade = 2;
    private int maxRank = 2;

    private int getMaxRank(String suit) {
        if (Arrays.asList(suits).contains(suit)) {
            if (suit.equals("Diamonds")) {
                return maxDiamond;
            } else if (suit.equals("Clubs")) {
                return maxClub;
            } else if (suit.equals("Hearts")) {
                return maxHeart;
            } else {
                return maxSpade;
            }
        } else
            return 0;
    }

    public Card_c(int rank, String suit) {
        this.rank = rank;
        if (rank > maxRank) {
            if (suit.equals("Diamonds")) {
                maxDiamond = rank;
            } else if (suit.equals("Clubs")) {
                maxClub = rank;
            } else if (suit.equals("Hearts")) {
                maxHeart = rank;
            } else if (suit.equals("Spades")) {
                maxSpade = rank;
            }
        }

        if (Arrays.asList(suits).contains(suit)) {
            this.suit = suit;
        } else {
            System.out.println("Given suit does not exist!");
        }
    }

    public Card_c(String suit) {
        maxRank = getMaxRank(suit);
        rank = maxRank + 1;

        if (Arrays.asList(suits).contains(suit)) {
            this.suit = suit;
        } else {
            System.out.println("Given suit does not exist!");
        }
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
