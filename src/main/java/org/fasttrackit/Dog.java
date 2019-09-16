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
    public void showMoodLevel() {
        if (getMoodLevel() > 6) {
            System.out.println(getName() + " mood is at " + getMoodLevel() + "/10");
            System.out.println(getName() + " is happy now. He is shaking his tail.");
        } else {
            System.out.println(getName() + " mood is at " + getMoodLevel() + "/10");
            System.out.println(getName() + " is sad now. Please try to cheer him up.");
        }
    }

    public Dog(String name, String dogRace) {
        super(name);
        this.dogRace = dogRace;
    }
}

