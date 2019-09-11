package org.fasttrackit;

public class RecreationalActivity {
    String name;

    //optional
    int energyConsumption;
    int hungerLevelDrop;
    boolean satisfactionGained;
    int amountOfSatisfactionGained;
    boolean loyaltyGained;
    int amountOfLoyaltyGained;

    public RecreationalActivity(String name) {
        this.name = name;
    }
}
