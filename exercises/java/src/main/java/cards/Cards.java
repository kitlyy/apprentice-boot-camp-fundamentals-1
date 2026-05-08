package cards;

public class Cards {

    static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit*13+faceValue] = new PlayingCard(new Suit(suit), faceValue);
            }
        }

        for (int i = 0; i < deck.length; i++) {
            result[i] = deck[i].toString();
        }

        return result;
    }
}
