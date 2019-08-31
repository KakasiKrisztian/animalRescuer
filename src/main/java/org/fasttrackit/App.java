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

         Animal_Food animal_food = new Animal_Food();
            animal_food.name = "Meat";
            animal_food.price = 12.5;
            animal_food.quantity = 1.5;
            // animal_food.expiryDate - nu stiu cum trec data?
            animal_food.inStock = true;

          Recreational_Activity recreational_activity = new Recreational_Activity();
            recreational_activity.name = "Walk";

           Rescuer rescuer = new Rescuer();
                rescuer.name = "Cristi";
                rescuer.money = 55;

            Veterinary_Doctor veterinary_doctor = new Veterinary_Doctor();
                veterinary_doctor.name = "Doctor Steve";
                veterinary_doctor.doctorSpeciality = "Veterinary Medicine";












    }
}
