package org.fasttrackit;

public class VeterinaryDoctor extends Doctor {
    int abilityToCalmTheAnimal;
    // If this ability is > than the scaredLevel of the animal then he can treat the animal


    public VeterinaryDoctor(String name, int abilityToCalmTheAnimal) {
        super(name);
        this.abilityToCalmTheAnimal = abilityToCalmTheAnimal;
    }
}
