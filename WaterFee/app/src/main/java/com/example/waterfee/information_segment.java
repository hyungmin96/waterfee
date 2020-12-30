package com.example.waterfee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.waterfee.R;


public class information_segment extends Fragment {
    ViewGroup viewGroup;
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.information_segment,container,false);
        return viewGroup;
    }

}
