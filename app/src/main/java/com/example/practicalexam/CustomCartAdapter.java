package com.example.practicalexam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomCartAdapter extends RecyclerView.Adapter<CustomCartAdapter.DataViewHolder> {

    CartScreenActivity activity;
    List<ToyCartModel> toyList;


    CustomCartAdapter(CartScreenActivity activity, List<ToyCartModel> toyList) {
        this.activity = activity;
        this.toyList = toyList;
    }


    @NonNull
    @Override
    public CustomCartAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.custom_cart_screen_view, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomCartAdapter.DataViewHolder holder, int position) {

    }

    class DataViewHolder extends RecyclerView.ViewHolder {
//        TextView title, price;
//        CardView cardView;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
//            title = itemView.findViewById(R.id.toyName);
//            price = itemView.findViewById(R.id.toyPrice);
//            cardView = itemView.findViewById(R.id.cardView);

        }
    }


    @Override
    public int getItemCount() {
        return toyList.size();
    }
}
