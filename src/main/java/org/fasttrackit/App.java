package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Animal animal = new Animal("Rex");
        animal.age = 3;
        animal.healthLevel = 7;
        animal.hungerLevel = 5;
        animal.moodLevel = 6;
        animal.foodPreferred = "Meat";
        animal.activityPreferred = "Catch the stick";

        AnimalFood animalFood = new AnimalFood("Dogs", false);
        animalFood.name = "Meat";
        animalFood.price = 12.5;
        animalFood.quantity = 1.5;
        animalFood.expiryDate = LocalDateTime.of(2019, 9, 13, 12, 0);
        animalFood.inStock = true;


        RecreationalActivity recreationalActivity = new RecreationalActivity("Walk");

        Rescuer rescuer = new Rescuer("Cristi", 55);


        VeterinaryDoctor veterinaryDoctor = new VeterinaryDoctor("Doctor Steve", 7);
        veterinaryDoctor.doctorSpeciality = "Veterinary Medicine";


    }
}
