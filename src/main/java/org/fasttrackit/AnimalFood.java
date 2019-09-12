package org.fasttrackit;

public class AnimalFood extends Food {
    private String animalForWhichIsDestined;
    private boolean mixedAnimalUsage;


    public AnimalFood(String name, double price, double quantity, String animalForWhichIsDestined, boolean mixedAnimalUsage) {
        super(name, price, quantity);
        this.animalForWhichIsDestined = animalForWhichIsDestined;
        this.mixedAnimalUsage = mixedAnimalUsage;
    }

    public String getAnimalForWhichIsDestined() {
        return animalForWhichIsDestined;
    }

    public void setAnimalForWhichIsDestined(String animalForWhichIsDestined) {
        this.animalForWhichIsDestined = animalForWhichIsDestined;
    }

    public boolean isMixedAnimalUsage() {
        return mixedAnimalUsage;
    }

    public void setMixedAnimalUsage(boolean mixedAnimalUsage) {
        this.mixedAnimalUsage = mixedAnimalUsage;
    }
}
