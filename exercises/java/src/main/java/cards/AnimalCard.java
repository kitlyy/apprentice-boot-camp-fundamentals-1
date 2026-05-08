package cards;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AnimalCard that = (AnimalCard) o;
        return animal == that.animal;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(animal);
    }
}
