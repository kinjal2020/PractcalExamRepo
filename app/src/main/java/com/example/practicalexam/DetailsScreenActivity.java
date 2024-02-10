package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailsScreenActivity extends AppCompatActivity {
    TextView titleToy, toyPrice, toyDec, toyRate;
    ImageView toyImage;
    List<ToyModelClass> cartList = new ArrayList<>();

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);
        initBinding();
        titleToy.setText(getIntent().getStringExtra("title"));
//        toyPrice.setText(getIntent().getIntExtra("price", 0));
//        toyPrice.setText(getIntent().getIntExtra("rate", 0));
        toyDec.setText(getIntent().getStringExtra("des"));

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartList.add(new ToyModelClass())
            }
        });

    }

    private void initBinding() {
        titleToy = findViewById(R.id.toyName);
        toyPrice = findViewById(R.id.toyPrice);
        toyDec = findViewById(R.id.toyDes);
        toyRate = findViewById(R.id.toyRate);
        layout = findViewById(R.id.cartLayout);
//        delete = findViewById(R.id.delete);
    }
}