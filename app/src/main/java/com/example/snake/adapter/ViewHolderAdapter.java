package com.example.snake.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snake.R;

public class ViewHolderAdapter extends RecyclerView.ViewHolder {

    TextView position, score, timeOfGame;

    public ViewHolderAdapter(@NonNull View itemView) {
        super(itemView);
        position = itemView.findViewById(R.id.position);
        score = itemView.findViewById(R.id.score);
        timeOfGame = itemView.findViewById(R.id.timeOfGame);
    }
}

