package com.example.waterfee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    home_segment fragment1;
    articles_segment fragment2;
    information_segment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new home_segment();
        fragment2 = new articles_segment();
        fragment3 = new information_segment();

        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment1).commitAllowingStateLoss();
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tab1:{
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout, fragment1).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.tab2:{
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout, fragment2).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.tab3:{
                        getSupportFragmentManager().beginTransaction() .replace(R.id.main_layout, fragment3).commitAllowingStateLoss();
                        return true;
                    }
                    default: return false;
                }
            }
        });

    }


}