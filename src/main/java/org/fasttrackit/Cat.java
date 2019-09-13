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
    public void showMoodLevel(Animal animal) {
        if (animal.getMoodLevel() > 6) {
            System.out.println(animal.getName() + " mood is at " + animal.getMoodLevel() + "/10");
            System.out.println(animal.getName() + " is happy now. She purrs from happiness.");
        } else {
            System.out.println(animal.getName() + " mood is at " + animal.getMoodLevel() + "/10");
            System.out.println(animal.getName() + " is sad now. Please try to cheer her up.");
        }
    }

    public Cat(String name, String catRace) {
        super(name);
        this.catRace = catRace;
    }
}
