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

        AnimalFood animalFood2 = new AnimalFood("Whiskas", 10, 1, "Cats", false );

        Doctor doctor = new Doctor("Doctor Mike");
        doctor.setAvailability(true);
        doctor.setDoctorSpeciality("Family medicine");
        doctor.setOtherClients(false);
        doctor.setPriceForServices(10);

        Food food = new Food("Hamburger", 5, 0.5);

        RecreationalActivity recreationalActivity = new RecreationalActivity("Walk");

        Rescuer rescuer = new Rescuer("Cristi", 55);


        VeterinaryDoctor veterinaryDoctor = new VeterinaryDoctor("Doctor Steve", 7);
        veterinaryDoctor.setDoctorSpeciality("Veterinary Medicine");

        Game game = new Game(rescuer, veterinaryDoctor, animal);

        RescuerFriend rescuerFriend = new RescuerFriend("Reed");
        rescuerFriend.setAge(18);

        Tamer tamer = new Tamer("Michael", 15);

        Toy toy = new Toy("Fluffy ball", 5);

        Animal dog = new Dog("Puffy", "German Sheppard");
        dog.setActivityPreferred("Long runs");
        dog.setAge(2);
        dog.setEnergyLevel(9);
        dog.setFoodPreferred("Raw meat");
        dog.setHealthLevel(10);
        dog.setHungerLevel(7);
        dog.setLoyalty(9);
        dog.setMoodLevel(8);
        dog.setScaredLevel(2);

        Animal cat = new Cat("Mushroom", "Egyptian Cat");
        cat.setMoodLevel(6);
        cat.setHungerLevel(4);
        cat.setActivityPreferred("Play with a fur ball");
        cat.setFoodPreferred("Marinated pieces of beef");
        cat.setAge(5);
        cat.setHealthLevel(8);


        rescuer.feedPet(animal, animalFood);

        rescuer.playCatch(rescuer, animal);

        animal.showMoodLevel(animal);

        dog.showMoodLevel(dog);

        dog.setMoodLevel(3);

        dog.showMoodLevel(dog);

        cat.showMoodLevel(cat);

        cat.setMoodLevel(8);

        cat.showMoodLevel(cat);

        rescuer.feedPet(dog, animalFood);

        rescuer.feedPet(cat, animalFood2);


    }
}
