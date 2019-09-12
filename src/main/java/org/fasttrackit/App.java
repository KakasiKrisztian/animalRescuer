package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Animal animal = new Animal("Rex");
        animal.setAge(3);
        animal.setHealthLevel(7);
        animal.setHungerLevel(5);
        animal.setMoodLevel(6);
        animal.setFoodPreferred("Meat");
        animal.setActivityPreferred("Catch the stick");

        AnimalFood animalFood = new AnimalFood("Pedigree", 20, 1, "Dogs", false);
        animalFood.setExpiryDate(LocalDateTime.of(2019, 12, 9, 12, 0));
        animalFood.setInStock(true);


        RecreationalActivity recreationalActivity = new RecreationalActivity("Walk");

        Rescuer rescuer = new Rescuer("Cristi", 55);


        VeterinaryDoctor veterinaryDoctor = new VeterinaryDoctor("Doctor Steve", 7);
        veterinaryDoctor.setDoctorSpeciality("Veterinary Medicine");

        rescuer.feedPet(animal, animalFood);

        rescuer.playCatch(rescuer, animal);


    }
}
