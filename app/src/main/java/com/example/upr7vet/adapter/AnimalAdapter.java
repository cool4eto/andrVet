package com.example.upr7vet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upr7vet.R;
import com.example.upr7vet.holder.AnimalViewHolder;
import com.example.upr7vet.model.Animal;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<Animal> animals;

    public AnimalAdapter(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View canimalView = inflater.inflate(R.layout.animal_item, parent, false);

        return new AnimalViewHolder(canimalView);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.setName(animal.getName());
        holder.setType(animal.getType());
        holder.setImage(animal.getImageURL());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
    public void addAnimal(Animal animal) {//dopulnitelno dobaweno
        animals.add(0, animal);
        notifyItemChanged(0);
    }
}
