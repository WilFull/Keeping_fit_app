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


public class HealthFragment extends Fragment {

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
                BasicInfoFragment basicInfoFragment = new BasicInfoFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(basicInfoFragment);
            }
        });

        return view;
    }


}