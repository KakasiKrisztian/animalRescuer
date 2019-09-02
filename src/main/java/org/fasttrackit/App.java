package org.fasttrackit;

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

         AnimalFood animal_food = new AnimalFood();
            animal_food.name = "Meat";
            animal_food.price = 12.5;
            animal_food.quantity = 1.5;
            // animal_food.expiryDate - nu stiu cum trec data?
            animal_food.inStock = true;

          RecreationalActivity recreational_activity = new RecreationalActivity();
            recreational_activity.name = "Walk";

           Rescuer rescuer = new Rescuer();
                rescuer.name = "Cristi";
                rescuer.money = 55;

            VeterinaryDoctor veterinary_doctor = new VeterinaryDoctor();
                veterinary_doctor.name = "Doctor Steve";
                veterinary_doctor.doctorSpeciality = "Veterinary Medicine";












    }
}
