package org.fasttrackit;

public class Rescuer {
    private String name;
    private double money;

    //optional
    private int loveTowardsAnimals;
    private int hungerLevel;
    private int stressLevel;
    private boolean worker;
    //Daca e angajat sau nu.


    public Rescuer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void feedPet(Animal animal, String animalFood) {

        System.out.println(animal.getName() + " hunger level is: " + animal.getHungerLevel());
        System.out.println(this.getName() + " just gave some " + animalFood.getN + " food to " + animal.getName() + "." );
        animal.setHungerLevel(animal.getHungerLevel() - 1);
        System.out.println(animal.getName() + " hunger level is now: " + animal.getHungerLevel());
    }
    public void playCatch(Rescuer rescuer, Animal animal) {
        System.out.println(animal.getName() + " current mood level is: " + animal.getMoodLevel());
        System.out.println(rescuer.getName() + " is playing catch with " + animal.getName() + ".");
        animal.setMoodLevel(animal.getMoodLevel() + 1);
        System.out.println(animal.getName() + " mood level is now: " + animal.getMoodLevel());

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getLoveTowardsAnimals() {
        return loveTowardsAnimals;
    }

    public void setLoveTowardsAnimals(int loveTowardsAnimals) {
        this.loveTowardsAnimals = loveTowardsAnimals;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int stressLevel) {
        this.stressLevel = stressLevel;
    }

    public boolean isWorker() {
        return worker;
    }

    public void setWorker(boolean worker) {
        this.worker = worker;
    }
}
