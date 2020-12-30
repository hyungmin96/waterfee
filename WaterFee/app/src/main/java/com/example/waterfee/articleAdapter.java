package com.example.waterfee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class articleAdapter extends RecyclerView.Adapter<articleAdapter.roomAdapterVH> {

    private List<articleData> articlesData;

    public articleAdapter(List<articleData> articlesData) {
        this.articlesData = articlesData;
    }

    public class roomAdapterVH extends RecyclerView.ViewHolder{

        TextView titleView, contentView, dateView;

        public roomAdapterVH(@NonNull View itemView) {
            super(itemView);

            titleView = itemView.findViewById(R.id.titleView);
            contentView = itemView.findViewById(R.id.contentView);
            dateView = itemView.findViewById(R.id.dateView);
        }
    }

    @NonNull
    @Override
    public articleAdapter.roomAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article, parent, false);
        return new roomAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull articleAdapter.roomAdapterVH holder, int position) {
        articleData mData = articlesData.get(position);
        holder.titleView.setText(mData.get_title());
        holder.contentView.setText(mData.get_content());
        holder.dateView.setText(mData.getDate());

    }

    @Override
    public int getItemCount() {
        return articlesData.size();
    }

}
