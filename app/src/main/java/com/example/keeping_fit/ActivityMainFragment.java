package com.example.keeping_fit;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ActivityMainFragment extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    // метод для отображения  health_layout во фрагменте HealthFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basic_info, container, false);

        // кнопка Продолжить
        Button btnСntToMainMenu = (Button) view.findViewById(R.id.btnСntToMainMenu); // объявляем кнопку
        btnСntToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HealthFragment healthFragment = new HealthFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(healthFragment);
            }
        });

        // кнопка Пропустить
        Button btnSkipToMainMenu = (Button) view.findViewById(R.id.btnSkipToMainMenu); // объявляем кнопку
        btnSkipToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HealthFragment healthFragment = new HealthFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(healthFragment);
            }
        });


        return view;
    }
}