package com.example.upr7vet.data;

import com.example.upr7vet.model.Animal;

import java.util.ArrayList;

public class AnimalSource {
    ArrayList<Animal> animals;
    public AnimalSource()
    {
        animals=new ArrayList<Animal>();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
