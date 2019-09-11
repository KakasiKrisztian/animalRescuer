package org.fasttrackit;

public class Tamer {
    //This is a optional class
    private String name;
    private double priceForTamingServices;
    private int experienceInTamingLevel;

    public Tamer(String name, double priceForTamingServices) {
        this.name = name;
        this.priceForTamingServices = priceForTamingServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceForTamingServices() {
        return priceForTamingServices;
    }

    public void setPriceForTamingServices(double priceForTamingServices) {
        this.priceForTamingServices = priceForTamingServices;
    }

    public int getExperienceInTamingLevel() {
        return experienceInTamingLevel;
    }

    public void setExperienceInTamingLevel(int experienceInTamingLevel) {
        this.experienceInTamingLevel = experienceInTamingLevel;
    }
}
