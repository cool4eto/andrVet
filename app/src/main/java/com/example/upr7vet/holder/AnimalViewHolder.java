package com.example.upr7vet.holder;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upr7vet.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Field;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView name;
    private TextView type;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.imageView);
        name=itemView.findViewById(R.id.textView);
        type=itemView.findViewById(R.id.textView2);
    }
    public void setImage(String url) {//tuk trqbwa da go oprawq :3
       // Uri Path = Uri.parse("android.resource://com.example.upr7vet/drawable/"+url);
        Picasso.get().load(url).error(R.drawable.koala).into(image);
    }

    public void setName(String name) {//ne e avtomatichno generirano
        this.name.setText(name);
    }

    public void setType(String type) {//ne e avtomatichno generirano
        this.type.setText(type);
    }
}
