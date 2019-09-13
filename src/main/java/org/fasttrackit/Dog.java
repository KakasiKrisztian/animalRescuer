package org.fasttrackit;

public class Dog extends Animal {
    private String dogRace;


    public String getDogRace() {
        return dogRace;
    }

    public void setDogRace(String dogRace) {
        this.dogRace = dogRace;
    }

    @Override
    public void showMoodLevel(Animal animal) {
        if (animal.getMoodLevel() > 6) {
            System.out.println(animal.getName() + " mood is at " + animal.getMoodLevel() + "/10");
            System.out.println(animal.getName() + " is happy now. He is shaking his tail.");
        } else {
            System.out.println(animal.getName() + " mood is at " + animal.getMoodLevel() + "/10");
            System.out.println(animal.getName() + " is sad now. Please try to cheer him up.");
        }
    }

    public Dog(String name, String dogRace) {
        super(name);
        this.dogRace = dogRace;
    }
}

