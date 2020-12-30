package com.example.waterfee;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waterfee.R;
import com.example.waterfee.roomAdapter;
import com.example.waterfee.roomData;

import java.util.ArrayList;
import java.util.List;

public class floorSegment extends Fragment {

    RecyclerView recyclerView;
    Button backBtn;
    List<roomData> roomDataList;
    ViewGroup viewGroup;

    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.floorsegment,container,false);

        backBtn = viewGroup.findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_segment fragment = new home_segment();
                ((MainActivity)getActivity()).getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout, fragment).commitAllowingStateLoss();
            }
        });

        recyclerView = viewGroup.findViewById(R.id.roonNumList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity())) ;

        initData();
        setRecyclerView();

        return viewGroup;
    }

    private void setRecyclerView() {
        roomAdapter myAdapter = new roomAdapter(roomDataList, viewGroup);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);
        myAdapter.notifyDataSetChanged() ;
    }

    private void initData() {

        roomDataList = new ArrayList<>();

        int checked = Integer.parseInt(String.valueOf(R.drawable.check));
        int Unchecked = Integer.parseInt(String.valueOf(R.drawable.check));

        int good = Integer.parseInt(String.valueOf(R.drawable.water_96px));
        int bad = Integer.parseInt(String.valueOf(R.drawable.badwater_96px));

        // < -- 파이어베이스 및 데이터베이스 등록자 정보를 불러옴 -- >
        roomDataList.add(new roomData(checked, good,"201호", "2020-08-28 ~ 2020-09-01", "이신형 등 3명", "매우 좋음", "0.3t"));
        roomDataList.add(new roomData(checked, bad, "202호", "2020-08-28 ~ 2020-09-02","이대호 등 2명", "매우 나쁨", "2.8t"));
        roomDataList.add(new roomData(checked, good,"203호", "2020-08-28 ~ 2020-09-04", "변형민 등 4명", "매우 나쁨", "0.3t"));
        roomDataList.add(new roomData(checked, good,"204호","2020-08-28 ~ 2020-09-04", "유견호 등 4명", "매우 좋음", "0.3t"));
        roomDataList.add(new roomData(checked, good,"205호","2020-08-28 ~ 2020-09-08", "박상석 등 5명", "나쁨", "0.3t"));
        // < !-- <> -- >
    }

}
