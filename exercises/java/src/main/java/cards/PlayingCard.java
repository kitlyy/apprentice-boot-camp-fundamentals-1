package cards;

import java.util.Objects;

public class PlayingCard implements Card {
    private final Suit suit;
    private final int faceValue;

    PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public boolean snap( Card otherCard ){
        return otherCard != null && this.equals(otherCard);
    }


    @Override
    public String toString() {
        String result = switch (this.faceValue) {
            case 0 -> "ace";
            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> Integer.toString(this.faceValue + 1);
            case 10 -> "jack";
            case 11 -> "queen";
            case 12 -> "king";
            default -> throw new IllegalArgumentException("Invalid face value - must be 1-13");
        };
        return String.format("%s of %s", result, suit.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return faceValue == that.faceValue && Objects.equals(suit, that.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValue);
    }
}
