package org.fasttrackit;

public class AnimalFood extends Food {
    String animalForWhichIsDestined;
    boolean mixedAnimalUsage;

    public AnimalFood(String animalForWhichIsDestined, boolean mixedAnimalUsage) {
        this.animalForWhichIsDestined = animalForWhichIsDestined;
        this.mixedAnimalUsage = mixedAnimalUsage;
    }
}
