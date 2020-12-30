package com.example.waterfee;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class home_segment extends Fragment {
    ViewGroup viewGroup;
    RecyclerView mRecyclerView;
    floorAdapter mAdapter = null ;
    ArrayList<floorData> mList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.home_segment, container,false);

        mRecyclerView = viewGroup.findViewById(R.id.floorList) ;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new floorAdapter(mList, getActivity()) ;
        mRecyclerView.setAdapter(mAdapter) ;

        // < -- 파이어 베이스 정보 입력란 -- >
        addItem(null, "1층", "이신형 등 3명") ;
        addItem(null, "2층", "이신형 등 3명") ;
        addItem(null, "3층", "이신형 등 3명") ;
        addItem(null, "4층", "이신형 등 3명") ;
        addItem(null, "5층", "이신형 등 3명") ;
        addItem(null, "6층", "이신형 등 3명") ;
        addItem(null, "7층", "이신형 등 3명") ;
        addItem(null, "8층", "이신형 등 3명") ;
        addItem(null, "9층", "이신형 등 3명") ;
        addItem(null, "10층", "이신형 등 3명") ;
        addItem(null, "11층", "이신형 등 3명") ;
        addItem(null, "12층", "이신형 등 3명") ;
        // !< -- 파이어 베이스 정보 입력란 -- >

        mAdapter.notifyDataSetChanged() ;

        return viewGroup;
    }

    public void addItem(Drawable icon, String floorNum, String name) {
        floorData item = new floorData();

        item.setIcon(icon);
        item.setFloorNum(floorNum);
        item.setName(name);

        mList.add(item);
    }

}
