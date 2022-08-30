package com.example.snake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.snake.Db.DbManager;
import com.example.snake.Model.Model;
import com.example.snake.adapter.AdapterResult;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private ArrayList<Model> listOfModel = new ArrayList<Model>();
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        recycler = findViewById(R.id.listResult);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        connectDb();
    }

    private void setAdapter(){
        AdapterResult adapterResult = new AdapterResult(listOfModel);
        recycler.setAdapter(adapterResult);
    }

    private void connectDb() {
        DbManager db = new DbManager(this);
        db.open();
        listOfModel = (ArrayList<Model>) db.getModel();
        if (!listOfModel.isEmpty()){
            setAdapter();
        }
        db.close();
    }
}