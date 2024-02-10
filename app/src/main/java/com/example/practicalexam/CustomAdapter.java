package com.example.practicalexam;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.DataViewHolder> {
    MainActivity activity;
    List<ToyModelClass> toyList;


    CustomAdapter(MainActivity activity, List<ToyModelClass> list) {
        this.toyList = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CustomAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.custom_list_view, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.DataViewHolder holder, int position) {
        holder.title.setText(toyList.get(position).getToyName());
        holder.price.setText(String.valueOf(toyList.get(position).getToyPrice()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, DetailsScreenActivity.class);
                intent.putExtra("title", toyList.get(position).getToyName());
                intent.putExtra("price", toyList.get(position).getToyPrice());
                intent.putExtra("des", toyList.get(position).getDescription());
                intent.putExtra("rate", toyList.get(position).getRate());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return toyList.size();
    }

    class DataViewHolder extends RecyclerView.ViewHolder {
        TextView title, price;
        CardView cardView;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.toyName);
            price = itemView.findViewById(R.id.toyPrice);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
