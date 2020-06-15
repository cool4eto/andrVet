package com.example.upr7vet.model;

public class Animal {
    private String name;
    private String type;
    private String imageURL;

    public Animal(String name, String type, String imageURL) {
        this.name = name;
        this.type = type;
        this.imageURL = "android.resource://com.example.upr7vet/drawable/"+imageURL;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getImageURL() {
        return imageURL;
    }
}
