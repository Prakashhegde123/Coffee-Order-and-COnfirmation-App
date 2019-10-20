package com.example.ca;

public class Coffee {
    private String coffeeName;
    private int coffeeImage;
    private String coffeeDescription;


    public Coffee(String coffeeName, int coffeeImage, String coffeeDescription) {
        this.coffeeName = coffeeName;
        this.coffeeImage = coffeeImage;
        this.coffeeDescription = coffeeDescription;
    }

    private int imageId;

    public Coffee(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCoffeeImage() {
        return coffeeImage;
    }

    public String getCoffeeDescription() {
        return coffeeDescription;
    }

}
