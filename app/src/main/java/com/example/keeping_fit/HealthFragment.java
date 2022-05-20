package com.example.keeping_fit;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class HealthFragment extends Fragment {

    public int count = 0;
    //TextView txt;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    // метод для отображения  health_layout во фрагменте HealthFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.health_layout, container, false);

        // кнопка Обновить данные
        Button btnUpdateData = (Button) view.findViewById(R.id.btnUpdateData); // объявляем кнопку
        btnUpdateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityMainFragment activityMainFragment = new ActivityMainFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(activityMainFragment);
            }
        });

        // кнопка +
        Button btn_plus = (Button) view.findViewById(R.id.btn_plus); // объявляем кнопку
        //txt = (TextView) view.findViewById();
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
            }
        });

        return view;
    }

    public void display(int n) {

    }


}