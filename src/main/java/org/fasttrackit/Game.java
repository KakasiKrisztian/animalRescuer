package org.fasttrackit;

import java.io.DataInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Rescuer rescuer;
    VeterinaryDoctor veterinaryDoctor;
    private Animal animal;
    private List<AnimalFood> availableAnimalFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[4];

//    public Game(Rescuer rescuer, VeterinaryDoctor veterinaryDoctor, Animal dog) {
//        this.rescuer = rescuer;
//        this.veterinaryDoctor = veterinaryDoctor;
//        this.dog = dog;
//    }

    public void start() {
//        initActivities();
//        foodNames();
//        availableActivities();
        Scanner scanner = new Scanner(System.in);
        Rescuer rescuer = initRescuerAndDifficulty();
        initFood();
        initAnimal();
        System.out.println("If you keep your pet happy and feed today you win. You have 12 hours left");
        System.out.println("If his mood level drops under 2 or his hunger reaches 10 you lose.");
        System.out.println("If your budget gets under 15$ you lose.");
        boolean winnerNotKnown = true;
        while (winnerNotKnown) {
            for (int i = 0; i <= 12; i++) {
                if (animal.getMoodLevel() < 2 || animal.getHungerLevel() == 10) {
                    winnerNotKnown = false;
                    System.out.println("You have not taken good care of your pet and the shelter took it from you.");
                    System.out.println("Game over.");
                    break;
                } else if (rescuer.getMoney() < 15) {
                    winnerNotKnown = false;
                    System.out.println("You don't have enough money for you and the pet.");
                    System.out.println("Game over");
                    break;

                } else {
                    System.out.println("Hours passed: " + i + "/12");
                    System.out.println("Your money left are: " + rescuer.getMoney() +
                            ". Be carefull to not spend all your money. If you are low on money you can go to work.");
                    System.out.println("You can chose what to do in the next hour:");
                    System.out.println("1. Feed your pet.");
                    System.out.println("2. Play with your pet");
                    System.out.println("3. Go to work");
                    System.out.println("4. Show pet and your stats.");
                    int chosenOption = chosenOptionByUser();
                    if (chosenOption == 1) {
                        requireFeeding();
                    } else if (chosenOption == 2) {
                        requirePlayingWithYourPet();
                    } else if (chosenOption == 3) {
                        goToWork();
                    } else {
                        System.out.println("Looks like you just spent a precious hour making a social inventory:");
                        showStats();
                    }
                }
            }
            if (winnerNotKnown){
                conclusion();
            }else {
                System.out.println();
            }

            }


        }


        public boolean conclusion(){
        boolean winnerNotKnown;
        if (animal.getMoodLevel() >= 8 && animal.getHungerLevel() <= 4) {
            System.out.println("You have succesfully rescued " + animal.getName());
            System.out.println("You have won!");
            return winnerNotKnown = false;

        } else if (rescuer.getMoney() < 15) {
            System.out.println("You do not have enough money to rescue your pet.");
            System.out.println("Game over.");
            return winnerNotKnown = false;
        } else {
            System.out.println("You barely managed to keep you and the pet alive");
            System.out.println("Let's say that you survived today!");
            System.out.println("Game over!");
            return winnerNotKnown = false;
        }
    }





    private void initAnimal() {
        int animalChosen = getAnimalChoiceFromUser();
        String name = nameAnimal();
        if (animalChosen <= 1) {
            System.out.println("You have chosen to take care of this cute dog.");
            animal = new Dog(name, "Husky");
            animal.setMoodLevel(4);
            animal.setScaredLevel(8);
            animal.setLoyalty(2);
            animal.setHungerLevel(9);
            animal.setHealthLevel(6);
            animal.setFoodPreferred("Meat");
            animal.setAge(4);
            animal.setEnergyLevel(7);
            animal.setActivityPreferred("play catch");
            animal.setToiletNeed(4);
            System.out.println("The name of your new dog is: " + name);
            System.out.println();
            System.out.println("The stats of " + animal.getName() + " are:");
            System.out.println("Age: " + animal.getAge());
            System.out.println("Preferred food: " + animal.getFoodPreferred());
            System.out.println("Activity preferred: " + animal.getActivityPreferred());
            System.out.println("Mood level: " + animal.getMoodLevel() + "/10");
            System.out.println("Scared level: " + animal.getScaredLevel() + "/10");
            System.out.println("Loyalty level: " + animal.getLoyalty() + "/10");
            System.out.println("Hunger level: " + animal.getHungerLevel() + "/10");
            System.out.println("Health level: " + animal.getHealthLevel() + "/10");
            System.out.println("Energy level: " + animal.getEnergyLevel() + "/10");
            System.out.println("Toilet need level: " + animal.getToiletNeed() + "/10");
        } else {
            System.out.println("You have chosen to take care of this fluffy cat.");
            animal = new Cat(name, "Munchkin");
            animal.setMoodLevel(6);
            animal.setHungerLevel(7);
            animal.setActivityPreferred("play with a ball");
            animal.setLoyalty(4);
            animal.setAge(2);
            animal.setFoodPreferred("Beans");
            animal.setToiletNeed(6);
            animal.setHealthLevel(9);
            animal.setEnergyLevel(8);
            animal.setScaredLevel(5);
            System.out.println("The name of your new cat is: " + name);
            System.out.println();
            System.out.println("The stats bars of " + animal.getName() + " are:");
            System.out.println("Age: " + animal.getAge());
            System.out.println("Activity preferred: " + animal.getActivityPreferred());
            System.out.println("Preferred food: " + animal.getFoodPreferred());
            System.out.println("Mood level: " + animal.getMoodLevel() + "/10");
            System.out.println("Hunger level: " + animal.getHungerLevel() + "/10");
            System.out.println("Loyalty level: " + animal.getLoyalty() + "/10");
            System.out.println("Toilet need: " + animal.getToiletNeed() + "/10");
            System.out.println("Health level: " + animal.getHealthLevel() + "/10");
            System.out.println("Energy level: " + animal.getEnergyLevel() + "/10");
            System.out.println("Scared level: " + animal.getScaredLevel() + "/10");
        }
    }

    public void goToWork(){
        System.out.println("You chose to go to work this hour. You gained 50$.");
        rescuer.setMoney(rescuer.getMoney()+50);
        animal.setMoodLevel(animal.getMoodLevel()-1);
        System.out.println("Your pet missed you. His mood level is now " + animal.getMoodLevel() + "/10");
    }

    public void showStats(){
        System.out.println("Your stats are:");
        System.out.println("Budget: " + rescuer.getMoney());
        System.out.println("Your pet stats are:");
        System.out.println("Hunger: " + animal.getHungerLevel() + "/10");
        System.out.println("Mood level: " + animal.getMoodLevel() + "/10");
    }


    private int getAnimalChoiceFromUser() {
        System.out.println("Please select the type of animal would you like to take care of: Option 1 - Dog or Option 2 - Cat.");
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid option number.");
            return getAnimalChoiceFromUser();
        }
        if (x > 2 | x <= 0) {
            System.out.println("You have entered an invalid option number");
            getAnimalChoiceFromUser();
        } else {
            System.out.println("You have chosen option " + x);
            return x;
        }
        return x;
    }


    private Rescuer initRescuerAndDifficulty() {
        String rescuerNameChosen = rescuerNameChosenByUser();
        int budget = chosenDifficultyByUser();
        if (budget == 1) {
            budget = 150;
        } else if (budget == 2) {
            budget = 100;
        } else if (budget == 3){
            budget = 75;
        }
        else {
            initRescuerAndDifficulty();
        }
        System.out.println("Your name is: " + rescuerNameChosen + ". Your budget is: " + budget + ". Be careful how you spend your money.");
        return rescuer = new Rescuer(rescuerNameChosen, budget);


    }

    private String rescuerNameChosenByUser() {
            System.out.println("Please enter your name.");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            while(!name.matches("[a-zA-Z]+")) {
                System.out.println("You have entered an invalid name");
                name = scanner.nextLine();
            }
            return name;


    }

    private int chosenDifficultyByUser() {
        System.out.println("Please choose the difficulty on which you want to play: 1, 2 or 3.");
        Scanner scanner = new Scanner(System.in);
        int y = 0;
        //poate nu prinde string
        try {
            y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered a word!");
            chosenDifficultyByUser();
        }
        if (y >= 4 || y <= 0) {
            System.out.println("You have entered an invalid option number.");
            chosenDifficultyByUser();
        } else {
            System.out.println("You have chosen difficulty: " + y);

        }
        return y;

    }
    private int chosenOptionByUser() {
        System.out.println("Please choose one of the options: 1, 2, 3 or 4.");
        Scanner scanner = new Scanner(System.in);
        int y = 0;
        //poate nu prinde string
        try {
            y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid option number.");
            chosenDifficultyByUser();
        }
        if (y >= 5 || y <= 0) {
            System.out.println("You have entered an invalid option number.");
            chosenDifficultyByUser();
        } else {
            System.out.println("You have chosen option: " + y);
        }
        return y;

    }

    private String nameAnimal() {
        System.out.println("Please choose a name for your new pet.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while(!name.matches("[a-zA-Z]+")) {
            System.out.println("You have entered an invalid name");
            name = scanner.nextLine();
        }
        return name;


    }

    private void requirePlayingWithYourPet() {
        System.out.println();
        System.out.println(animal.getName() + " looks bored. You chose play with your pet.");
        initActivities();
        printAvailableActivities();
        int x = getActivityChoiceFromUser();
        if (rescuer.getMoney() > 15) {
            rescuer.setMoney(rescuer.getMoney() - 15);
            rescuer.play(availableActivities[x], animal);
            System.out.println("Having an activity with your per costs 15$. Your budget is now: " + rescuer.getMoney() + "$");
        }else {
            System.out.println("You do not have enough money to have an activity with your pet.");
        }


    }

    private int getActivityChoiceFromUser() {
        Scanner scanner = new Scanner(System.in);
        int y;
        try {
            y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid option.");
            return getActivityChoiceFromUser();
        }
        if (y < 1 || y > 4) {
            System.out.println("You have entered an invalid option number.");
            getActivityChoiceFromUser();
        }
        System.out.println("You have chosen activity number " + y);
        return y - 1;
    }

    private void requireFeeding() {
        System.out.println();
        System.out.println(animal.getName() + " looks hungry. You chose to feed him.");
        foodNames();
        int x = getFeedingOptionFromUser();
        if (x == 2) {
            System.out.println("You have chosen to not feed your pet at this time.");
            return;
        }

        if (rescuer.getMoney() > 25) {
            rescuer.setMoney(rescuer.getMoney() - availableAnimalFood.get(x).getPrice());
            rescuer.feedPet(animal, availableAnimalFood.get(x));
            System.out.println("Feeding costs " + availableAnimalFood.get(x).getPrice() + ". Your budget is now: " + rescuer.getMoney() + "$");
        } else {
            System.out.println("You do not have enough money to feed your pet.");
        }

    }

    private int getFeedingOptionFromUser() {
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid option number.");
            return getFeedingOptionFromUser();
        }
        if (x < 1 || x > 3) {
            System.out.println("You have entered an invalid option number.");
            return getFeedingOptionFromUser();
        }
        System.out.println("You have chosen option " + x);
        return x - 1;

    }


    private void initFood() {
        AnimalFood animalFood1 = new AnimalFood("Meat", 25, 1, "Dogs", false);
        availableAnimalFood.add(animalFood1);

        AnimalFood animalFood2 = new AnimalFood("Beans", 20, 1, "Cat", true);
        availableAnimalFood.add(animalFood2);
    }


    public void initActivities() {
        RecreationalActivity recreationalActivity1 = new RecreationalActivity("walking");
        availableActivities[0] = recreationalActivity1;

        RecreationalActivity recreationalActivity2 = new RecreationalActivity("exploring some new places");
        availableActivities[1] = recreationalActivity2;

        RecreationalActivity recreationalActivity3 = new RecreationalActivity("playing catch");
        availableActivities[2] = recreationalActivity3;

        RecreationalActivity recreationalActivity4 = new RecreationalActivity("talking");
        availableActivities[3] = recreationalActivity4;

    }

    private void foodNames() {
        System.out.println("The available foods to feed your animal are:");
        for (int i = 0; i <= availableAnimalFood.size(); i++) {
            int x = i;
            if (i == 0) {
                System.out.println("Option " + (x + 1) + " is: " + availableAnimalFood.get(i).getName());
            } else if (i == 1) {
                System.out.println("Option " + (x + 1) + " is: " + availableAnimalFood.get(i).getName());
            } else {
                System.out.println("Option " + (x + 1) + " is: You can choose to not feed the pet right now");
            }
        }
    }

    private void printAvailableActivities() {
        System.out.println("The available activities are: ");
        for (int i = 0; i < availableActivities.length; i++) {
            int x = i;
            System.out.println("Option " + (x + 1) + " is: " + availableActivities[i].getName());
        }
    }


}

