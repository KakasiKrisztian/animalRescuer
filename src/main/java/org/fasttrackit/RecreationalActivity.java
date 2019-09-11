package org.fasttrackit;

public class RecreationalActivity {
    private String name;

    //optional
    private int energyConsumption;
    private int hungerLevelDrop;
    private boolean satisfactionGained;
    private int amountOfSatisfactionGained;
    private boolean loyaltyGained;
    private int amountOfLoyaltyGained;

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getHungerLevelDrop() {
        return hungerLevelDrop;
    }

    public void setHungerLevelDrop(int hungerLevelDrop) {
        this.hungerLevelDrop = hungerLevelDrop;
    }

    public boolean isSatisfactionGained() {
        return satisfactionGained;
    }

    public void setSatisfactionGained(boolean satisfactionGained) {
        this.satisfactionGained = satisfactionGained;
    }

    public int getAmountOfSatisfactionGained() {
        return amountOfSatisfactionGained;
    }

    public void setAmountOfSatisfactionGained(int amountOfSatisfactionGained) {
        this.amountOfSatisfactionGained = amountOfSatisfactionGained;
    }

    public boolean isLoyaltyGained() {
        return loyaltyGained;
    }

    public void setLoyaltyGained(boolean loyaltyGained) {
        this.loyaltyGained = loyaltyGained;
    }

    public int getAmountOfLoyaltyGained() {
        return amountOfLoyaltyGained;
    }

    public void setAmountOfLoyaltyGained(int amountOfLoyaltyGained) {
        this.amountOfLoyaltyGained = amountOfLoyaltyGained;
    }
}
