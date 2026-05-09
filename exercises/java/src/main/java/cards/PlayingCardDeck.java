package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck{
//    PlayingCard[] deck = new PlayingCard[52];
    private final List<Card> deck;

    PlayingCardDeck() {
        this.deck = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                this.deck.add(new PlayingCard(new Suit(suit), faceValue));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    public String[] getCards() {
        String[] result = new String[deck.size()];
        for (int i = 0; i < deck.size(); i++) {
            result[i] = deck.get(i).toString();
        }
        return result;
    }

    public Card deal() {
        return deck.removeFirst();
    }

    @Override
    public List<Card> getListOfCards() {
        return this.deck;
    }

    @Override
    public String toString() {
        return "PlayingCardDeck{" +
                "deck=" + deck +
                '}';
    }
}
