package sg.edu.np.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder>{
    ArrayList<User> data;
    ListActivity activity;


    public Adapter (ArrayList<User> input){
        data = input;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item;
        User u = data.get(viewType);

        if (u.getName().endsWith("7")==true){
            item = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,parent,false);
        }
        else{
            item = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item,parent,false);
        }

        item.findViewById(R.id.imageView3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.profileView(u);
            }
        });
        return new ViewHolder(item);
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        User u = data.get(position);
        holder.txt1.setText(u.getName());
        holder.txt2.setText(u.getDesc());
    }

    public int getItemCount(){
        return data.size();
    }

    @Override
    public int getItemViewType(int position){
        return super.getItemViewType(position);
    }
}
