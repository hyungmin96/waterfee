package com.example.waterfee;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class floorAdapter extends RecyclerView.Adapter<floorAdapter.ViewHolder> {

    private ArrayList<floorData> mData = null ;
    private Context mContext;
        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView icon ;
            TextView roomNum, name ;
            Button searchBtn;

            ViewHolder(final View itemView) {
                super(itemView) ;

                icon = itemView.findViewById(R.id.icon) ;
                roomNum = itemView.findViewById(R.id.roomNum) ;
                name = itemView.findViewById(R.id.name) ;
                searchBtn = itemView.findViewById(R.id.searchBtn) ;

                searchBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        floorSegment fragment = new floorSegment();
                        ((MainActivity)mContext).getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout, fragment).commitAllowingStateLoss();
                    }
                });

            }
        }

    floorAdapter(ArrayList<floorData> list, Context mContext) {
        mData = list ;
        this.mContext = mContext;
    }

    @Override
    public floorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.floor_row, parent, false) ;
        floorAdapter.ViewHolder vh = new floorAdapter.ViewHolder(view) ;

        return vh ;
    }

    @Override
    public void onBindViewHolder(floorAdapter.ViewHolder holder, int position) {

        floorData item = mData.get(position) ;

        //holder.icon.setImageDrawable(item.getIcon()) ;
        holder.roomNum.setText(item.getFloorNum()) ;
        holder.name.setText(item.getName()) ;

    }

    @Override
    public int getItemCount() {
        return mData.size() ;
    }

}
