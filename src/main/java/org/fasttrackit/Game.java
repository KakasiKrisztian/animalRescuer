package org.fasttrackit;

public class Game {
    Rescuer rescuer;
    VeterinaryDoctor veterinaryDoctor;
    Animal dog;

    public Game(Rescuer rescuer, VeterinaryDoctor veterinaryDoctor, Animal dog) {
        this.rescuer = rescuer;
        this.veterinaryDoctor = veterinaryDoctor;
        this.dog = dog;
    }
}
