package org.fasttrackit;

public class Cat extends Animal {
    private String catRace;


    public String getCatRace() {
        return catRace;
    }

    public void setCatRace(String catRace) {
        this.catRace = catRace;
    }

    @Override
    public void showMoodLevel() {
        if (getMoodLevel() > 6) {
            System.out.println(getName() + " mood is at " + getMoodLevel() + "/10");
            System.out.println(getName() + " is happy now. She purrs from happiness.");
        } else {
            System.out.println(getName() + " mood is at " + getMoodLevel() + "/10");
            System.out.println(getName() + " is sad now. Please try to cheer her up.");
        }
    }

    public Cat(String name, String catRace) {
        super(name);
        this.catRace = catRace;
    }
}
