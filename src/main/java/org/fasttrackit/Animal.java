package org.fasttrackit;

public class Animal {
    String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String foodPreferred;
    private String activityPreferred;

    //optional
    private double loyalty;
    private int scaredLevel;
    private int energyLevel;
    private int toiletNeed;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFoodPreferred() {
        return foodPreferred;
    }

    public void setFoodPreferred(String foodPreferred) {
        this.foodPreferred = foodPreferred;
    }

    public String getActivityPreferred() {
        return activityPreferred;
    }

    public void setActivityPreferred(String activityPreferred) {
        this.activityPreferred = activityPreferred;
    }

    public double getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(double loyalty) {
        this.loyalty = loyalty;
    }

    public int getScaredLevel() {
        return scaredLevel;
    }

    public void setScaredLevel(int scaredLevel) {
        this.scaredLevel = scaredLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getToiletNeed() {
        return toiletNeed;
    }

    public void setToiletNeed(int toiletNeed) {
        this.toiletNeed = toiletNeed;
    }

    public void showMoodLevel(Animal animal) {
        System.out.println("The mood level for " + animal.getName() + " is " + animal.getMoodLevel() + "/10");

    }


}
