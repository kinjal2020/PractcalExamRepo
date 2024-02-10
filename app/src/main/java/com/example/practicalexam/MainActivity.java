package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ImageView add;
    List<ToyModelClass> toyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();

        toyList.add(new ToyModelClass("Toys", "toy description", 32.50, 4.2));
        toyList.add(new ToyModelClass("Toy Car", "toy  car description", 32.50, 4.2));
        toyList.add(new ToyModelClass("Toy Aeroplane", "toy  car description", 32.50, 4.2));
        toyList.add(new ToyModelClass("Motor Cycle", "toy  car description", 32.50, 4.2));

        CustomAdapter adapter = new CustomAdapter(this, toyList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(lm);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartScreenActivity.class);
                startActivity(intent);

            }
        });
    }

    private void initBinding() {
        recyclerView = findViewById(R.id.list_view);
        add = findViewById(R.id.add);
    }
}