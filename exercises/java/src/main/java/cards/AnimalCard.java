package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap( Card otherCard ){
        return otherCard != null && this.equals(otherCard);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
