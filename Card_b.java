import java.util.Arrays;
import java.util.Objects;

public class Card_b {
    private int rank;
    private String suit;

    public Card_b(int rank, String suit) {
        if (rank < 2 || rank > 15) {
            System.out.println("A card of given rank does not exist!");
        } else this.rank = rank;

        String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
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

    @Override
    public String toString() {
        String name = "";

        if (rank == 11) {
            name = "Jack of ";
        } else if (rank == 12) {
            name = "Queen of ";
        } else if (rank == 13) {
            name = "King of ";
        } else if (rank == 14) {
            name = "Ace of ";
        } else if (rank == 15) {
            name = "Joker of ";
        } else name = UsefulMethods.int_to_String(rank);

        name += suit;
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Card_b card = (Card_b)obj;
        return this.rank == card.getRank() && this.suit == card.getSuit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public boolean isPartOfStandartDeck() {
        return this.rank >= 2 && this.rank <= 15;
    }

    public boolean isStrongerSameSuit(Card_b card) {
        if (this.suit == card.suit) {
            return this.rank > card.rank;
        } else return false;
    }

    public int compareSuits(Card_b card) {
        int suit_value = UsefulMethods.get_Suit_Value(this);
        int other_card_suit_value = UsefulMethods.get_Suit_Value(card);

        return (suit_value < other_card_suit_value) ? -1 : (suit_value == other_card_suit_value) ? 0 : 1;
    }
}
