package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixedDeck implements Deck{

    private final List<Card> mixedCards;

    public MixedDeck(Deck... decks) {
        mixedCards = new ArrayList<>();
        for (Deck deck : decks) {
            addCardsToMixedDeck(deck);
        }
    }

    private void addCardsToMixedDeck(Deck deck) {
        mixedCards.addAll(deck.getListOfCards());
    }
    @Override
    public void shuffle() {
        Collections.shuffle(mixedCards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[mixedCards.size()];
        for (int i = 0; i < mixedCards.size(); i++) {
            Card card = mixedCards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public Card deal() {
        return mixedCards.removeFirst();
    }

    @Override
    public List<Card> getListOfCards() {
        return List.of();
    }


}
