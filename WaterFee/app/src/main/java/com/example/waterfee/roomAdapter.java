package com.example.waterfee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class roomAdapter extends RecyclerView.Adapter<roomAdapter.roomAdapterVH> {

    private List<roomData> roomDataList;

    public roomAdapter(List<roomData> roomDataList, ViewGroup viewGroup) {
        this.roomDataList = roomDataList;
    }

    public class roomAdapterVH extends RecyclerView.ViewHolder{

        TextView roomNum, name, level, days2, usedLevel;
        ImageView imageView2, imageView3;

        Button searchBtn2;
        ConstraintLayout con1, con2;

        public roomAdapterVH(@NonNull View itemView) {
            super(itemView);

            roomNum = itemView.findViewById(R.id.roomNum);
            name = itemView.findViewById(R.id.name);
            level = itemView.findViewById(R.id.level);
            days2 = itemView.findViewById(R.id.days2);
            usedLevel = itemView.findViewById(R.id.usedLevel);

            imageView2 = itemView.findViewById(R.id.imageView2);
            imageView3 = itemView.findViewById(R.id.imageView3);

            searchBtn2 = itemView.findViewById(R.id.searchBtn2);

            con1 = itemView.findViewById(R.id.con1);
            con2 = itemView.findViewById(R.id.con2);

            searchBtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    roomData roomData = roomDataList.get(getAdapterPosition());
                    roomData.setExpandable(!roomData.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }

    }

    @NonNull
    @Override
    public roomAdapter.roomAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_row, parent, false);
        return new roomAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull roomAdapter.roomAdapterVH holder, int position) {
        roomData mData = roomDataList.get(position);
        holder.roomNum.setText(mData.getRoomNum());
        holder.name.setText(mData.getName());
        holder.level.setText(mData.getWaterLevel());
        holder.days2.setText(mData.getDay());
        holder.usedLevel.setText(mData.getUseLevel());
        holder.imageView3.setImageResource(mData.getImg2());

        boolean isExpanable = roomDataList.get(position).isExpandable();
        holder.con2.setVisibility(isExpanable ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return roomDataList.size();
    }

}
