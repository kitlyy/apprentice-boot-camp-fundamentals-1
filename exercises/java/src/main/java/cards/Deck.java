package cards;


import java.util.List;

public interface Deck {
    void shuffle();
    String[] getCards();
    Card deal();
    List<Card> getListOfCards();
}
