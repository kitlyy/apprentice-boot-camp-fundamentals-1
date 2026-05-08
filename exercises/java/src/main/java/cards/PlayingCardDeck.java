package cards;

import java.util.Arrays;

public class PlayingCardDeck {
    PlayingCard[] deck = new PlayingCard[52];

    PlayingCardDeck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                this.deck[suit*13+faceValue] = new PlayingCard(new Suit(suit), faceValue);
            }
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        for (int i = 0; i < deck.length; i++) {
            result[i] = deck[i].toString();
        }
        return result;
    }

    @Override
    public String toString() {
        return "PlayingCardDeck{" +
                "deck=" + Arrays.toString(deck) +
                '}';
    }
}
