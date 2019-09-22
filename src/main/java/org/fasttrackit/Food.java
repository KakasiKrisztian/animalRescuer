package org.fasttrackit;

import java.time.LocalDateTime;

public class Food {
    private String name;
    private double price;
    private double quantity;
    private boolean inStock;
    private java.time.LocalDateTime expiryDate;

    //optional
    private String manufacturer;
    private boolean bioFood;
    private boolean allergyProducingFood;
    private String foodType;

    public Food(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isBioFood() {
        return bioFood;
    }

    public void setBioFood(boolean bioFood) {
        this.bioFood = bioFood;
    }

    public boolean isAllergyProducingFood() {
        return allergyProducingFood;
    }

    public void setAllergyProducingFood(boolean allergyProducingFood) {
        this.allergyProducingFood = allergyProducingFood;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
