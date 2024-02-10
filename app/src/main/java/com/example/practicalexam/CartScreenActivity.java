package com.example.practicalexam;

import static com.example.practicalexam.DetailsScreenActivity.cartList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CartScreenActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_screen);
        initBinding();
        CustomCartAdapter adapter = new CustomCartAdapter(this, cartList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(lm);
    }
    private void initBinding() {
        recyclerView = findViewById(R.id.cart_list_view);
    }
}