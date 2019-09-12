package org.fasttrackit;

public class Doctor {
    private String name;
    private String doctorSpeciality;

    //optional
    private boolean otherClients;
    private boolean availability;
    private double priceForServices;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public boolean isOtherClients() {
        return otherClients;
    }

    public void setOtherClients(boolean otherClients) {
        this.otherClients = otherClients;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getPriceForServices() {
        return priceForServices;
    }

    public void setPriceForServices(double priceForVetServices) {
        this.priceForServices = priceForVetServices;
    }
}
