package com.example.snake.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snake.Model.Model;
import com.example.snake.R;

import java.util.ArrayList;

public class AdapterResult extends RecyclerView.Adapter<ViewHolderAdapter> {

    ArrayList<Model> list;

    public AdapterResult(ArrayList<Model> newList){
        this.list = newList;
    }

    @NonNull
    @Override
    public ViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_result, parent, false);
        return new ViewHolderAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdapter holder, int position) {


        holder.position.setText(String.valueOf(list.get(position).getId()));
        holder.score.setText(String.valueOf(list.get(position).getScores()));
        holder.timeOfGame.setText(list.get(position).getDate());


    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
