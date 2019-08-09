package com.example.c0754254_mad3125_midterm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    private LayoutInflater inflater;

    private List<DataModel> dataList;

    public DataAdapter(Context mCtx, List<DataModel> dataList) {
        inflater = LayoutInflater.from(mCtx);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.data_item, null);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.title.setText(dataList.get(position).title);
        holder.launchYear.setText(dataList.get(position).launchYear);
        Picasso.get().load(dataList.get(position).getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    class DataViewHolder extends RecyclerView.ViewHolder {


        TextView title, launchYear;
        ImageView imageView;

        public DataViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            launchYear = itemView.findViewById(R.id.launchYear);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}




