package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Animal animal = new Animal();
                animal.name = "Rex";
                animal.age = 3;
                animal.healthLevel = 7;
                animal.hungerLevel = 5;
                animal.moodLevel = 6;
                animal.foodPreferred = "Meat";
                animal.activityPreferred = "Catch the stick";

         AnimalFood animalFood = new AnimalFood();
            animalFood.name = "Meat";
            animalFood.price = 12.5;
            animalFood.quantity = 1.5;
            animalFood.expiryDate = LocalDateTime.of(2019, 9, 13, 12, 00);
            animalFood.inStock = true;


          RecreationalActivity recreationalActivity = new RecreationalActivity();
            recreationalActivity.name = "Walk";

           Rescuer rescuer = new Rescuer();
                rescuer.name = "Cristi";
                rescuer.money = 55;

            VeterinaryDoctor veterinaryDoctor = new VeterinaryDoctor();
                veterinaryDoctor.name = "Doctor Steve";
                veterinaryDoctor.doctorSpeciality = "Veterinary Medicine";












    }
}
