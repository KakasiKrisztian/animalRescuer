package org.fasttrackit;

public class Toy {
    //This is a optional class
    private String name;
    private String toyType;
    private double toyPrice;
    private int happinessRaisingNumber;
    private boolean happinessLevelRaised;

    public Toy(String name, double toyPrice) {
        this.name = name;
        this.toyPrice = toyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(double toyPrice) {
        this.toyPrice = toyPrice;
    }

    public int getHappinessRaisingNumber() {
        return happinessRaisingNumber;
    }

    public void setHappinessRaisingNumber(int happinessRaisingNumber) {
        this.happinessRaisingNumber = happinessRaisingNumber;
    }

    public boolean isHappinessLevelRaised() {
        return happinessLevelRaised;
    }

    public void setHappinessLevelRaised(boolean happinessLevelRaised) {
        this.happinessLevelRaised = happinessLevelRaised;
    }
}
