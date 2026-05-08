package cards;


public class Suit {
    private final int suitValue;

    Suit(int suitValue) {
        this.suitValue = suitValue;
    }

    @Override
    public String toString() {
        return switch (this.suitValue) {
            case 0 -> "clubs";
            case 1 -> "diamonds";
            case 2 -> "hearts";
            case 3 -> "spades";
            default -> throw new IllegalArgumentException("invalid suitValue: must be value 0-3");
        };
    }
}
