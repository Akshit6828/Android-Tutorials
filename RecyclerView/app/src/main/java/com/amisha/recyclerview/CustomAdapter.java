package com.amisha.recyclerview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amisha.recyclerview.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    String data[];
    Integer pic[];
    Activity activity;
    CustomAdapter(String data[],Integer pic[],Activity activity){
        this.data=data;
        this.pic=pic;
        this.activity=activity;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mylayout=activity.getLayoutInflater().inflate(R.layout.custom_layout,parent,false);
        MyViewHolder holder=new MyViewHolder(mylayout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img.setImageResource(pic[position]);
        holder.txt.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    //inner class
    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView);
            txt=itemView.findViewById(R.id.textView);
        }
    }
}
