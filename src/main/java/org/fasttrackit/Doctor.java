package org.fasttrackit;

public class Doctor {
    String name;
    String doctorSpeciality;

    //optional
    boolean otherClients;
    boolean availability;
    double priceForVetServices;

    public Doctor(String name) {
        this.name = name;
    }
}
