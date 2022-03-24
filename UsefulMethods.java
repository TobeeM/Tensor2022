public class UsefulMethods {
    public static String int_to_String(int number) {
        if (number < 2 || number > 10) {
            return "";
        }

        if (number == 2) {
            return "Two of ";
        } else if (number == 3) {
            return "Three of ";
        } else if (number == 4) {
            return "Four of ";
        } else if (number == 5) {
            return "Five of ";
        } else if (number == 6) {
            return "Six of ";
        } else if (number == 7) {
            return "Seven of ";
        } else if (number == 8) {
            return "Eight of ";
        } else if (number == 9) {
            return "Nine of ";
        } else return "Ten of ";
    }

    public static int get_Suit_Value(Card_b card) {
        int suit_value;
        if (card.getSuit() == "Clubs") suit_value = 0;
        else if (card.getSuit() == "Diamonds") suit_value = 1;
        else if (card.getSuit() == "Spades") suit_value = 2;
        else suit_value = 3;

        return suit_value;
    }
}
