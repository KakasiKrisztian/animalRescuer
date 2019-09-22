package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Rescuer rescuer;
    VeterinaryDoctor veterinaryDoctor;
    Animal dog;
    private List<AnimalFood> availableAnimalFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[4];

    public Game(Rescuer rescuer, VeterinaryDoctor veterinaryDoctor, Animal dog) {
        this.rescuer = rescuer;
        this.veterinaryDoctor = veterinaryDoctor;
        this.dog = dog;
    }

    public void start() {
        initFood();
        initActivities();
        foodNames();
        availableActivities();
    }

    public void initFood() {
        AnimalFood animalFood1 = new AnimalFood("Meat", 10, 1, "Dogs", false);
        availableAnimalFood.add(animalFood1);

        AnimalFood animalFood2 = new AnimalFood("Beans", 7, 1, "Cat", true);
        availableAnimalFood.add(animalFood2);
    }

    public void initActivities() {
        RecreationalActivity recreationalActivity1 = new RecreationalActivity("Walk");
        availableActivities[0] = recreationalActivity1;

        RecreationalActivity recreationalActivity2 = new RecreationalActivity("Exploring new places");
        availableActivities[1] = recreationalActivity2;

        RecreationalActivity recreationalActivity3 = new RecreationalActivity("Pet the animal");
        availableActivities[2] = recreationalActivity3;

        RecreationalActivity recreationalActivity4 = new RecreationalActivity("Talk with the animal");
        availableActivities[3] = recreationalActivity4;

    }

    public void foodNames() {
        System.out.println("The available foods to feed your animal are:");
        for (int i = 0; i < availableAnimalFood.size(); i++) {
            System.out.println("-There is: " + availableAnimalFood.get(i).getName());
        }
    }

    public void availableActivities() {
        System.out.println("The available activities are: ");
        for (int i = 0; i < availableActivities.length; i++) {
            System.out.println("Option " + (i + 1) + " is: " + availableActivities[i].getName());
        }
    }


}

