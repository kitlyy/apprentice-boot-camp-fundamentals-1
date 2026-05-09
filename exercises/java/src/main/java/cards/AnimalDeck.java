package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements Deck{

    private final List<Card> cards;

    public AnimalDeck() {
        this.cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            this.cards.add(new AnimalCard(animal));
            this.cards.add(new AnimalCard(animal));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public Card deal() {
        return cards.removeFirst();
    }

    @Override
    public List<Card> getListOfCards() {
        return this.cards;
    }


}
