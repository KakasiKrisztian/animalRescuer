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

    public void feedPet(Animal animal, AnimalFood animalFood) {
        System.out.println(getName() + " sees that " + animal.getName() + " looks hungry. He opens the drawer and picks up some " + animalFood.getName() + ".");
        System.out.println(animal.getName() + " hunger level is: " + animal.getHungerLevel());
        System.out.println(animal.getName() + " mood level is: " + animal.getMoodLevel() + "/10");
        System.out.println(this.getName() + " just gave some " + animalFood.getName() + " food to " + animal.getName() + ".");

        if (animalFood.getName() == animal.getFoodPreferred()) {
            animal.setMoodLevel(animal.getMoodLevel() + 1);
            System.out.println("Getting his favorite food makes " + animal.getName() + " happier. His mood level is now " + animal.getMoodLevel() + "/10.");

        }
        animal.setHungerLevel(animal.getHungerLevel() - 1);
        System.out.println(animal.getName() + " hunger level is now: " + animal.getHungerLevel());
    }

    public void playCatch(RecreationalActivity recreationalActivity, Animal animal) {
        System.out.println(animal.getName() + " mood level is " + animal.getMoodLevel() + "/10");
        System.out.println(getName() + " is playing catch with " + animal.getName() + ".");


        if (recreationalActivity.getName() == animal.getActivityPreferred()) {
            System.out.println(animal.getName() + " loves to " + animal.getActivityPreferred() + ". He is much happier now.");
            animal.setMoodLevel(animal.getMoodLevel() + 2);
            System.out.println(animal.getName() + " mood level is now " + animal.getMoodLevel() + "/10.");
            return;
        }
        System.out.println(animal.getName() + " current mood level is: " + animal.getMoodLevel());
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
